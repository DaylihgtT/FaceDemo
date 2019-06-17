package com.project.facedemo.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.project.facedemo.R;

import java.util.Map;

public class BeautifulActivity extends AppCompatActivity {

    private Map<String, Object> resultMap;
    private ImageView imgBeautifulResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beautiful);
        Intent intent = getIntent();
        resultMap = (Map<String, Object>) intent.getSerializableExtra("result");
        initView();
    }

    private void initView() {
        imgBeautifulResult = findViewById(R.id.img_beautiful_result);
        Bitmap bitmap = (Bitmap) resultMap.get("bitmap");
        imgBeautifulResult.setImageBitmap(bitmap);
    }
}
