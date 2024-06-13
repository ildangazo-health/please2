package com.cookandroid.helloandroid;
import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class CheckupDetailActivity extends AppCompatActivity{
    private int bloodsugarValue,hemoglobinValue,cholesterol, fat, highCholesterol, lowCholesterol, creatinine, gfr, ast, alt, gpt,  height, weight, bodyMass, waist, sight, hearing, pressure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkup_detail);

        TextView hospitalTextView = findViewById(R.id.detailHospital);
        TextView dateTextView = findViewById(R.id.detailDate);
        TextView heightTextView = findViewById(R.id.detailHeight);
        TextView weightTextView = findViewById(R.id.detailWeight);
        TextView bodyMassTextView = findViewById(R.id.detailBodyMass);
        TextView waistTextView = findViewById(R.id.detailWaist);
        TextView sightTextView = findViewById(R.id.detailSight);
        TextView hearingTextView = findViewById(R.id.detailHearing);
        TextView pressureTextView = findViewById(R.id.detailPressure);
        TextView hemoglobinTextView = findViewById(R.id.detailHemoglobin);
        TextView bloodSugarTextView = findViewById(R.id.detailBloodSugar);
        TextView cholesterolTextView = findViewById(R.id.detailCholesterol);
        TextView fatTextView = findViewById(R.id.detailFat);
        TextView highCholesterolTextView = findViewById(R.id.detailHighCholesterol);
        TextView lowCholesterolTextView = findViewById(R.id.detailLowCholesterol);
        TextView creatinineTextView = findViewById(R.id.detailCreatinine);
        TextView gfrTextView = findViewById(R.id.detailGFR);
        TextView astTextView = findViewById(R.id.detailAST);
        TextView altTextView = findViewById(R.id.detailALT);
        TextView gptTextView = findViewById(R.id.detailGPT);


        Intent intent = getIntent();
        String hospital = intent.getStringExtra("hospital");
        String date = intent.getStringExtra("date");
        height=intent.getIntExtra("height", 0);
        weight=intent.getIntExtra("weight", 0);
        bodyMass=intent.getIntExtra("bodyMass", 0);
        waist=intent.getIntExtra("waist", 0);
        sight=intent.getIntExtra("sight", 0);
        hearing=intent.getIntExtra("hearing", 0);
        pressure=intent.getIntExtra("pressure", 0);
        hemoglobinValue = intent.getIntExtra("hemoglobin", 0);
        bloodsugarValue = intent.getIntExtra("bloodsugar", 0);
        cholesterol = intent.getIntExtra("cholesterol", 0);
        fat=intent.getIntExtra("fat", 0);
        highCholesterol =intent.getIntExtra("highCholesterol", 0);
        lowCholesterol =intent.getIntExtra("lowCholesterol", 0);
        creatinine=intent.getIntExtra("creatine", 0);
        gfr=intent.getIntExtra("gfr", 0);
        ast=intent.getIntExtra("ast", 0);
        alt=intent.getIntExtra("alt", 0);
        gpt=intent.getIntExtra("gpt", 0);



        hospitalTextView.setText("검진병원: " + hospital);
        dateTextView.setText("검진일: " + date);
        heightTextView.setText("키: " + height);
        weightTextView.setText("몸무게: " + weight);
        bodyMassTextView.setText("BMI: " + bodyMass);
        waistTextView.setText("허리둘레: " + waist);
        sightTextView.setText("시력: " + sight);
        hearingTextView.setText("청력: " + hearing);
        pressureTextView.setText("혈압: " + pressure);
        hemoglobinTextView.setText("헤모글로빈: " + hemoglobinValue);
        bloodSugarTextView.setText("혈당: " + bloodsugarValue);
        cholesterolTextView.setText("콜레스테롤: " + cholesterol);
        fatTextView.setText("지방: " + fat);
        highCholesterolTextView.setText("고콜레스테롤: " + highCholesterol);
        lowCholesterolTextView.setText("저콜레스테롤: " + lowCholesterol);
        creatinineTextView.setText("크레아티닌: " + creatinine);
        gfrTextView.setText("GFR: " + gfr);
        astTextView.setText("AST: " + ast);
        altTextView.setText("ALT: " + alt);
        gptTextView.setText("GPT: " + gpt);
    }
    
}
