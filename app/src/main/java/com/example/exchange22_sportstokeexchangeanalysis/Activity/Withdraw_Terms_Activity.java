package com.example.exchange22_sportstokeexchangeanalysis.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.exchange22_sportstokeexchangeanalysis.R;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.ActivityAboutBinding;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.ActivityWithdrawTermsBinding;

public class Withdraw_Terms_Activity extends AppCompatActivity {
ActivityWithdrawTermsBinding binding;
    ImageView img1,img2,img3;

    TextView textView,textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWithdrawTermsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Withdraw term - condition");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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


                    //TransitionManager.beginDelayedTransition(textView, new AutoTransition());

                    textView.setVisibility(View.GONE);
                    img1.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {

                    //TransitionManager.beginDelayedTransition(textView, new AutoTransition());

                    textView.setVisibility(View.VISIBLE);

                    img1.setImageResource(R.drawable.ic_bottom_foreground);


                }
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( textView1.getVisibility() == View.VISIBLE) {


                    //TransitionManager.beginDelayedTransition(textView, new AutoTransition());

                    textView1.setVisibility(View.GONE);
                    img2.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {

                    //TransitionManager.beginDelayedTransition(textView, new AutoTransition());

                    textView1.setVisibility(View.VISIBLE);

                    img2.setImageResource(R.drawable.ic_bottom_foreground);


                }
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( textView2.getVisibility() == View.VISIBLE) {


                    //TransitionManager.beginDelayedTransition(textView, new AutoTransition());

                    textView2.setVisibility(View.GONE);
                    img3.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {

                    //TransitionManager.beginDelayedTransition(textView, new AutoTransition());

                    textView2.setVisibility(View.VISIBLE);

                    img3.setImageResource(R.drawable.ic_bottom_foreground);


                }
            }
        });


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
}/*  imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( cardView.getVisibility() == View.VISIBLE) {


                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());

                    cardView.setVisibility(View.GONE);
                    imageView14.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {

                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());

                    cardView.setVisibility(View.VISIBLE);

                    imageView14.setImageResource(R.drawable.ic_bottom_foreground);


                }
            }
        });*/