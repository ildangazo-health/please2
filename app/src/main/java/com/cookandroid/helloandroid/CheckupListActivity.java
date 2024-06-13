package com.cookandroid.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; // Button 클래스를 임포트
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cookandroid.helloandroid.adapter.CheckupAdapter;
import com.cookandroid.helloandroid.model.Checkup;
import com.cookandroid.helloandroid.model.User;
import com.cookandroid.helloandroid.retrofit.CheckupAPI;
import com.cookandroid.helloandroid.retrofit.RetrofitService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CheckupListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkup_list);
        Button registerButton = findViewById(R.id.button_register);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheckupListActivity.this, InputCheckupActivity.class);
                startActivity(intent);
            }
        });
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        loadCheckups();
    }
    private void loadCheckups(){
        RetrofitService retrofitService=new RetrofitService();
        CheckupAPI userAPI=retrofitService.getRetrofit().create(CheckupAPI.class);
        userAPI.getAllCheckups()
                .enqueue(new Callback<List<Checkup>>() {
                    @Override
                    public void onResponse(Call<List<Checkup>> call, Response<List<Checkup>> response) {
                        populateListView(response.body());
                    }

                    @Override
                    public void onFailure(Call<List<Checkup>> call, Throwable t) {
                        Toast.makeText(CheckupListActivity.this, "Failed to load users", Toast.LENGTH_LONG).show();

                    }
                });
    }

    private void populateListView(List<Checkup> checkupList){
        CheckupAdapter checkupAdapter=new CheckupAdapter(checkupList);

        recyclerView.setAdapter(checkupAdapter);

    }




    }

