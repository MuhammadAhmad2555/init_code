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
import com.ark_i.uiuxeasefix.databinding.FragmentHomeFragmentBinding;


public class Home_fragment extends Fragment {
FragmentHomeFragmentBinding binding;

//Updated code
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding = FragmentHomeFragmentBinding.inflate(inflater,container,false);
        return  binding.getRoot();
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.UserImage.setOnClickListener(v -> FragmentReplace(new chat_fragment()));

        binding.filter.setOnClickListener(v -> FragmentReplace(new Avability()));
    }

    void FragmentReplace(Fragment fragment){
        if(getActivity()!=null){

            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.Fragment_layout,fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

        }







    }
}