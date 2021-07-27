package com.dev.exch22.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.dev.exch22.R;
import com.dev.exch22.databinding.ActivityAboutBinding;
import com.dev.exch22.databinding.ActivityFeaturesBinding;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class FeaturesActivity extends AppCompatActivity {
ActivityFeaturesBinding binding;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFeaturesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Feature's Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        adView = new AdView(this, getString(R.string.fb_banner), AdSize.BANNER_HEIGHT_50);

        FrameLayout adContainer = (FrameLayout) findViewById(R.id.ad_view);

        adContainer.addView(adView);

        adView.loadAd();



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