package com.example.exchange22_sportstokeexchangeanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import com.example.exchange22_sportstokeexchangeanalysis.Activity.WebActivity;
import com.example.exchange22_sportstokeexchangeanalysis.Adapter.FragmentAdapter;
import com.example.exchange22_sportstokeexchangeanalysis.Fragment.Guide_Fragment;
import com.example.exchange22_sportstokeexchangeanalysis.Fragment.Matches_Fragment;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.androidDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               gotoWeb();
            }
        });

        FragmentAdapter viewPagerAdapter=new FragmentAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new Guide_Fragment(),"Guide");
        viewPagerAdapter.addFragments(new Matches_Fragment(),"Match");

        binding.viewpager.setAdapter(viewPagerAdapter);
        binding.tablayout.setupWithViewPager( binding.viewpager);
        binding.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb();
            }
        });
    }

    private void gotoWeb() {
        Intent intent = new Intent(MainActivity.this, WebActivity.class);
        startActivity(intent);
    }

}




