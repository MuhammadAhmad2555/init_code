package com.ark_i.uiuxeasefix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import com.ark_i.uiuxeasefix.Fragments.Home_fragment;
import com.ark_i.uiuxeasefix.Fragments.Navigation_Fragment;
import com.ark_i.uiuxeasefix.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Fragment(new Home_fragment());

        String Tag = "BubbleTabBarClick";

        binding.bubbleTabBar.addBubbleListener(id -> {
            if (id == R.id.home) {
                Log.d(Tag, "Home is clicked");
                Fragment(new Home_fragment());

            } else if (id == R.id.clock) {
                Log.d(Tag, "Clock is clicked");
                // Handle Clock click
            } else if (id == R.id.navigation) {
                Log.d(Tag, "Navigation is clicked");
                Fragment(new Navigation_Fragment());
            } else if (id == R.id.bell) {
                Log.d(Tag, "Logger is clicked");
                // Handle Logger click
            } else if (id == R.id.log) {
                Log.d(Tag, "Profile is clicked");
                // Handle Profile click
            }
        });


    }

    private void Fragment(Fragment fragment) {
        FragmentManager fragmentManager =getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.Fragment_layout,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}