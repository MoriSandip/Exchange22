package com.dev.exch22.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.dev.exch22.Exchange22_FacebookAds;
import com.dev.exch22.databinding.ActivityAboutBinding;
import com.facebook.ads.AdView;

public class Exchange22_About_Activity extends AppCompatActivity {
    ActivityAboutBinding binding;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAboutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("About Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        new Exchange22_FacebookAds().banner(getApplicationContext(),binding.adView);
    }
    @Override
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
    } @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
}