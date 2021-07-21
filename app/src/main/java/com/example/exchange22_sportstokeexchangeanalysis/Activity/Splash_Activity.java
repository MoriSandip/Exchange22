package com.example.exchange22_sportstokeexchangeanalysis.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.exchange22_sportstokeexchangeanalysis.MainActivity;
import com.example.exchange22_sportstokeexchangeanalysis.R;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.ActivityAboutBinding;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.ActivitySplashBinding;

public class Splash_Activity extends AppCompatActivity {
ActivitySplashBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        },2500);
    }
}