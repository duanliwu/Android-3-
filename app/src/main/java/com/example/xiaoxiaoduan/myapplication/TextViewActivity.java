package com.example.xiaoxiaoduan.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;



/**
 * Created by xiaoxiaoduan on 2018/4/17.
 */


public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textview);

        LinearLayout ll = (LinearLayout) findViewById(R.id.textViewll);
        /* 先给父布局*/
//        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1,-1);
//        addContentView(ll, layoutParams);

        /*一般项目中不在代码里面布局*/
        android.widget.TextView text = new android.widget.TextView(this);
        text.setText("这个是代码中添加的");
        text.setTextSize(30);
        text.setBackgroundColor(Color.BLUE);
        //代码适配
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(40,0,10,10);//4个参数按顺序分别是左上右下
        text.setLayoutParams(layoutParams);
        ll.addView(text);

    }
}
