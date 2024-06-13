package com.cookandroid.helloandroid.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cookandroid.helloandroid.CheckupDetailActivity;
import com.cookandroid.helloandroid.model.Checkup;

import java.util.List;
import com.cookandroid.helloandroid.R;
public class CheckupAdapter extends RecyclerView.Adapter<CheckupHolder> {
    private List<Checkup> checkupList;
    public CheckupAdapter(List<Checkup> checkupList){
        this.checkupList=checkupList;
    }


    @NonNull
    @Override
    public CheckupHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.checkup_list_item, parent, false);
        return new CheckupHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CheckupHolder holder, int position) {
        Checkup checkup=checkupList.get(position);
        holder.hospital.setText("검진병원: "+checkup.getHospital());
        holder.date.setText("검진일: "+checkup.getDate());
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), CheckupDetailActivity.class);
            intent.putExtra("hospital", checkup.getHospital());
            intent.putExtra("date", checkup.getDate());
            intent.putExtra("height", checkup.getHeight());
            intent.putExtra("weight", checkup.getWeight());
            intent.putExtra("bodyMass", checkup.getBodyMass());
            intent.putExtra("waist", checkup.getWaist());
            intent.putExtra("sight", checkup.getSight());
            intent.putExtra("hearing", checkup.getHearing());
            intent.putExtra("pressure", checkup.getPressure());
            intent.putExtra("hemoglobin", checkup.getHemoglobin());
            intent.putExtra("bloodsugar", checkup.getCholesterol());
            intent.putExtra("cholesterol", checkup.getCholesterol());
            intent.putExtra("fat", checkup.getFat());
            intent.putExtra("highCholesterol",checkup.getHigh_cholesterol());
            intent.putExtra("lowCholesterol", checkup.getLow_cholesterol());
            intent.putExtra("creatine", checkup.getCreatinine());
            intent.putExtra("gfr", checkup.getGfr());
            intent.putExtra("ast", checkup.getAst());
            intent.putExtra("alt", checkup.getAlt());
            intent.putExtra("gpt", checkup.getGpt());
            // 필요시 다른 필드도 추가
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return checkupList.size(); // userList 크기 반환
    }

}
