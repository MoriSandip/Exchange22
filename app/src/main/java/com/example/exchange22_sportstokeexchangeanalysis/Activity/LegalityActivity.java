package com.example.exchange22_sportstokeexchangeanalysis.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;

import com.example.exchange22_sportstokeexchangeanalysis.R;

public class LegalityActivity extends AppCompatActivity {

    ImageView imageView14;
    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legality);
        imageView14 = findViewById(R.id.imageView14);
        cardView = findViewById(R.id.cardView21);
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


    }
}

/*

*/