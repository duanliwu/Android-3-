package com.example.xiaoxiaoduan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import java.util.ArrayList;

public class CheckboxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);

        //用来储存选中的内容
        final ArrayList item = new ArrayList();

        final CheckBox checkBox =findViewById(R.id.checkbox0);
        final CheckBox checkBox1 =findViewById(R.id.checkbox1);
        final CheckBox checkBox2 =findViewById(R.id.checkbox2);
        final Button button = findViewById(R.id.btn);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String str = checkBox.getText().toString();
                if (checkBox.isChecked()){
                    item.add(str);

                }else
                {
                    item.remove(str);
                }
            }
        });

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String str1 = checkBox1.getText().toString();
                if (checkBox1.isChecked())
                {
                    item.add(str1);
                }else
                {
                    item.remove(str1);
                }
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String str2 = checkBox2.getText().toString();
                if (checkBox2.isChecked())
                {
                    item.add(str2);
                }else
                {
                    item.remove(str2);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = item.toString();
                Toast.makeText(CheckboxActivity.this, "你选中了"+str, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
