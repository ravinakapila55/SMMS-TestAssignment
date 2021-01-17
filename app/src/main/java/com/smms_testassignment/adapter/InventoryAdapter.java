package com.smms_testassignment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.smms_testassignment.R;
import com.smms_testassignment.model.InventoryModel;
import java.util.ArrayList;

public class InventoryAdapter extends RecyclerView.Adapter<InventoryAdapter.MyViewHolder> {

    Context context;
    ArrayList<InventoryModel> list;


    public InventoryAdapter(Context context, ArrayList<InventoryModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_inventory,parent,false);
        return new InventoryAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.ccJob.setBackgroundResource(list.get(position).getBackground());
        holder.ivTop.setBackgroundResource(list.get(position).getDrawable());
        holder.tvCount.setText(list.get(position).getInventory_count());
        holder.tvTitle.setText(list.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout ccJob;
        ImageView ivTop;
        TextView tvCount,tvTitle;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ccJob=(ConstraintLayout)itemView.findViewById(R.id.ccJob);
            ivTop=(ImageView) itemView.findViewById(R.id.ivTop);
            tvCount=(TextView) itemView.findViewById(R.id.tvCount);
            tvTitle=(TextView) itemView.findViewById(R.id.tvTitle);

        }
    }
}
