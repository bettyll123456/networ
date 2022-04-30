package com.example.network;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_url,btn_html,btn_js;

    private Intent intent; //全局的意图

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_url = findViewById(R.id.btn_url);
        btn_html = findViewById(R.id.btn_html);
        btn_js = findViewById(R.id.btn_js);

        btn_url.setOnClickListener(this);
        btn_html.setOnClickListener(this);
        btn_js.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_url: //直接访问URL地址
                intent = new Intent(this, UrlActivity.class);
                break;
            case R.id.btn_html: //解析HTML内容
                intent = new Intent(this,HTMLActivity.class);
                break;
            case R.id.btn_js: //设置webview支持js
                intent = new Intent(this, JSActivity.class);
                break;
        }

        if(intent!=null){
            startActivity(intent);
        }
    }
}