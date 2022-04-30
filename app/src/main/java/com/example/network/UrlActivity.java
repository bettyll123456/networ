package com.example.network;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class UrlActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        WebView webView = findViewById(R.id.webView);
        //webView.loadUrl("http://www.baidu.com");
        webView.loadUrl("http://www.gdpu.edu.cn");

        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
    }
}
