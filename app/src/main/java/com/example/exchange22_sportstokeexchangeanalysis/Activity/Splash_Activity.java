package com.example.exchange22_sportstokeexchangeanalysis.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.example.exchange22_sportstokeexchangeanalysis.MainActivity;
import com.example.exchange22_sportstokeexchangeanalysis.R;

public class Splash_Activity extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        lottieAnimationView=findViewById(R.id.animationView);
        new Handler().postDelayed(() -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
           // lottieAnimationView.loop(false);
            lottieAnimationView.setVisibility(View.GONE);
            finish();
        },2000);
    }
}