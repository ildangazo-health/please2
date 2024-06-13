package com.cookandroid.helloandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
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

    }

    @Override
    public int getItemCount() {
        return checkupList.size(); // userList 크기 반환
    }

}
