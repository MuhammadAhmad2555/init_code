package com.ark_i.uiuxeasefix.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ark_i.uiuxeasefix.Model_classes.ModelClassForCompleted_jobs;
import com.ark_i.uiuxeasefix.R;

import java.util.ArrayList;

public class Adapter_Completedjobs extends RecyclerView.Adapter<Adapter_Completedjobs.MyViewHolder> {


    Context context;
    ArrayList<ModelClassForCompleted_jobs> list;

    public Adapter_Completedjobs(Context context, ArrayList<ModelClassForCompleted_jobs> list) {
        this.context = context;
        this.list = list;

        addDefaultData();
    }



    private void addDefaultData() {
        list.add(new ModelClassForCompleted_jobs(
                "New York", "Los Angeles", "Completed", "3", "2", "None", "2024-08-25 14:00", "Flight"
        ));
        list.add(new ModelClassForCompleted_jobs(
                "San Francisco", "Seattle", "Completed", "2", "1", "Baggage Included", "2024-08-26 16:30", "Train"
        ));
        list.add(new ModelClassForCompleted_jobs(
                "Chicago", "Houston", "Completed", "1", "1", "None", "2024-08-27 09:15", "Bus"
        ));
        list.add(new ModelClassForCompleted_jobs(
                "Miami", "Atlanta", "Completed", "4", "3", "Extra Baggage", "2024-08-28 11:00", "Flight"
        ));
        list.add(new ModelClassForCompleted_jobs(
                "Dallas", "Phoenix", "Completed", "5", "4", "None", "2024-08-29 18:00", "Train"
        ));
        list.add(new ModelClassForCompleted_jobs(
                "San Diego", "San Jose", "Completed", "2", "1", "None", "2024-08-30 20:00", "Bus"
        ));
        list.add(new ModelClassForCompleted_jobs(
                "Seattle", "Portland", "Completed", "3", "2", "Baggage Included", "2024-08-31 15:00", "Flight"
        ));
        list.add(new ModelClassForCompleted_jobs(
                "Orlando", "Tampa", "Completed", "1", "1", "None", "2024-09-01 10:00", "Train"
        ));
        list.add(new ModelClassForCompleted_jobs(
                "Denver", "Salt Lake City", "Completed", "4", "3", "None", "2024-09-02 09:00", "Bus"
        ));
        list.add(new ModelClassForCompleted_jobs(
                "Minneapolis", "Chicago", "Completed", "2", "2", "Extra Baggage", "2024-09-03 12:00", "Flight"
        ));
        list.add(new ModelClassForCompleted_jobs(
                "Detroit", "Cleveland", "Completed", "5", "3", "Baggage Included", "2024-09-04 14:00", "Train"
        ));
        list.add(new ModelClassForCompleted_jobs(
                "Boston", "New York", "Completed", "1", "1", "None", "2024-09-05 08:00", "Bus"
        ));
        list.add(new ModelClassForCompleted_jobs(
                "Baltimore", "Philadelphia", "Completed", "3", "2", "None", "2024-09-06 16:00", "Flight"
        ));
        list.add(new ModelClassForCompleted_jobs(
                "Washington DC", "Richmond", "Completed", "2", "1", "Extra Baggage", "2024-09-07 19:00", "Train"
        ));
        list.add(new ModelClassForCompleted_jobs(
                "Charlotte", "Raleigh", "Completed", "4", "2", "None", "2024-09-08 11:00", "Bus"
        ));
        list.add(new ModelClassForCompleted_jobs(
                "Nashville", "Memphis", "Completed", "3", "3", "Baggage Included", "2024-09-09 13:00", "Flight"
        ));



    }


    @NonNull
    @Override
    public Adapter_Completedjobs.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.carddesign,parent,false);
        return  new Adapter_Completedjobs.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_Completedjobs.MyViewHolder holder, int position) {
        ModelClassForCompleted_jobs model = list.get(position);

        holder.FromDestination.setText(model.getFromDestination());
        holder.ToDestination.setText(model.getToDestination());
        holder.numberofPeople.setText(model.getNumberofPeople());
        holder.Departsdatetime.setText(model.getDepartsdatetime());
        holder.Type.setText(model.getType());
        holder.Idk.setText(model.getIdk());
        holder.Status.setText(model.getStatus());
        holder.NumBags.setText(model.getNumBags());

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
