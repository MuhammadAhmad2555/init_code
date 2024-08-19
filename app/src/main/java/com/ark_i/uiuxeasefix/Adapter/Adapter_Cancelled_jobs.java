package com.ark_i.uiuxeasefix.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.ark_i.uiuxeasefix.Model_classes.ModelClassFor_Cancelled_jobs;
import com.ark_i.uiuxeasefix.R;

import java.util.ArrayList;

public class Adapter_Cancelled_jobs extends RecyclerView.Adapter<Adapter_Cancelled_jobs.MyViewHolder> {


    Context context;
    ArrayList<ModelClassFor_Cancelled_jobs> list;

    public Adapter_Cancelled_jobs(Context context, ArrayList<ModelClassFor_Cancelled_jobs> list) {
        this.context = context;
        this.list = list;

        addDefaultData();
    }



    private void addDefaultData() {
        list.add(new ModelClassFor_Cancelled_jobs(
                "New York", "Los Angeles", "CANCELLED", "3", "2", "None", "2024-08-25 14:00", "Flight"
        ));


    }


    @NonNull
    @Override
    public Adapter_Cancelled_jobs.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.carddesign,parent,false);
        return  new Adapter_Cancelled_jobs.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_Cancelled_jobs.MyViewHolder holder, int position) {
        ModelClassFor_Cancelled_jobs model = list.get(position);

        holder.FromDestination.setText(model.getFromDestination());
        holder.ToDestination.setText(model.getToDestination());
        holder.numberofPeople.setText(model.getNumberofPeople());
        holder.Departsdatetime.setText(model.getDepartsdatetime());
        holder.Type.setText(model.getType());
        holder.Idk.setText(model.getIdk());
        holder.Status.setText(model.getStatus());
        holder.NumBags.setText(model.getNumBags());

        if (model.getStatus().equals("Pending")||model.getStatus().equals("pending")||model.getStatus().equals("PENDING")){
            int to = ContextCompat.getColor(context, R.color.color_orange);
            holder.Status.setTextColor(to);

        }


        if (model.getStatus().equals("CANCELLED")) {
            int cancelledColor = ContextCompat.getColor(context, R.color.color_red);
            holder.Status.setTextColor(cancelledColor);
        }




    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView FromDestination;
        TextView ToDestination;
        TextView numberofPeople;
        TextView Idk;
        TextView Departsdatetime;
        TextView Type;
        TextView Status;
        TextView NumBags;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            FromDestination = itemView.findViewById(R.id.Fromtext);
            ToDestination = itemView.findViewById(R.id.totext);
            numberofPeople = itemView.findViewById(R.id.numofpeople);
            Idk = itemView.findViewById(R.id.idk);
            Departsdatetime = itemView.findViewById(R.id.dateandtime);
            Type = itemView.findViewById(R.id.type);
            Status = itemView.findViewById(R.id.status);
            NumBags = itemView.findViewById(R.id.numofbags);


        }
    }
}
