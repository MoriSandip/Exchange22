package com.example.exchange22_sportstokeexchangeanalysis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.exchange22_sportstokeexchangeanalysis.Activity.WebActivity;
import com.example.exchange22_sportstokeexchangeanalysis.Adapter.FragmentAdapter;
import com.example.exchange22_sportstokeexchangeanalysis.Fragment.BlankFragment;
import com.example.exchange22_sportstokeexchangeanalysis.Fragment.Guide_Fragment;
import com.example.exchange22_sportstokeexchangeanalysis.Fragment.Matches_Fragment;
import com.example.exchange22_sportstokeexchangeanalysis.Model.Demo;
import com.example.exchange22_sportstokeexchangeanalysis.Model.Team;
import com.example.exchange22_sportstokeexchangeanalysis.Model.TeamOne;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();
       // ViewPager viewPager=view.findViewById(R.id.viewPager);
       // TabLayout tabLayout=view.findViewById(R.id.tabLayout);
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

        int[] imageResId = {
                R.drawable.ic_baseline_guide,
                R.drawable.ic_profile,
        };
      /*  binding.tablayout.addTab(binding.tablayout.newTab().setText("Guide"));
        binding.tablayout.addTab(binding.tablayout.newTab().setText("Matches"));

        binding.tablayout.setTabGravity(TabLayout.GRAVITY_FILL);

<<<<<<< HEAD
        loadFragment();*/

      //  getCourse();
    }

    private void gotoWeb() {
        Intent intent = new Intent(MainActivity.this, WebActivity.class);
        startActivity(intent);
    }

    public void loadFragment() {
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());
        binding.viewpager.setAdapter(adapter);
        binding.viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tablayout));
        binding.tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.viewpager.setCurrentItem(tab.getPosition());
               /* loadFragment();*/
              /*  binding.viewpager.setCurrentItem(tab.getPosition());*/
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

    }



}


