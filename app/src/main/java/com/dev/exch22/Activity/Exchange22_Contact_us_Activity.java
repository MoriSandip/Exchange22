package com.dev.exch22.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.dev.exch22.Exchange22_FacebookAds;
import com.dev.exch22.R;
import com.dev.exch22.databinding.ActivityContactUsBinding;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;

public class Exchange22_Contact_us_Activity extends AppCompatActivity {
ActivityContactUsBinding binding;
    private AdView adView;
    ImageView native_ad_media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityContactUsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       // new FacebookAds().banner(getApplicationContext(),binding.adView);

        native_ad_media=findViewById(R.id.native_ad_media);
        AudienceNetworkAds.initialize(this);
        new Exchange22_FacebookAds().nativead(getApplicationContext(),binding.adView,native_ad_media);

        getSupportActionBar().setTitle("Contact information");
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
    } @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
}