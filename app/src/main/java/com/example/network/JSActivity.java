package com.example.network;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class JSActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        WebView webView = findViewById(R.id.webView);
        webView.loadUrl("http://www.baidu.com");

        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);

        //设置webview支持js代码解析
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.loadUrl("file://android_asset/alert.html");
        //webView.loadUrl("file://android_asset/jquery.html");
        //webView.loadUrl("file://android_asset/vue.html");
    }
}