package com.example.xiaoxiaoduan.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by xiaoxiaoduan on 2018/4/17.
 */



public class WebActivity extends AppCompatActivity{


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.webview);
         WebView webview = (WebView) findViewById(R.id.webview);
         WebSettings webSettingsOne = webview.getSettings();
        //设置自适应屏幕，两者合用
        webSettingsOne.setUseWideViewPort(true); //将图片调整到适合webview的大小
        webSettingsOne.setLoadWithOverviewMode(true); // 缩放至屏幕的大小
        //缩放操作
        webSettingsOne.setSupportZoom(true); //支持缩放，默认为true。是下面那个的前提。
        webSettingsOne.setBuiltInZoomControls(true); //设置内置的缩放控件。若为false，则该WebView不可缩放
        webSettingsOne.setDisplayZoomControls(false); //隐藏原生的缩放控件
        webview.loadUrl("https://blog.csdn.net/xiaoxiaoDlw");

    }
}