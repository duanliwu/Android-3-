package com.example.xiaoxiaoduan.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by xiaoxiaoduan on 2018/5/2.
 */

public class EditTextActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edittext);
        LinearLayout ll = (LinearLayout) findViewById(R.id.edittextll);

        final EditText editText0 = (EditText)findViewById(R.id.editText0);
        final EditText editText1 = (EditText)findViewById(R.id.editText1);

        Button button = findViewById(R.id.btn0);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameString = editText0.getText().toString();
                String password = editText1.getText().toString();
                Toast.makeText(EditTextActivity.this, "用户名+"+nameString+"密码："+password, Toast.LENGTH_SHORT).show();
            }
        });

    }
}