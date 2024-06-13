package com.cookandroid.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;

public class CheckActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checklist);

        Button submitButton = findViewById(R.id.button_submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedCount = getCheckedCount();
                Intent intent = new Intent(CheckActivity.this, ListActivity.class);
                intent.putExtra("checkedCount", checkedCount);
                startActivity(intent);
            }
        });
    }

    private int getCheckedCount() {
        int count = 0;
        int[] checkBoxIds = {
                R.id.checkBox1, R.id.checkBox2, R.id.checkBox3,
                R.id.checkBox4, R.id.checkBox5, R.id.checkBox6,
                R.id.checkBox7, R.id.checkBox8, R.id.checkBox9,
                R.id.checkBox10, R.id.checkBox11
        };

        for (int id : checkBoxIds) {
            CheckBox checkBox = findViewById(id);
            if (checkBox.isChecked()) {
                count++;
            }
        }
        return count;
    }
}
