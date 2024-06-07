package com.cookandroid.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.helloandroid.InputCheckup2Activity;

public class InputCheckup3Activity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButtonOther;
    private EditText editTextOther;
    private Button buttonPrevious;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_checkup3);

        radioGroup = findViewById(R.id.radioGroup);
        radioButtonOther = findViewById(R.id.radioButton8);
        editTextOther = findViewById(R.id.editTextOther);
        buttonPrevious = findViewById(R.id.buttonPrevious);
        buttonSave = findViewById(R.id.button5);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton8) {
                    editTextOther.setVisibility(View.VISIBLE);
                } else {
                    editTextOther.setVisibility(View.GONE);
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