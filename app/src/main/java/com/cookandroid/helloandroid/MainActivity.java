package com.cookandroid.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main); // main.xml 파일이 존재하는지 확인

        // 건강검진내역 버튼 클릭 리스너
        Button checkupListButton = findViewById(R.id.button_checkup_list); // button_checkup_list의 ID를 확인
        checkupListButton.setOnClickListener(new View.OnClickListener() { // setOnClickListener 메서드를 인식하도록 수정
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CheckupListActivity.class);
                startActivity(intent);
            }
        });

        // 생활 건강 체크리스트 버튼 클릭 리스너
        Button checkListButton = findViewById(R.id.button_check); // button_check의 ID를 확인
        checkListButton.setOnClickListener(new View.OnClickListener() { // setOnClickListener 메서드를 인식하도록 수정
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChecklistActivity.class);
                startActivity(intent);
            }
        });
    }
}
