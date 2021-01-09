package com.bmajik.sample_navgraph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bmajik.sample_navgraph.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {


    private ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}