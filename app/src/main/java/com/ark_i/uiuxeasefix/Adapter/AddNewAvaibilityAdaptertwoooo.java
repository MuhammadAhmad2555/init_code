package com.ark_i.uiuxeasefix.Adapter;

import android.app.TimePickerDialog;
import android.content.Context;
import android.icu.util.Calendar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import android.widget.TextView;

import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.ark_i.uiuxeasefix.Model_classes.classcheck2;
import com.ark_i.uiuxeasefix.R;

import java.util.ArrayList;

public class AddNewAvaibilityAdaptertwoooo extends RecyclerView.Adapter<AddNewAvaibilityAdaptertwoooo.MyViewHolder> {
    String timefrom = " 67",tometo="67";

    private int selectedHour, selectedMinute;

    public AddNewAvaibilityAdaptertwoooo(Context context, ArrayList<classcheck2> list) {
        this.context = context;
        this.list = list;
    }

    Context context;
    ArrayList<classcheck2> list;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout2chcek,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        classcheck2 model = list.get(position);


    holder.from.setText(model.getFrom());
    holder.to.setText(model.getTo());
    holder.from.setOnClickListener(v -> {
        final Calendar calendar = Calendar.getInstance();
        selectedHour = calendar.get(Calendar.HOUR_OF_DAY);
        selectedMinute = calendar.get(Calendar.MINUTE);

        // Create and show the TimePickerDialog
        TimePickerDialog timePickerDialog = new TimePickerDialog(context,
                (view, hourOfDay, minute) -> {
                    // Update the selected time
                    selectedHour = hourOfDay;
                    selectedMinute = minute;

                    // Format and display the selected time
                    timefrom = String.format("%02d:%02d", selectedHour, selectedMinute);
                    holder.from.setText(timefrom);
                },
                selectedHour, selectedMinute, true // 24-hour format
        );

        timePickerDialog.show();
    });
    holder.to.setOnClickListener(v -> {
        final Calendar calendar = Calendar.getInstance();
        selectedHour = calendar.get(Calendar.HOUR_OF_DAY);
        selectedMinute = calendar.get(Calendar.MINUTE);

        // Create and show the TimePickerDialog
        TimePickerDialog timePickerDialog = new TimePickerDialog(context,
                (view, hourOfDay, minute) -> {
                    // Update the selected time
                    selectedHour = hourOfDay;
                    selectedMinute = minute;

                    // Format and display the selected time
                    tometo = String.format("%02d:%02d", selectedHour, selectedMinute);
                    holder.to.setText(tometo);
                },
                selectedHour, selectedMinute, true // 24-hour format
        );

        timePickerDialog.show();
    });
    holder.button.setOnClickListener(v -> {

        if(timefrom.isEmpty() || tometo.isEmpty()){
            Toast.makeText(context, "FILLED THE FEILDS" +timefrom + tometo, Toast.LENGTH_SHORT).show();
        }else {
            holder.simpletextone.setVisibility(View.VISIBLE);
            holder.simpletexttwo.setVisibility(View.VISIBLE);
            holder.textfeildfrom.setVisibility(View.VISIBLE);
            holder.textfeildto.setVisibility(View.VISIBLE);
            holder.textfeildfrom.setText(timefrom);
            holder.textfeildto.setText(tometo);
        }




    });

    Toast.makeText(context, "list size"+list.size(), Toast.LENGTH_SHORT).show();

















    }

    @Override
    public int getItemCount() {
        return list.size();
    }




    static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView from,to,simpletextone,simpletexttwo,textfeildfrom,textfeildto;
        Button button;




        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            from =itemView.findViewById(R.id.fromTimeInput);
            to = itemView.findViewById(R.id.toTimeInput);
            button = itemView.findViewById(R.id.saveButton);

            simpletextone = itemView.findViewById(R.id.simpletext1);
            simpletexttwo = itemView.findViewById(R.id.simpletext2);

            textfeildfrom = itemView.findViewById(R.id.fromTimeInputtexttt);
            textfeildto = itemView.findViewById(R.id.toTimeInputtextt);







        }
    }

}
