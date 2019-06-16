package com.project.facedemo.activity;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.project.facedemo.R;
import com.project.facedemo.entity.DetectImagBean;
import com.project.facedemo.net.ApiMethods;
import com.project.facedemo.net.MyObserver;
import com.project.facedemo.net.ObserverOnNextListener;
import com.project.facedemo.util.FileUtil;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Button btnFaceDetect;
    private Button btnFaceCompare;
    private Button btnFaceSearch;
    private String saveImgCache;                //保存图片缓存路径

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
        init();
    }

    private void init() {
        saveImgCache = "/cache/imgCache";
        //创建缓存的文件夹
        saveImgCache = FileUtil.createFiles(saveImgCache);
        boolean exsit = FileUtil.isExsit(saveImgCache);
        Log.d("—ZRT—",exsit+"---------->>");
    }

    private void initListener() {
        btnFaceDetect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //人脸检测
            }
        });
        btnFaceCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //人脸识别
                String baseCode = "";
                HashMap<String,Object> detectReqMap = new HashMap<>();
                String filePath = saveImgCache + "/test_img11.jpg";
                try {
                    baseCode = FileUtil.encodeBase64File(filePath);

                } catch (Exception e) {
                    e.printStackTrace();
                }
                detectReqMap.put("api_key","QdDi-tndO4cmK1q8psfxNfPlheBdLB2C");
                detectReqMap.put("api_secret","ZRHkswx29qdtYF9yz4qgbioiZY4iu7wg");
                detectReqMap.put("image_base64",baseCode);
                detectReqMap.put("return_landmark",1);
                detectReqMap.put("return_attributes","gender,age,smiling,eyestatus,emotion,beauty,ethnicity");
                detectReqMap.put("beauty_score_min",0);
                detectReqMap.put("beauty_score_max",100);
                ObserverOnNextListener<DetectImagBean> listener = new ObserverOnNextListener<DetectImagBean>() {
                    @Override
                    public void onNext(DetectImagBean detectImagBean) {
                        Log.d("—ZRT—",detectImagBean.toString());
                    }
                };
                ApiMethods.getDetectImageResult(new MyObserver<DetectImagBean>(MainActivity.this,listener),detectReqMap);

            }
        });
        btnFaceSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void initView() {
        btnFaceDetect = findViewById(R.id.btn_face_detect);
        btnFaceCompare = findViewById(R.id.btn_face_compare);
        btnFaceSearch = findViewById(R.id.btn_face_search);
    }
}
