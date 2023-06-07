package com.example.parkradar02.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.parkradar02.R;
import com.example.parkradar02.databinding.ActivityForgetBinding;

public class ForgetActivity extends AppCompatActivity {

    private ActivityForgetBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityForgetBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBack.setOnClickListener(view -> {
            onBackPressed();
        });

    }
}