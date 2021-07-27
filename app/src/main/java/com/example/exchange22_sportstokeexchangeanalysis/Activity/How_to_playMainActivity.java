package com.example.exchange22_sportstokeexchangeanalysis.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.exchange22_sportstokeexchangeanalysis.R;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.ActivityAboutBinding;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.ActivityHowToMainBinding;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class How_to_playMainActivity extends AppCompatActivity {
ActivityHowToMainBinding binding;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHowToMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        adView = new AdView(this, getString(R.string.fb_banner), AdSize.BANNER_HEIGHT_50);

        FrameLayout adContainer = (FrameLayout) findViewById(R.id.ad_view);

        adContainer.addView(adView);

        adView.loadAd();

        getSupportActionBar().setTitle("How to play");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
}