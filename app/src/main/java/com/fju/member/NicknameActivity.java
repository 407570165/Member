package com.fju.member;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NicknameActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editText;
    private String name;
    boolean isChecked=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        editText = findViewById(R.id.nickname);
        name = editText.getText().toString();
        findViewById(R.id.imageView).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.imageView):
            name = editText.getText().toString();
            SharedPreferences setting = getSharedPreferences("text", MODE_PRIVATE);
            setting.edit()
                    .putString("nameId", name)
                    .commit();
            Intent intent =new Intent(this,AgeActivity.class);
            startActivityForResult(intent,11);
            setResult(RESULT_OK);
            finish();
            break;
        }
    }
    }

