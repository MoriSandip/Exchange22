package com.example.exchange22_sportstokeexchangeanalysis.Fragment;

import android.content.Intent;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.exchange22_sportstokeexchangeanalysis.Activity.About_Activity;
import com.example.exchange22_sportstokeexchangeanalysis.Activity.Contact_us_Activity;
import com.example.exchange22_sportstokeexchangeanalysis.Activity.FeaturesActivity;
import com.example.exchange22_sportstokeexchangeanalysis.Activity.How_to_playMainActivity;
import com.example.exchange22_sportstokeexchangeanalysis.Activity.LegalityActivity;
import com.example.exchange22_sportstokeexchangeanalysis.Activity.Privacy_policy_Activity;
import com.example.exchange22_sportstokeexchangeanalysis.Activity.Term_and_condition_Activity;
import com.example.exchange22_sportstokeexchangeanalysis.Activity.Withdraw_Terms_Activity;
import com.example.exchange22_sportstokeexchangeanalysis.R;


public class Guide_Fragment extends Fragment {

    CardView how_to_play,feature,cardView5,cardView10,cardView6,Contact,cardView8,cardView9;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_guide_, container, false);


        how_to_play = view.findViewById(R.id.how_to_play);
        feature = view.findViewById(R.id.feature);
        cardView5 = view.findViewById(R.id.cardView5);
        cardView10 = view.findViewById(R.id.cardView10);
        cardView6 = view.findViewById(R.id.cardView6);
        Contact = view.findViewById(R.id.Contact);
        cardView8 = view.findViewById(R.id.cardView8);
        cardView9 = view.findViewById(R.id.cardView9);


        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Term_and_condition_Activity.class));
            }
        });
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Privacy_policy_Activity.class));
            }
        });

        how_to_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(getContext(), How_to_playMainActivity.class));

            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), About_Activity.class));


            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Withdraw_Terms_Activity.class));

            }
        });
        feature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), FeaturesActivity.class));



            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), LegalityActivity.class));


            }
        });
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Contact_us_Activity.class));


            }
        });




        return view;


    }
}