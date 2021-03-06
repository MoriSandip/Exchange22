package com.dev.exch22.Activity;

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

import com.dev.exch22.Exchange22_FacebookAds;
import com.dev.exch22.R;
import com.dev.exch22.databinding.ActivityLegalityBinding;
import com.facebook.ads.AdView;

public class Exchange22_LegalityActivity extends AppCompatActivity {
ActivityLegalityBinding binding;
    private AdView adView;
    ImageView imageView14,imageView15,imageView16,imageView17,imageView18;
    CardView cardView,cardView1,cardView2,cardView3,cardView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLegalityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Legality Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        new Exchange22_FacebookAds().banner(getApplicationContext(),binding.adView);

        imageView14 = findViewById(R.id.imageView14);
        imageView15 = findViewById(R.id.imageView15);
        imageView16 = findViewById(R.id.imageView16);
        imageView17 = findViewById(R.id.imageView17);
        imageView18 = findViewById(R.id.imageView18);
        cardView = findViewById(R.id.cardView21);
        cardView1 = findViewById(R.id.cardView22);
        cardView2 = findViewById(R.id.cardView23);
        cardView3 = findViewById(R.id.cardView24);
        cardView4 = findViewById(R.id.cardView25);




        imageView14.setOnClickListener(new View.OnClickListener() {
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
        });
        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( cardView1.getVisibility() == View.VISIBLE) {


                    TransitionManager.beginDelayedTransition(cardView1, new AutoTransition());

                    cardView1.setVisibility(View.GONE);
                    imageView15.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {

                    TransitionManager.beginDelayedTransition(cardView1, new AutoTransition());

                    cardView1.setVisibility(View.VISIBLE);

                    imageView15.setImageResource(R.drawable.ic_bottom_foreground);


                }
            }
        });
        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( cardView2.getVisibility() == View.VISIBLE) {


                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());

                    cardView2.setVisibility(View.GONE);
                    imageView16.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {

                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());

                    cardView2.setVisibility(View.VISIBLE);

                    imageView16.setImageResource(R.drawable.ic_bottom_foreground);


                }
            }
        });
        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( cardView3.getVisibility() == View.VISIBLE) {


                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());

                    cardView3.setVisibility(View.GONE);
                    imageView17.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {

                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());

                    cardView3.setVisibility(View.VISIBLE);

                    imageView17.setImageResource(R.drawable.ic_bottom_foreground);


                }
            }
        });
        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( cardView4.getVisibility() == View.VISIBLE) {


                    TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());

                    cardView4.setVisibility(View.GONE);
                    imageView18.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {

                    TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());

                    cardView4.setVisibility(View.VISIBLE);

                    imageView18.setImageResource(R.drawable.ic_bottom_foreground);


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

    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }

}

/*

*/