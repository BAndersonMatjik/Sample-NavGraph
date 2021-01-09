package com.bmajik.sample_navgraph;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bmajik.sample_navgraph.databinding.TwoFragmentBinding;

public class TwoFragment extends Fragment {

    private TwoViewModel mViewModel;

    public static TwoFragment newInstance() {
        return new TwoFragment();
    }


    private TwoFragmentBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = TwoFragmentBinding.inflate(inflater, container, false);

        binding.btnMoveToFragment.setOnClickListener(v -> {
            NavDirections action = TwoFragmentDirections.actionTwoFragmentToThreeFragment();
            NavHostFragment.findNavController(this).navigate(action);
        });

        binding.btnMoveToActivity.setOnClickListener(v -> {
            Intent i = new Intent(requireActivity(), MainActivity.class);
            startActivity(i);
            //using require activity for null safe yak :)
            requireActivity().finish();
        });


        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(TwoViewModel.class);
        // TODO: Use the ViewModel
    }

}