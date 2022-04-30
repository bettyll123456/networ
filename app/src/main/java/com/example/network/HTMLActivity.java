package com.example.network;


import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class HTMLActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);

        WebView webView = findViewById(R.id.webView);
        //webView.loadUrl("http://www.baidu.com");

        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);

        //定义字符串的构造器，将要显示的HTML内容放置在这个容器中
        StringBuilder sb = new StringBuilder();
        sb.append("<div>请选择您将要学习的课程：</div>");
        sb.append("<ul>");
        sb.append("<li>新媒体</li>");
        sb.append("<li>大数据</li>");
        sb.append("<li>人工智能</li>");
        sb.append("</li>");

        //加载数据库
        webView.loadDataWithBaseURL(null, sb.toString(), "text/html",
                "utf-8", null);
    }


}