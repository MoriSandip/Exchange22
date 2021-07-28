package com.dev.exch22.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.dev.exch22.Exchange22_MainActivity;
import com.dev.exch22.R;

public class Exchange22_Splash_Activity extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        lottieAnimationView=findViewById(R.id.animationView);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), Exchange22_MainActivity.class));

                lottieAnimationView.setVisibility(View.GONE);
                finish();
            }
        },2000);
    }
}