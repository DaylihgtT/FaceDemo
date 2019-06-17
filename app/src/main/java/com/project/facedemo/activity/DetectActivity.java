package com.project.facedemo.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.project.facedemo.MyImageView;
import com.project.facedemo.R;
import com.project.facedemo.entity.BeautifulImgBean;
import com.project.facedemo.entity.DetectImagBean;
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

public class DetectActivity extends AppCompatActivity {

    private Map<String, Object> result;
    private Button btnBeautifulShow;
    private Button btnKeyPointShow;
    private TextView ageNum;
    private TextView peopleTypeNum;
    private TextView sexNum;
    private SeekBar smailNum;
    private Paint mPaint;
    private ImageView imgDetectResult;
    private static int DEVICE_DENSITY_DPI;
    private String saveImgCache =  "/storage/emulated/0/cache/imgCache";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detect);
        init();
        initView();
        initListener();
    }

    private void initListener() {
        btnBeautifulShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String baseCode = "";
                String url = "https://api-cn.faceplusplus.com/facepp/v1/beautify";
                HashMap<String, Object> beautifulReqMap = new HashMap<>();
                final Map<String, Object> resultMap = new HashMap<>();
                String filePath = saveImgCache + "/testImg1.jpg";
                Log.d("—ZRT—", filePath + "----->>");
                try {
                    baseCode = FileUtil.encodeBase64File(filePath);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                beautifulReqMap.put("api_key", "QdDi-tndO4cmK1q8psfxNfPlheBdLB2C");
                beautifulReqMap.put("api_secret", "ZRHkswx29qdtYF9yz4qgbioiZY4iu7wg");
                if (!TextUtils.isEmpty(baseCode)) {
                    beautifulReqMap.put("image_base64", baseCode);
                } else {
                    Log.d("—ZRT—", "base64为空");
                }
                ObserverOnNextListener<BeautifulImgBean> listener = new ObserverOnNextListener<BeautifulImgBean>() {
                    @Override
                    public void onNext(BeautifulImgBean beautifulImgBean) {
                        Log.d("—ZRT—", beautifulImgBean.toString());
                        String result = beautifulImgBean.getResult();
                        try {
                            FileUtil.decoderBase64File(result,saveImgCache+"newImage.jpg");
                            Bitmap bitmapFromFile = FileUtil.getBitmapFromFile(saveImgCache + "newImage.jpg");
                            resultMap.put("bitmap",bitmapFromFile);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        Intent intent = new Intent(DetectActivity.this, BeautifulActivity.class);
                        intent.putExtra("result", (Serializable) resultMap);
                        startActivity(intent);
                    }
                };
                ApiMethods.getBeautifulImageResult(new MyObserver<BeautifulImgBean>(DetectActivity.this, listener),generateRequestBody(beautifulReqMap));
            }
        });
    }

    private void init() {
        Intent intent = getIntent();
        result = (Map<String, Object>) intent.getSerializableExtra("result");
        DisplayMetrics metrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager)getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        windowManager.getDefaultDisplay().getMetrics(metrics);
        DEVICE_DENSITY_DPI = metrics.densityDpi;
    }

    private void initView() {
        btnBeautifulShow = findViewById(R.id.btn_beautiful_show);
        btnKeyPointShow = findViewById(R.id.btn_key_point_show);
        ageNum = findViewById(R.id.detect_result_age_num);
        peopleTypeNum = findViewById(R.id.detect_result_people_type_num);
        sexNum = findViewById(R.id.detect_result_sex_num);
        smailNum = findViewById(R.id.detect_result_smail_seekbar);
        imgDetectResult = findViewById(R.id.img_show_detect_result);
        dealData();
    }

    private void dealData() {
        int height = (int) result.get("height");
        int width = (int) result.get("width");
        int leftTop_Y = (int) result.get("leftTop_Y");
        int leftTop_X = (int) result.get("leftTop_X");
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test_img1);
        drawRectangles(bitmap,width,height,leftTop_X,leftTop_Y);
        ageNum.setText(result.get("age")+"");
        String gender = (String) result.get("ethnicity");
        if (gender.equals("ASIAN")) {
            peopleTypeNum.setText("亚洲人");
        }else if (gender.equals("WHITE")){
            peopleTypeNum.setText("白种人");
        }else if (gender.equals("BLACK")){
            peopleTypeNum.setText("黑种人");
        }
        String sex = (String) result.get("gender");
        if (sex.equals("Male")){
            sexNum.setText("男人");
        }else {
            sexNum.setText("女人");
        }
        double smail = (double) result.get("smail");
        int i = new Double(smail).intValue();
        Log.d("—ZRT—",i+"");
        smailNum.setProgress(i);
    }

    private void drawRectangles(Bitmap imageBitmap, int width, int height, int leftTopX, int leftTopY) {
        int left, top, right, bottom;
        Bitmap mutableBitmap = imageBitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(mutableBitmap);
        Paint paint = new Paint();
        left = convertDpToPixel(leftTopX) * 1/2;
        top = convertDpToPixel(leftTopY)* 1/2;
        right = convertDpToPixel(leftTopX + width)* 1/2;
        bottom = convertDpToPixel(leftTopY + height)* 1/2;
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);//不填充
        paint.setStrokeWidth(10); //线的宽度
        canvas.drawRect(new Rect(left,top,right,bottom), paint);
        imgDetectResult.setImageBitmap(mutableBitmap);//img: 定义在xml布局中的ImagView控件
    }

    private int convertDpToPixel(float dp) {
        return (int) (dp * (DEVICE_DENSITY_DPI / 160f));
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

}
