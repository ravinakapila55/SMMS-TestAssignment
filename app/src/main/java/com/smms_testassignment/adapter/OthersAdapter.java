package com.smms_testassignment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.smms_testassignment.R;
import com.smms_testassignment.model.OthersModel;
import com.smms_testassignment.model.SheqModel;

import java.util.ArrayList;

public class OthersAdapter extends RecyclerView.Adapter<OthersAdapter.MyVuewHolder> {

    Context context;
    ArrayList<OthersModel> list;

    public OthersAdapter(Context context, ArrayList<OthersModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyVuewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_others,parent,false);
        return new OthersAdapter.MyVuewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyVuewHolder holder, int position) {

        holder.tvCount.setText(list.get(position).getCount());
        holder.tvTitle.setText(list.get(position).getTitle());
        holder.tvMesaage.setText(list.get(position).getMessage());

        holder.ivlogo.setBackgroundResource(list.get(position).getIcon());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyVuewHolder extends RecyclerView.ViewHolder {
        TextView tvCount;
        TextView tvTitle;
        TextView tvMesaage;
        ImageView ivlogo;
        public MyVuewHolder(@NonNull View itemView) {
            super(itemView);
            tvCount=(TextView)itemView.findViewById(R.id.tvCount);
            tvTitle=(TextView)itemView.findViewById(R.id.tvTitle);
            tvMesaage=(TextView)itemView.findViewById(R.id.tvMesaage);
            ivlogo=(ImageView) itemView.findViewById(R.id.ivlogo);
        }
    }
}
