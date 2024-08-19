package com.ark_i.uiuxeasefix.Fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ark_i.uiuxeasefix.Adapter.Adapter_Completedjobs;
import com.ark_i.uiuxeasefix.Model_classes.ModelClassForCompleted_jobs;
import com.ark_i.uiuxeasefix.R;
import com.ark_i.uiuxeasefix.databinding.FragmentPreviousJobsFragmentBinding;

import java.util.ArrayList;


public class previous_jobs_fragment extends Fragment
{

        FragmentPreviousJobsFragmentBinding binding;
    private Button currentlyUnderlinedButton = null;

    RecyclerView recyclerView;
    ArrayList<ModelClassForCompleted_jobs> list;
    Adapter_Completedjobs adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPreviousJobsFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        adapter = new Adapter_Completedjobs(getContext(), list);
        recyclerView.setAdapter(adapter);

        binding.previousBar.PendingBids.setSelected(true);

        ReplacFragment2(new complete_jobs_fragement());

        binding.previousBar.CancelledJobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReplacFragment(new Cancelled_jobs_fragment());
            }
        });

//        binding.PendingBids.setSelected(true);
//
//
//        binding.backbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ReplacFragment(new Navigation_Fragment());
//            }
//        });
//
//        binding.PendingBids.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                binding.PendingBids.setSelected(true);
//            }
//        });

        binding.previousBar.CancelledJobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                                    ReplacFragment2(new Cancelled_jobs_fragment());
            }
        });

        binding.previousBar.PendingBids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReplacFragment2(new complete_jobs_fragement());
            }
        });
//
//            binding.CancelledJobs.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    ReplacFragment(new Cancelled_jobs_fragment());
//                }
//            });


    }



    private void ReplacFragment(Fragment fragment) {

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.Fragment_layout,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }

    private void ReplacFragment2(Fragment fragment) {

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.Fragment_layout2,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }



    private void underlineButton(Button button) {
        // Remove underline from the currently underlined button, if any
        if (currentlyUnderlinedButton != null && currentlyUnderlinedButton != button) {
            currentlyUnderlinedButton.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.button_background));
        }

        // Add underline to the new button
        Drawable underline = ContextCompat.getDrawable(requireContext(), R.drawable.under_line);
        button.setBackground(underline);

        // Update the reference to the currently underlined button
        currentlyUnderlinedButton = button;
    }


}