package com.cookandroid.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.helloandroid.model.UserDTO;
import com.cookandroid.helloandroid.retrofit.RetrofitService;
import com.cookandroid.helloandroid.retrofit.UserAPI;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        initializeComponents();
    }

    private void initializeComponents() {
        EditText inputEditID = findViewById(R.id.edit_id);
        EditText inputEditPassword = findViewById(R.id.edit_pw);
<<<<<<< HEAD
        Button buttonSave = findViewById(R.id.button_login);
=======

        Button buttonLogin = findViewById(R.id.button_login);
>>>>>>> 732f2a18b8568a57009c3745bda02aedd323016e

        RetrofitService retrofitService = new RetrofitService();
        UserAPI userAPI = retrofitService.getRetrofit().create(UserAPI.class);

        buttonLogin.setOnClickListener(view -> {
            String id = String.valueOf(inputEditID.getText());
            String password = String.valueOf(inputEditPassword.getText());

            UserDTO userDTO = new UserDTO();
            userDTO.setId(id);
            userDTO.setPassword(password);

            userAPI.login(userDTO).enqueue(new Callback<UserDTO>() {
                @Override
<<<<<<< HEAD
                public void onResponse(Call<UserDTO> call, Response<UserDTO> response) { // 저장이 되었다면
=======
                public void onResponse(Call<UserDTO> call, Response<UserDTO> response) {
>>>>>>> 732f2a18b8568a57009c3745bda02aedd323016e
                    if (response.isSuccessful() && response.body() != null) {
                        UserDTO result = response.body();
                        if ("Login successful".equals(result.getLoginMessage())) {
                            Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
<<<<<<< HEAD
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish(); // 현재 액티비티를 종료하여 뒤로 가기 시 돌아오지 않도록 함
=======
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class); // MainActivity로 이동
                            startActivity(intent);
                            finish();
>>>>>>> 732f2a18b8568a57009c3745bda02aedd323016e
                        } else {
                            Toast.makeText(LoginActivity.this, result.getLoginMessage(), Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(LoginActivity.this, "Login failed: Invalid response", Toast.LENGTH_LONG).show();
                    }
                }

                @Override
<<<<<<< HEAD
                public void onFailure(Call<UserDTO> call, Throwable t) { // 저장이 실패했다면
=======
                public void onFailure(Call<UserDTO> call, Throwable t) {
>>>>>>> 732f2a18b8568a57009c3745bda02aedd323016e
                    Toast.makeText(LoginActivity.this, "Login failed", Toast.LENGTH_LONG).show();
                    Logger.getLogger(LoginActivity.class.getName()).log(Level.SEVERE, "Error occurred" + t.getMessage(), t);
                }
            });
        });
    }
}
