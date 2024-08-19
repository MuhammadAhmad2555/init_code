package com.ark_i.uiuxeasefix.Adapter;


import android.annotation.SuppressLint;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ark_i.uiuxeasefix.Model_classes.ModelClassForAddNewAvaibility;
import com.ark_i.uiuxeasefix.Model_classes.classcheck2;
import com.ark_i.uiuxeasefix.R;


import java.util.ArrayList;

public class AddNewAvaibilityAdapter extends RecyclerView.Adapter<AddNewAvaibilityAdapter.MyViewHolder> {
RecyclerView recyclerView;
AddNewAvaibilityAdaptertwoooo addNewAvaibilityAdaptertwoooo;

ArrayList<classcheck2> list2;


    public AddNewAvaibilityAdapter(Context context, ArrayList<ModelClassForAddNewAvaibility> list) {
        this.context = context;
        this.list = list;
    }



    Context context;
    ArrayList<ModelClassForAddNewAvaibility> list;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.addrowfromto,parent,false);
        return new AddNewAvaibilityAdapter.MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        ModelClassForAddNewAvaibility model = list.get(position);
        holder.Day.setText(model.getDayname());



        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context));
        list2 = new ArrayList<>();
        addNewAvaibilityAdaptertwoooo = new AddNewAvaibilityAdaptertwoooo(context,list2);
        holder.recyclerView.setAdapter(addNewAvaibilityAdaptertwoooo);
        list2.add(new classcheck2("","",""));



        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.recyclerView.setAdapter(addNewAvaibilityAdaptertwoooo);
                addview();


            }
        });







    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    void addview(){
        list2.add(new classcheck2("","",""));
        Toast.makeText(context, "CLICKED"+list2.size(), Toast.LENGTH_SHORT).show();

    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView Day;

        CheckBox singleday,allday;

        Button button;
        RecyclerView recyclerView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Day =itemView.findViewById(R.id.dayname);
            singleday = itemView.findViewById(R.id.radiotnformonday);
            allday = itemView.findViewById(R.id.radioforallday);
            button = itemView.findViewById(R.id.addnorebtnformonday);
            recyclerView = itemView.findViewById(R.id.recyclerViewkk);






        }
    }

}
