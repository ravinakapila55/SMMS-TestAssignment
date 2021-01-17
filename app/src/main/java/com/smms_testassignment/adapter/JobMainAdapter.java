package com.smms_testassignment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.smms_testassignment.R;
import com.smms_testassignment.model.JobsModel;

import java.util.ArrayList;

public class JobMainAdapter extends RecyclerView.Adapter<JobMainAdapter.MyViewHolder> {
    Context context;
    ArrayList<JobsModel> list;

    public JobMainAdapter(Context context, ArrayList<JobsModel> list) {
        this.context = context;
        this.list = list;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_main_job,parent,false);
        return new JobMainAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        LinearLayoutManager layoutManager=new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false);
        holder.recycler_job.setNestedScrollingEnabled(false);
        holder.recycler_job.setLayoutManager(layoutManager);
        JobsAdapter mainAdapter=new JobsAdapter(context,list,JobMainAdapter.this);
        holder.recycler_job.setAdapter(mainAdapter);
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recycler_job;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            recycler_job=(RecyclerView)itemView.findViewById(R.id.recycler_job);
        }
    }
}
