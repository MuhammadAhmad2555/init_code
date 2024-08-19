package com.ark_i.uiuxeasefix.Fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.ark_i.uiuxeasefix.Adapter.AddNewAvaibilityAdapter;

import com.ark_i.uiuxeasefix.Model_classes.ModelClassForAddNewAvaibility;

import com.ark_i.uiuxeasefix.R;
import com.ark_i.uiuxeasefix.databinding.FragmentAddNewavabliltyBinding;

import java.util.ArrayList;

public class AddNewavablilty extends Fragment  {
    FragmentAddNewavabliltyBinding binding;
    RecyclerView recyclerView;
    AddNewAvaibilityAdapter adapter;

    ArrayList<ModelClassForAddNewAvaibility> list;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAddNewavabliltyBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }




    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.daysadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        list = new ArrayList<>();
        adapter = new AddNewAvaibilityAdapter(getContext(), list);
        recyclerView.setAdapter(adapter);


        list.add(new ModelClassForAddNewAvaibility("ALL WEEK","",""));
        list.add(new ModelClassForAddNewAvaibility("Monday","",""));
        list.add(new ModelClassForAddNewAvaibility("Tuesday","",""));
        list.add(new ModelClassForAddNewAvaibility("Wednesday","",""));
        list.add(new ModelClassForAddNewAvaibility("Thursday","",""));
        list.add(new ModelClassForAddNewAvaibility("Friday","",""));
        list.add(new ModelClassForAddNewAvaibility("Saturaday","",""));
        list.add(new ModelClassForAddNewAvaibility("sunday","",""));
        binding.backbtn.setOnClickListener(v -> Fragment(new Avability()));










    }





    private void Fragment(Fragment fragment) {
        if(getActivity()!=null){
            FragmentManager fragmentManager =getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.Fragment_layout,fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

    }


}