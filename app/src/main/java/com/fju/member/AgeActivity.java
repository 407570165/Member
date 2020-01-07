package com.fju.member;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AgeActivity extends AppCompatActivity {

    private EditText editText;
    private String agedata;
    private Button button;
    boolean isChecked=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        editText = findViewById(R.id.edit_age);
        agedata = editText.getText().toString();
        button = findViewById(R.id.button_next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agedata = editText.getText().toString();
                SharedPreferences setting =getSharedPreferences("text",MODE_PRIVATE);
                setting.edit()
                        .putString("ageId",agedata)
                        .commit();
                Intent intent =new Intent(AgeActivity.this,GenderActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    }

