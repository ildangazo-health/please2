package com.cookandroid.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.helloandroid.model.User;
import com.cookandroid.helloandroid.retrofit.RetrofitService;
import com.cookandroid.helloandroid.retrofit.UserAPI;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class JoinActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join);
        initializeComponents();
    }

    private void initializeComponents() {
        EditText inputEditID = findViewById(R.id.editText_id);
        EditText inputEditPassword = findViewById(R.id.editText_pw);
        EditText inputEditEmail = findViewById(R.id.editText_email);

        Button buttonSave = findViewById(R.id.button_join);

        RetrofitService retrofitService = new RetrofitService();
        UserAPI userAPI = retrofitService.getRetrofit().create(UserAPI.class);

        buttonSave.setOnClickListener(view -> {
            String id = inputEditID.getText().toString().trim();
            String password = inputEditPassword.getText().toString().trim();
            String email = inputEditEmail.getText().toString().trim();

            if (id.isEmpty() || password.isEmpty() || email.isEmpty()) {
                Toast.makeText(JoinActivity.this, "모든 필드를 입력해 주세요", Toast.LENGTH_LONG).show();
                return;
            }

            User user = new User();
            user.setId(id);
            user.setPassword(password);
            user.setEmail(email);

            userAPI.save(user).enqueue(new Callback<User>() {
                @Override
                public void onResponse(Call<User> call, Response<User> response) {
                    Toast.makeText(JoinActivity.this, "Save Success", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(JoinActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // 현재 액티비티를 종료하여 뒤로 가기 시 돌아오지 않도록 함
                }

                @Override
                public void onFailure(Call<User> call, Throwable t) {
                    Toast.makeText(JoinActivity.this, "Save failed", Toast.LENGTH_LONG).show();
                    Logger.getLogger(JoinActivity.class.getName()).log(Level.SEVERE, "Error occurred" + t.getMessage(), t);
                }
            });
        });
    }
}
