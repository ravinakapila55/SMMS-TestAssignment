package com.smms_testassignment.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.smms_testassignment.R;
import com.smms_testassignment.model.JobsModel;

import java.util.ArrayList;

public class JobsAdapter extends RecyclerView.Adapter<JobsAdapter.MyViewHolder>
{
    Context context;
    ArrayList<JobsModel> list;

    Integer color[] =
            {
                    R.color.red,
                    R.color.orange,
                    R.color.blue,
                    R.color.purple,
                    R.color.red,
                    R.color.orange,
                    R.color.blue,
                    R.color.purple
            };



    public JobsAdapter(Context context, ArrayList<JobsModel> list)
    {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_jobs,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        holder.tvJobs.setText(list.get(position).getJobs());
        holder.tvTitle.setText(list.get(position).getTitle());
        holder.ccJob.setBackgroundResource(list.get(position).getDrawable());

        for (int i = 0; i <color.length ; i++)
        {

            holder.tvJobs.setTextColor(context.getResources().getColor(color[position]));
        }



    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ConstraintLayout ccJob;
        TextView tvJobs,tvTitle;
        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            ccJob=(ConstraintLayout)itemView.findViewById(R.id.ccJob);
            tvJobs=(TextView) itemView.findViewById(R.id.tvJobs);
            tvTitle=(TextView) itemView.findViewById(R.id.tvTitle);
        }
    }
}
