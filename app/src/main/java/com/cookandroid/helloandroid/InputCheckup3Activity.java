package com.cookandroid.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class InputCheckup3Activity extends AppCompatActivity {

    private RadioGroup radioGroupChest;
    private RadioButton radioChestEtc;
    private EditText inputChestEtc;
    private Button buttonPrevious;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_checkup3);

        radioGroupChest = findViewById(R.id.radioGroup_chest);
        radioChestEtc = findViewById(R.id.radio_chest_etc);
        inputChestEtc = findViewById(R.id.input_chest_etc);
        buttonPrevious = findViewById(R.id.buttonPrevious);
        buttonSave = findViewById(R.id.button5);

        radioGroupChest.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_chest_etc) {
                    inputChestEtc.setVisibility(View.VISIBLE);
                } else {
                    inputChestEtc.setVisibility(View.GONE);
                }
            }
        });

        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InputCheckup3Activity.this, InputCheckup2Activity.class);
                startActivity(intent);
            }
        });

        // buttonSave 클릭 리스너는 필요에 따라 추가할 수 있습니다.
    }
}
