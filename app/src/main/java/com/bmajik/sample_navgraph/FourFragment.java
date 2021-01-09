package com.bmajik.sample_navgraph;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bmajik.sample_navgraph.databinding.FourFragmentBinding;

public class FourFragment extends Fragment {

    private FourViewModel mViewModel;

    public static FourFragment newInstance() {
        return new FourFragment();
    }


    FourFragmentBinding binding;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FourFragmentBinding.inflate(inflater,container,false);

        binding.btnMoveToFragment.setOnClickListener(v -> {
            NavDirections action = FourFragmentDirections.actionFourFragmentPop();
            NavHostFragment.findNavController(this).navigate(action);
        });

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FourViewModel.class);
        // TODO: Use the ViewModel
    }

}