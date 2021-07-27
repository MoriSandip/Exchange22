package com.example.exchange22_sportstokeexchangeanalysis.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.exchange22_sportstokeexchangeanalysis.FacebookAds;
import com.example.exchange22_sportstokeexchangeanalysis.R;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.ActivityAboutBinding;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.ActivityWithdrawTermsBinding;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;

import java.util.ArrayList;
import java.util.List;

public class Withdraw_Terms_Activity extends AppCompatActivity {
    ActivityWithdrawTermsBinding binding;
    ImageView img1,img2,img3;
    private ConstraintLayout adView;
    TextView textView,textView1,textView2;
  //  NativeAd nativeAd;
    private NativeAd nativeAd;
    ImageView native_ad_media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWithdrawTermsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Withdraw term - condition");


        native_ad_media=findViewById(R.id.native_ad_media);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        AudienceNetworkAds.initialize(this);
        new FacebookAds().nativead(getApplicationContext(),binding.adView,native_ad_media);



        img1 = findViewById(R.id.imageView19);
        img2 = findViewById(R.id.imageView20);
        img3 = findViewById(R.id.imageView21);

        textView = findViewById(R.id.textView41);
        textView1 = findViewById(R.id.textView43);
        textView2 = findViewById(R.id.textView45);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( textView.getVisibility() == View.VISIBLE) {



                    textView.setVisibility(View.GONE);
                    img1.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {


                    textView.setVisibility(View.VISIBLE);

                    img1.setImageResource(R.drawable.ic_bottom_foreground);


                }
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( textView1.getVisibility() == View.VISIBLE) {



                    textView1.setVisibility(View.GONE);
                    img2.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {


                    textView1.setVisibility(View.VISIBLE);

                    img2.setImageResource(R.drawable.ic_bottom_foreground);


                }
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( textView2.getVisibility() == View.VISIBLE) {




                    textView2.setVisibility(View.GONE);
                    img3.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {



                    textView2.setVisibility(View.VISIBLE);

                    img3.setImageResource(R.drawable.ic_bottom_foreground);


                }
            }
        });


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
    }



}