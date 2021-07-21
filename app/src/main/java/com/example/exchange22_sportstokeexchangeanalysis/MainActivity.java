package com.example.exchange22_sportstokeexchangeanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.exchange22_sportstokeexchangeanalysis.Adapter.FragmentAdapter;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    public static int position = -1;
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getPermission();
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.tablayout.addTab(binding.tablayout.newTab().setText("Guide"));
        binding.tablayout.addTab(binding.tablayout.newTab().setText("Matches"));

        int[] imageResId = {
                R.drawable.ic_baseline_guide,
                R.drawable.ic_profile,
        };

        for (int i = 0; i < imageResId.length; i++) {
            Objects.requireNonNull(binding.tablayout.getTabAt(i)).setIcon(imageResId[i]);
        }
        binding.tablayout.setTabGravity(TabLayout.GRAVITY_FILL);

loadFragment();

    }
    public void loadFragment() {
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());
        binding.viewpager.setAdapter(adapter);
        binding.viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tablayout));
        binding.tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

    }}
