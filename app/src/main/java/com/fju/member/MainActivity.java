package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editName;
    boolean isTrue =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.edit_name);
        String a =editName.getText().toString();
        if (a.equals(""))
            isTrue=true;
        if (isTrue){
            Intent intent =new Intent(this,NicknameActivity.class);
            startActivity(intent);
        }
    }

}
