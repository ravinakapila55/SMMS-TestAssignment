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
import com.smms_testassignment.model.CrewModel;
import com.smms_testassignment.model.InventoryModel;

import java.util.ArrayList;

public class CrewAdapter extends RecyclerView.Adapter<CrewAdapter.MyViewHolder> {

    Context context;
    ArrayList<CrewModel> list;

    public CrewAdapter(Context context, ArrayList<CrewModel> list) {
        this.context = context;
        this.list = list;
    }

    Integer color[] =
            {
                    R.color.blue,
                    R.color.light_blue_green
            };


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_crew,parent,false);
        return new CrewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.ccJob.setBackgroundResource(list.get(position).getDrawable());
        holder.tvCount.setText(list.get(position).getCrewCount());
        holder.tvTitle.setText(list.get(position).getHeading());

        for (int i = 0; i <color.length ; i++)
        {

            holder.tvCount.setTextColor(context.getResources().getColor(color[position]));
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ConstraintLayout ccJob;
        TextView tvCount;
        TextView tvTitle;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ccJob=(ConstraintLayout)itemView.findViewById(R.id.ccJob);
            tvCount=(TextView) itemView.findViewById(R.id.tvCount);
            tvTitle=(TextView) itemView.findViewById(R.id.tvTitle);
        }
    }
}
