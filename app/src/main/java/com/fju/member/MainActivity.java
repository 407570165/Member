package com.fju.member;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editName;
    boolean isTrue =false;
    private String a;
    int b=1;
    private EditText editAge;
    private EditText editGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.edit_name);
        editAge = findViewById(R.id.edit_age);
        editGender = findViewById(R.id.edit_gender);
        a = editName.getText().toString();
        if (b==1) {
            Intent intent = new Intent(this, NicknameActivity.class);
            startActivityForResult(intent, 10);
            b++;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==10){
            if (resultCode!=RESULT_OK){
                finish();
            }else{
                String  name =getSharedPreferences("text",MODE_PRIVATE)
                        .getString("nameId","");
                editName.setText(name);
                String  age =getSharedPreferences("text",MODE_PRIVATE)
                        .getString("ageId","");
                editAge.setText(age);
                String  gender =getSharedPreferences("text",MODE_PRIVATE)
                        .getString("genderId","");
                editGender.setText(gender);
            }
            }
        }
    }

