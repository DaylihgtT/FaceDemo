package com.project.facedemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.project.facedemo.R;

import java.io.Serializable;
import java.util.Map;

public class SearchActivity extends AppCompatActivity {

    private Button btnSearchImg;
    private Map<String,Object> resultMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Intent intent = getIntent();
        resultMap = (Map<String, Object>) intent.getSerializableExtra("result");
        initView();
    }

    private void initView() {
        btnSearchImg = findViewById(R.id.btn_search_img);
        btnSearchImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double e3 = (double) resultMap.get("e3");
            }
        });
    }
}
