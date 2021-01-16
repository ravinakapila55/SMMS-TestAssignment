package com.smms_testassignment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.smms_testassignment.R;
import com.smms_testassignment.model.JobsModel;
import com.smms_testassignment.model.SheqModel;

import java.util.ArrayList;

public class SheqAdapter extends RecyclerView.Adapter<SheqAdapter.MyViewHolder> {

    Context context;
    ArrayList<SheqModel> list;

    public SheqAdapter(Context context, ArrayList<SheqModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_sheq,parent,false);
        return new SheqAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvheader.setText(list.get(position).getTitle());
        holder.tvOverValue.setText(list.get(position).getOverdue());
        holder.tvWindowValue.setText(list.get(position).getInwindow());
        holder.tvReminderValue.setText(list.get(position).getReminder());

        if (position==list.size()-1)
        {
            holder.ccSub.setVisibility(View.VISIBLE);
            holder.ccMain.setVisibility(View.GONE);
        }
        else {
            holder.ccSub.setVisibility(View.GONE);
            holder.ccMain.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvheader,tvOverValue,tvWindowValue,tvReminderValue;
        ConstraintLayout ccMain,ccSub;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvheader=(TextView)itemView.findViewById(R.id.tvheader);
            tvOverValue=(TextView)itemView.findViewById(R.id.tvOverValue);
            tvWindowValue=(TextView)itemView.findViewById(R.id.tvWindowValue);
            tvReminderValue=(TextView)itemView.findViewById(R.id.tvReminderValue);
            ccMain=(ConstraintLayout) itemView.findViewById(R.id.ccMain);
            ccSub=(ConstraintLayout) itemView.findViewById(R.id.ccSub);

        }
    }
}
