package com.ark_i.uiuxeasefix.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ark_i.uiuxeasefix.Adapter.Adapter_Cancelled_jobs;

import com.ark_i.uiuxeasefix.Model_classes.ModelClassFor_Cancelled_jobs;
import com.ark_i.uiuxeasefix.R;
import com.ark_i.uiuxeasefix.databinding.FragmentCancelledJobsFragmentBinding;

import java.util.ArrayList;


public class Cancelled_jobs_fragment extends Fragment {
FragmentCancelledJobsFragmentBinding binding;
    RecyclerView recyclerView;
    ArrayList<ModelClassFor_Cancelled_jobs> list;
    Adapter_Cancelled_jobs adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCancelledJobsFragmentBinding.inflate(inflater,container,false);
        return  binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.cancelled_recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        adapter = new Adapter_Cancelled_jobs(getContext(), list);
        recyclerView.setAdapter(adapter);

    }
}