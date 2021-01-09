package com.bmajik.sample_navgraph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bmajik.sample_navgraph.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}