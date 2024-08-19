package com.ark_i.uiuxeasefix.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.ark_i.uiuxeasefix.R;
import com.ark_i.uiuxeasefix.databinding.FragmentPreviousJobsFragmentBinding;



public class previous_jobs_fragment extends Fragment
{
        FragmentPreviousJobsFragmentBinding binding;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPreviousJobsFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.previousBar.PendingBids.setSelected(true);

        ReplacFragment2(new complete_jobs_fragement());

        binding.backbtn.setOnClickListener(v -> ReplacFragment(new Navigation_Fragment()));





        binding.previousBar.CancelledJobs.setOnClickListener(v -> ReplacFragment(new Cancelled_jobs_fragment()));

        binding.previousBar.CancelledJobs.setOnClickListener(v -> ReplacFragment2(new Cancelled_jobs_fragment()));

        binding.previousBar.PendingBids.setOnClickListener(v -> ReplacFragment2(new complete_jobs_fragement()));


    }

    private void ReplacFragment(Fragment fragment) {
        if(getActivity()!=null){
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            if(fragmentManager!=null){
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.Fragment_layout,fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        }





    }

    private void ReplacFragment2(Fragment fragment) {

        if(getActivity()!=null){
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            if(fragmentManager!=null){
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.Fragment_layout2,fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        }







    }





}