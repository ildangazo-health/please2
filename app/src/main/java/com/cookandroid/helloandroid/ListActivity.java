package com.cookandroid.helloandroid;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_result);

        // Intent로부터 체크된 항목의 개수를 받음
        int checkedCount = getIntent().getIntExtra("checkedCount", 0);

        // 체크된 항목의 개수를 표시할 TextView를 찾고 설정
        TextView resultTextView = findViewById(R.id.result_text_view); // 체크리스트 결과 페이지에 적절한 TextView의 ID를 사용
        resultTextView.setText("선택한 갯수는 " + checkedCount + "개 입니다.");
    }
}
