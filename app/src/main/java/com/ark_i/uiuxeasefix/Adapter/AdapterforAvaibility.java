package com.ark_i.uiuxeasefix.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.ark_i.uiuxeasefix.Model_classes.ModelClassForAvability;
import com.ark_i.uiuxeasefix.R;

import java.util.ArrayList;

public class AdapterforAvaibility extends RecyclerView.Adapter<AdapterforAvaibility.MyViewHolder> {

    public AdapterforAvaibility(ArrayList<ModelClassForAvability> list, Context context) {
        this.list = list;
        this.context = context;
        adddata();
    }

    void adddata(){
        list.add(new ModelClassForAvability("Monday","11:00AM","10:20 PM","1","1"));
        list.add(new ModelClassForAvability("Tuesday","9:40AM","2:30 AM","0","1"));
        list.add(new ModelClassForAvability("Wednesday","2:40PM","10:30 PM","0","1"));

    }

    ArrayList<ModelClassForAvability> list;
    Context context;


    @NonNull
    @Override
    public AdapterforAvaibility.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cardavailabilityfroalldays,parent,false);
        return  new AdapterforAvaibility.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterforAvaibility.MyViewHolder holder, int position) {
        ModelClassForAvability model = list.get(position);
        holder.from.setText(model.getTimeFrom());
        holder.to.setText(model.getTimeTo());
        holder.day.setText(model.getDayname());

//        String[] fromTimes = model.getTimeFrom();
//        String[] toTimes = model.getTimeTo();
//        if(model.getDayname().equals("Monday")){
//            for (int i = 0; i < model.getTimeFrom().length(); i++) {
//                LinearLayout timeSlotLayout = (LinearLayout) LayoutInflater.from(context)
//                        .inflate(R.layout.ime_slot_item, holder.linearLayout, false);
//
//                TextView fromTimeTextView = timeSlotLayout.findViewById(R.id.fromTimeTextView);
//                TextView toTimeTextView = timeSlotLayout.findViewById(R.id.toTimeTextView);
//
//                fromTimeTextView.setText("From: " + model.getTimeFrom());
//                toTimeTextView.setText("To: " + model.getTimeTo());
//
//                holder.linearLayout.addView(timeSlotLayout);
//            }
//        }else if(model.getDayname().equals("Tuesday")){
//
//        } else if (model.getDayname().equals("Wednesday")) {
//            for (int i = 0; i < model.getTimeFrom().length(); i++) {
//                LinearLayout timeSlotLayout = (LinearLayout) LayoutInflater.from(context)
//                        .inflate(R.layout.ime_slot_item, holder.linearLayout, false);
//
//                TextView fromTimeTextView = timeSlotLayout.findViewById(R.id.fromTimeTextView);
//                TextView toTimeTextView = timeSlotLayout.findViewById(R.id.toTimeTextView);
//
//                fromTimeTextView.setText("From: " + model.getTimeFrom());
//                toTimeTextView.setText("To: " + model.getTimeTo());
//
//                holder.linearLayout.addView(timeSlotLayout);
//            }
//        }






        if(model.getButtonstate().equals("1")){
            holder.aSwitch.setChecked(true);
        }else {
            holder.aSwitch.setChecked(false);
        }

        if (model.getForstate().equals("1")){
            int from = ContextCompat.getColor(context, R.color.color_dark_gray);
            holder.from.setTextColor(from);
            int to = ContextCompat.getColor(context, R.color.color_dark_gray);
            holder.to.setTextColor(to);

            int fromt2 = ContextCompat.getColor(context, R.color.color_dark_gray);
            holder.from.setTextColor(fromt2);
            int tot2 = ContextCompat.getColor(context, R.color.color_dark_gray);
            holder.to.setTextColor(tot2);






            holder.imagecheck.setVisibility(View.VISIBLE);
            holder.avaltext.setVisibility(View.VISIBLE);
        }else {


            int from = ContextCompat.getColor(context, R.color.black);
            holder.titlefrom.setTextColor(from);

            int to = ContextCompat.getColor(context, R.color.black);
            holder.titileto.setTextColor(to);

            holder.imagecheck.setVisibility(View.GONE);
            holder.avaltext.setVisibility(View.GONE);
        }



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
            TextView day,from,to,avaltext,titlefrom,titileto;
            SwitchCompat aSwitch;
            ImageView imagecheck;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            day = itemView.findViewById(R.id.dayTextView);
            from = itemView.findViewById(R.id.fromTimeTextView);
            titlefrom = itemView.findViewById(R.id.fromtitle);
            titileto = itemView.findViewById(R.id.totitle);
            to = itemView.findViewById(R.id.toTimeTextView);
            aSwitch = itemView.findViewById(R.id.daySwitch);
            imagecheck = itemView.findViewById(R.id.checkimage);
            avaltext = itemView.findViewById(R.id.availableTextView);
//            linearLayout = itemView.findViewById(R.id.timeSlotsContainer);
        }
    }
}
