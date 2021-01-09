package com.bmajik.sample_navgraph;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bmajik.sample_navgraph.databinding.OneFragmentBinding;

public class OneFragment extends Fragment {

    private OneViewModel mViewModel;

    public static OneFragment newInstance() {
        return new OneFragment();
    }


    private OneFragmentBinding binding;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = OneFragmentBinding.inflate(inflater,container,false);

        binding.btnMoveToFragment.setOnClickListener(v -> {
            NavDirections action = OneFragmentDirections.actionOneFragmentToFourFragment();
            NavHostFragment.findNavController(this).navigate(action);
        });

        binding.btnMoveToActivity.setOnClickListener(v -> {
            Intent i = new Intent(requireActivity(),MainActivity2.class);
            startActivity(i);
            //using require activity for null safe yak :)
            requireActivity().finish();
        });

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(OneViewModel.class);
    }

}