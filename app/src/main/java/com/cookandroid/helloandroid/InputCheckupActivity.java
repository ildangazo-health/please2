package com.cookandroid.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class InputCheckupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_checkup);

        // 다음으로 버튼 클릭 시 input_checkup2 페이지로 이동
        Button input_checkup2_btn = findViewById(R.id.input_checkup2_btn);
        input_checkup2_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(InputCheckupActivity.this, InputCheckup2Activity.class);
                startActivity(intent);
            }
        });

        // 등록취소하기 버튼 클릭 시 list 화면으로 이동
        Button cancelButton = findViewById(R.id.buttonCancel);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InputCheckupActivity.this, CheckupListActivity.class);
                startActivity(intent);
                finish(); // 현재 액티비티를 종료하여 백 스택에서 제거
            }
        });

    }
}