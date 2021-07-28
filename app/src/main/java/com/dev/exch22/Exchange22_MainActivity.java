package com.dev.exch22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dev.exch22.Activity.Exchange22_WebActivity;
import com.dev.exch22.Adapter.Exchange22_FragmentAdapter;
import com.dev.exch22.Fragment.Exchange22_Guide_Fragment;
import com.dev.exch22.Fragment.Exchange22_Matches_Fragment;
import com.dev.exch22.databinding.ActivityMainBinding;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.material.tabs.TabLayout;

public class Exchange22_MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private InterstitialAd interstitialAd;
    InterstitialAdListener interstitialAdListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();
        AudienceNetworkAds.initialize(this);
        // ViewPager viewPager=view.findViewById(R.id.viewPager);
       // TabLayout tabLayout=view.findViewById(R.id.tabLayout);
        binding.androidDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              // gotoWeb();
               showad();
                gotoWeb();
            }
        });


        Exchange22_FragmentAdapter viewPagerAdapter=new Exchange22_FragmentAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new Exchange22_Guide_Fragment(),"Guide");
        viewPagerAdapter.addFragments(new Exchange22_Matches_Fragment(),"Match");

        binding.viewpager.setAdapter(viewPagerAdapter);
        binding.tablayout.setupWithViewPager( binding.viewpager);
        binding.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // gotoWeb();
                showad();
                gotoWeb();
            }
        });

        int[] imageResId = {
                R.drawable.ic_baseline_guide,
                R.drawable.ic_profile,
        };

    }

    private void showad() {

        interstitialAd = new InterstitialAd(this, getString(R.string.fb_interstrial));

        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {


            }

            @Override
            public void onInterstitialDismissed(Ad ad) {

            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {

                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        };


        interstitialAd.loadAd(
                interstitialAd.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener)
                        .build());
    }

    private void gotoWeb() {
        Intent intent = new Intent(Exchange22_MainActivity.this, Exchange22_WebActivity.class);
        startActivity(intent);
    }

    public void loadFragment() {
        Exchange22_FragmentAdapter adapter = new Exchange22_FragmentAdapter(getSupportFragmentManager());
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

    }
    @Override
    protected void onDestroy() {
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        super.onDestroy();
    }



}


