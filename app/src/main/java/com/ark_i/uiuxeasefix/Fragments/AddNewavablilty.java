package com.ark_i.uiuxeasefix.Fragments;

import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;

import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.ark_i.uiuxeasefix.R;
import com.ark_i.uiuxeasefix.databinding.FragmentAddNewavabliltyBinding;

public class AddNewavablilty extends Fragment  {
    FragmentAddNewavabliltyBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAddNewavabliltyBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addView();

            binding.radiotn.setOnCheckedChangeListener((buttonView, isChecked) -> {
                if (isChecked){
                    Toast.makeText(requireContext(), "IM CHECKED", Toast.LENGTH_SHORT).show();
                }else {
                    binding.addnorebtn.setSelected(false);
                }
            });






        binding.addnorebtn.setOnClickListener(v -> addView());

        binding.backbtn.setOnClickListener(v -> Fragment(new Avability()));








    }

    private void Fragment(Fragment fragment) {
        FragmentManager fragmentManager =getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.Fragment_layout,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }



    private void addView() {
        View view  = getLayoutInflater().inflate(R.layout.addrowfromto,null,false);

               Button save = view.findViewById(R.id.saveButton);

              TextView editTextfrom =view.findViewById(R.id.fromTimeInput);
        TextView editTexttp =view.findViewById(R.id.toTimeInput);


        editTextfrom.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();

            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int minute = calendar.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(
                    getContext(),
                    new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(@NonNull TimePicker view1, int hourOfDay, int minute) {
                            // Format time in 12-hour format with AM/PM
                            String time = String.format("%02d:%02d %s",
                                    hourOfDay % 12 == 0 ? 12 : hourOfDay % 12,
                                    minute,
                                    hourOfDay < 12 ? "AM" : "PM");
                            editTextfrom.setText(time);
                        }
                    },
                    hour,
                    minute,
                    true
            );
            timePickerDialog.show();
        });
        editTexttp.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();

            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int minute = calendar.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(
                    getContext(),
                    new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(@NonNull TimePicker view12, int hourOfDay, int minute) {
                            // Format time in 12-hour format with AM/PM
                            String time = String.format("%02d:%02d %s",
                                    hourOfDay % 12 == 0 ? 12 : hourOfDay % 12,
                                    minute,
                                    hourOfDay < 12 ? "AM" : "PM");

                            editTexttp.setText(time);
                        }
                    },
                    hour,
                    minute,
                    true
            );
            timePickerDialog.show();
        });

        save.setOnClickListener(v -> {
            TextView editTextfromtime = view.findViewById(R.id.fromTimeInput);
            TextView editTexttotime = view.findViewById(R.id.toTimeInput);
            String from_time = editTextfromtime.getText().toString();
            String to_time = editTexttotime.getText().toString();
            Toast.makeText(requireContext(), "TIME SELECTED "+from_time+" "+to_time, Toast.LENGTH_LONG).show();




        });
        binding.multiplyfeildslayout.addView(view);


    }




}