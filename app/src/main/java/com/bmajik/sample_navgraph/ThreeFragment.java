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

import com.bmajik.sample_navgraph.databinding.ThreeFragmentBinding;

public class ThreeFragment extends Fragment {

    private ThreeViewModel mViewModel;

    public static ThreeFragment newInstance() {
        return new ThreeFragment();
    }


    ThreeFragmentBinding binding;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = ThreeFragmentBinding.inflate(inflater,container,false);

        binding.btnMoveToFragment.setOnClickListener(v -> {
            NavDirections action = ThreeFragmentDirections.actionThreeFragmentPop();
            NavHostFragment.findNavController(this).navigate(action);
        });


        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ThreeViewModel.class);
        // TODO: Use the ViewModel
    }

}