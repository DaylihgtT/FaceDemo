package com.project.facedemo.activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.project.facedemo.R;
import com.project.facedemo.entity.CompareImgBean;
import com.project.facedemo.entity.CreateBean;
import com.project.facedemo.entity.DetectImagBean;
import com.project.facedemo.entity.SearchImgBean;
import com.project.facedemo.net.ApiMethods;
import com.project.facedemo.net.MyObserver;
import com.project.facedemo.net.ObserverOnNextListener;
import com.project.facedemo.util.FileUtil;

import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;

public class MainActivity extends AppCompatActivity {

    private Button btnFaceDetect;
    private Button btnFaceCompare;
    private Button btnFaceSearch;
    private String saveImgCache;                //保存图片缓存路径
    private static final int REQUEST_WRITE_EXTERNAL_STORAGE = 1;
    private String face_token="";
    private String faceset_token="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkPermission();
        initView();
        initListener();
        init();
    }

    private void init() {
        saveImgCache = "/cache/imgCache";
        //创建缓存的文件夹
        saveImgCache = FileUtil.createFiles(saveImgCache);
        Log.d("—ZRT—","saveImageCache = "+saveImgCache);
        boolean exsit = FileUtil.isExsit(saveImgCache);
        Log.d("—ZRT—", exsit + "---------->>");
    }

    private void initListener() {
        btnFaceDetect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //人脸检测
                String baseCode = "";
                HashMap<String, Object> detectReqMap = new HashMap<>();
                final Map<String, Object> resultMap = new HashMap<>();
                String filePath = saveImgCache + "/testImg1.jpg";
                Log.d("—ZRT—", filePath + "----->>");
                try {
                    baseCode = FileUtil.encodeBase64File(filePath);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                detectReqMap.put("api_key", "QdDi-tndO4cmK1q8psfxNfPlheBdLB2C");
                detectReqMap.put("api_secret", "ZRHkswx29qdtYF9yz4qgbioiZY4iu7wg");
                if (!TextUtils.isEmpty(baseCode)) {
                    detectReqMap.put("image_base64", baseCode);
                } else {
                    Log.d("—ZRT—", "base64为空");
                }
                detectReqMap.put("return_landmark", 1);
                detectReqMap.put("return_attributes", "gender,age,smiling,eyestatus,emotion,beauty,ethnicity");
                detectReqMap.put("beauty_score_min", 0);
                detectReqMap.put("beauty_score_max", 100);
                ObserverOnNextListener<DetectImagBean> listener = new ObserverOnNextListener<DetectImagBean>() {
                    @Override
                    public void onNext(DetectImagBean detectImagBean) {
                        Log.d("—ZRT—", detectImagBean.toString());
                        List<DetectImagBean.FacesBean> faces = detectImagBean.getFaces();
                        for (int i = 0; i < faces.size(); i++) {
                            //获取faceToken
                            String faceToken = faces.get(i).getFace_token();
                            Log.d("—ZRT—", "face_token = " + faces.get(i).getFace_token() + " ---------->>");
                            //获取矩形框信息
                            int height = faces.get(i).getFace_rectangle().getHeight();
                            int width = faces.get(i).getFace_rectangle().getWidth();
                            int leftTop_Y = faces.get(i).getFace_rectangle().getTop();
                            int leftTop_X = faces.get(i).getFace_rectangle().getLeft();
                            Log.d("—ZRT—", "face_rectangle —— width = " + width + "，height = " + height +
                                    "，leftTop_Y = " + leftTop_Y + "，leftTop_X = " + leftTop_X +
                                    " ---------->>");
                            //获取人脸关键点坐标数组
                            DetectImagBean.FacesBean.LandmarkBean landmark = faces.get(i).getLandmark();
                            //获取属性信息
                            int age = faces.get(i).getAttributes().getAge().getValue();   //年龄
                            Log.d("—ZRT—", "age = " + age + " ---------->>");
                            String gender = faces.get(i).getAttributes().getGender().getValue();   //性别
                            Log.d("—ZRT—", "gender = " + gender + " ---------->>");
                            double smail = faces.get(i).getAttributes().getSmile().getValue();   //是否微笑
                            Log.d("—ZRT—", "smail = " + smail + " ---------->>");
                            String ethnicity = faces.get(i).getAttributes().getEthnicity().getValue();  //人种
                            Log.d("—ZRT—", "ethnicity = " + ethnicity + " ---------->>");
                            resultMap.put("faceToken", faceToken);
                            resultMap.put("height", height);
                            resultMap.put("width", width);
                            resultMap.put("leftTop_Y", leftTop_Y);
                            resultMap.put("leftTop_X", leftTop_X);
                            resultMap.put("age", age);
                            resultMap.put("gender", gender);
                            resultMap.put("smail", smail);
                            resultMap.put("ethnicity", ethnicity);
                        }
                        Intent intent = new Intent(MainActivity.this, DetectActivity.class);
                        intent.putExtra("result", (Serializable) resultMap);
                        startActivity(intent);
                    }
                };
                ApiMethods.getDetectImageResult(new MyObserver<DetectImagBean>(MainActivity.this, listener), generateRequestBody(detectReqMap));
            }
        });
        btnFaceCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //人脸对比
                String img_one = "";
                String img_two  ="";
                try {
                    img_one = FileUtil.encodeBase64File(saveImgCache + "/test_img2.jpg");
                    img_two = FileUtil.encodeBase64File(saveImgCache + "/test_img3.jpg");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                HashMap<String, Object> compareReqMap = new HashMap<>();
                compareReqMap.put("api_key","QdDi-tndO4cmK1q8psfxNfPlheBdLB2C");
                compareReqMap.put("api_secret","ZRHkswx29qdtYF9yz4qgbioiZY4iu7wg");
                compareReqMap.put("image_base64_1",img_one);
                compareReqMap.put("image_base64_2",img_two);
                ObserverOnNextListener<CompareImgBean> listener = new ObserverOnNextListener<CompareImgBean>() {
                    @Override
                    public void onNext(CompareImgBean compareImgBean) {
                        Log.d("—ZRT—",compareImgBean.toString());
                        face_token = compareImgBean.getFaces1().get(0).getFace_token();
                        createToken();
                    }
                };
                ApiMethods.getCompareImageResult(new MyObserver<CompareImgBean>(MainActivity.this,listener),generateRequestBody(compareReqMap));

            }
        });
        btnFaceSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<String, Object> searchReqMap = new HashMap<>();
                final HashMap<String, Object> resultMap = new HashMap<>();
                String img = "";
                try {
                    img = FileUtil.encodeBase64File(saveImgCache + "/test_img2.jpg");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                searchReqMap.put("api_key","QdDi-tndO4cmK1q8psfxNfPlheBdLB2C");
                searchReqMap.put("api_secret","ZRHkswx29qdtYF9yz4qgbioiZY4iu7wg");
                if (!TextUtils.isEmpty(img)) {
                    searchReqMap.put("image_base64",img);
                }else {
                    Log.d("—ZRT—","base64为空");
                }
                if (!TextUtils.isEmpty(faceset_token)) {
                    searchReqMap.put("faceset_token",faceset_token);
                }else {
                    Log.d("—ZRT—","faceset_token为空");
                }
                ObserverOnNextListener<SearchImgBean> listener = new ObserverOnNextListener<SearchImgBean>() {
                    @Override
                    public void onNext(SearchImgBean searchImgBean) {
                        Log.d("—ZRT—",searchImgBean.toString());
                        double e3 = searchImgBean.getThresholds().get_$1e3();
                        double e4 = searchImgBean.getThresholds().get_$1e4();
                        double e5 = searchImgBean.getThresholds().get_$1e5();
                        resultMap.put("e3",e3);
                        resultMap.put("e4",e4);
                        resultMap.put("e5",e5);
                        Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                        intent.putExtra("result",resultMap);
                        startActivity(intent);
                    }
                };
                ApiMethods.getSearchImageResult(new MyObserver<SearchImgBean>(MainActivity.this,listener),generateRequestBody(searchReqMap));
            }
        });
    }

    private void initView() {
        btnFaceDetect = findViewById(R.id.btn_face_detect);
        btnFaceCompare = findViewById(R.id.btn_face_compare);
        btnFaceSearch = findViewById(R.id.btn_face_search);
    }

    private void checkPermission() {
        //检查权限（NEED_PERMISSION）是否被授权 PackageManager.PERMISSION_GRANTED表示同意授权
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            //用户已经拒绝过一次，再次弹出权限申请对话框需要给用户一个解释
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission
                    .WRITE_EXTERNAL_STORAGE)) {
                Toast.makeText(this, "请开通相关权限，否则无法正常使用本应用！", Toast.LENGTH_SHORT).show();
            }
            //申请权限
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_WRITE_EXTERNAL_STORAGE);

        } else {
            Toast.makeText(this, "授权成功！", Toast.LENGTH_SHORT).show();
            Log.e("—ZRT—", "checkPermission: 已经授权！");
        }
    }

    private static HashMap<String, RequestBody> generateRequestBody(HashMap<String, Object> requestDataMap) {
        HashMap<String, RequestBody> requestBodyMap = new HashMap<>();
        for (String key : requestDataMap.keySet()) {
            String requestKey = "";
            if (requestDataMap.get(key) == null) {
                requestKey = "";
            } else {
                requestKey = String.valueOf(requestDataMap.get(key));
            }
            RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), requestKey);
            requestBodyMap.put(key, requestBody);
        }
        return requestBodyMap;
    }

    private void createToken() {
        HashMap<String, Object> createReqMap = new HashMap<>();
        createReqMap.put("api_key","QdDi-tndO4cmK1q8psfxNfPlheBdLB2C");
        createReqMap.put("api_secret","ZRHkswx29qdtYF9yz4qgbioiZY4iu7wg");
        createReqMap.put("face_tokens",face_token);
        ObserverOnNextListener<CreateBean> listener = new ObserverOnNextListener<CreateBean>() {
            @Override
            public void onNext(CreateBean createBean) {
                Log.d("—ZRT—",createBean.toString());
                faceset_token = createBean.getFaceset_token();
            }
        };
        ApiMethods.getCreateResult(new MyObserver<CreateBean>(MainActivity.this,listener),generateRequestBody(createReqMap));
    }
}
