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


import com.ark_i.uiuxeasefix.Adapter.AdapterforAvaibility;
import com.ark_i.uiuxeasefix.Model_classes.ModelClassForAvability;

import com.ark_i.uiuxeasefix.R;
import com.ark_i.uiuxeasefix.databinding.FragmentAvabilityBinding;

import java.util.ArrayList;


public class Avability extends Fragment {
FragmentAvabilityBinding binding;

AdapterforAvaibility adapter;
ArrayList<ModelClassForAvability> list;
    RecyclerView recyclerView;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAvabilityBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView= view.findViewById(R.id.setting_availabilityrecycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        adapter = new AdapterforAvaibility( list,getContext());
        recyclerView.setAdapter(adapter);







        binding.ADDAVAILABILITYBTN.setOnClickListener(v -> Fragment(new AddNewavablilty()));
        binding.backbtn.setOnClickListener(v -> Fragment(new Home_fragment()));


    }

    private void Fragment(Fragment fragment) {
        if (getActivity() != null) {
            FragmentManager fragmentManager =getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.Fragment_layout,fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }




    }
}