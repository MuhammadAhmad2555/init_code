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

import com.ark_i.uiuxeasefix.OthersAdapters.CustomInfoWindowAdapter;
import com.ark_i.uiuxeasefix.R;
import com.ark_i.uiuxeasefix.databinding.FragmentNavigationBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class Navigation_Fragment extends Fragment implements OnMapReadyCallback,GoogleMap.OnInfoWindowClickListener {
    FragmentNavigationBinding binding;
     GoogleMap mMap;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNavigationBinding.inflate(getLayoutInflater());

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }

        binding.PreviousJobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReplacFragment(new previous_jobs_fragment());
            }
        });



    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {


        mMap = googleMap;


        CustomInfoWindowAdapter adapter = new CustomInfoWindowAdapter(requireContext());
        mMap.setInfoWindowAdapter(adapter);


        LatLng location1 = new LatLng(31.466125447680547, 74.37174804329312);
        LatLng location2 = new LatLng(31.966000, 74.371800);
        LatLng location3 = new LatLng(32.16774, 74.372);



        mMap.addMarker(new MarkerOptions()
                .position(location1));

        mMap.addMarker(new MarkerOptions()
                .position(location2));

        mMap.addMarker(new MarkerOptions()
                .position(location3));



        mMap.setInfoWindowAdapter(new CustomInfoWindowAdapter(requireContext()));

        float zoomLevel = 12f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location1,zoomLevel));
    }






    private void ReplacFragment(Fragment fragment) {

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.Fragment_layout,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }

    @Override
    public void onInfoWindowClick(@NonNull Marker marker) {

    }
}