package com.example.homework1android2.Task;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.homework1android2.R;
import com.example.homework1android2.databinding.FragmentCreateTaskBinding;


public class CreateTaskFragment extends Fragment {
    private FragmentCreateTaskBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCreateTaskBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.applyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = binding.textEd.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("key", text);
                Navigation.findNavController(requireView()).navigate(R.id.taskFragment, bundle);
            }
        });

        binding.textEd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("key", binding.textEd.getText().toString());
            }
        });
    }
}