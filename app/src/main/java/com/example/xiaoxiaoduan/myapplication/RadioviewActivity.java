package com.example.xiaoxiaoduan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radioview);

        RadioGroup radioGroup = findViewById(R.id.radio0);
        final RadioButton radioButton = findViewById(R.id.radioButton0);
        final RadioButton radioButton1 = findViewById(R.id.radioButton1);
        final RadioButton radioButton2 = findViewById(R.id.radioButton2);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (radioButton.getId() == i)
                {
                    Toast.makeText(RadioviewActivity.this, "你选中第一个"+radioButton.getText(), Toast.LENGTH_SHORT).show();
                }else if (radioButton1.getId() == i)
                {
                    Toast.makeText(RadioviewActivity.this, "你选中第二个"+radioButton1.getText(), Toast.LENGTH_SHORT).show();
                }else if (radioButton2.getId() == i)
                {
                    Toast.makeText(RadioviewActivity.this, "你选中第三个"+radioButton2.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}


