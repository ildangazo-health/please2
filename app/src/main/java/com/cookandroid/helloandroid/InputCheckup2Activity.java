package com.cookandroid.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InputCheckup2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_checkup2);

        // 뒤로가기 버튼 클릭 시 InputCheckupActivity로 이동
        Button buttonPrevious = findViewById(R.id.buttonPrevious);
        buttonPrevious.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(InputCheckup2Activity.this, InputCheckupActivity.class);
                startActivity(intent);
            }
        });

        // 다음으로 버튼 클릭 시 InputCheckup3Activity로 이동
        Button buttonNext = findViewById(R.id.button2);
        buttonNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(InputCheckup2Activity.this, InputCheckup3Activity.class);
                startActivity(intent);
            }
        });
    }

}
