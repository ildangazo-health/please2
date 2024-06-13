package com.cookandroid.helloandroid.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.cookandroid.helloandroid.R;

public class CheckupHolder extends RecyclerView.ViewHolder{

    TextView hospital,date;
    public CheckupHolder(@NonNull View itemView){
        super(itemView);
        hospital = itemView.findViewById(R.id.textViewHospital);
        date = itemView.findViewById(R.id.textViewDate);

    }
}
