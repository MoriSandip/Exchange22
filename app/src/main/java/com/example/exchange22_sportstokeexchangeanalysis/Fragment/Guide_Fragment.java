package com.example.exchange22_sportstokeexchangeanalysis.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.exchange22_sportstokeexchangeanalysis.Activity.About_Activity;
import com.example.exchange22_sportstokeexchangeanalysis.Activity.FeaturesActivity;
import com.example.exchange22_sportstokeexchangeanalysis.Activity.How_to_playMainActivity;
import com.example.exchange22_sportstokeexchangeanalysis.Activity.LegalityActivity;
import com.example.exchange22_sportstokeexchangeanalysis.Activity.Withdraw_Terms_Activity;
import com.example.exchange22_sportstokeexchangeanalysis.R;


public class Guide_Fragment extends Fragment {

    CardView how_to_play,feature,cardView5,cardView10,cardView6;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_guide_, container, false);


        how_to_play = view.findViewById(R.id.how_to_play);
        feature = view.findViewById(R.id.feature);
        cardView5 = view.findViewById(R.id.cardView5);
        cardView10 = view.findViewById(R.id.cardView10);
        cardView6 = view.findViewById(R.id.cardView6);

        how_to_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(getContext(), How_to_playMainActivity.class));
                Toast.makeText(getContext(), "adgdfg", Toast.LENGTH_SHORT).show();

            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), About_Activity.class));
                Toast.makeText(getContext(), "adgdfg", Toast.LENGTH_SHORT).show();

            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Withdraw_Terms_Activity.class));
                Toast.makeText(getContext(), "adgdfg", Toast.LENGTH_SHORT).show();

            }
        });
        feature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), FeaturesActivity.class));

                Toast.makeText(getContext(), "adgdfg", Toast.LENGTH_SHORT).show();

            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), LegalityActivity.class));
                Toast.makeText(getContext(), "adgdfg", Toast.LENGTH_SHORT).show();

            }
        });




        return view;


    }
}