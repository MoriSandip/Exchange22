package com.example.exchange22_sportstokeexchangeanalysis.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.exchange22_sportstokeexchangeanalysis.R;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.FragmentGuideBinding;


public class Guide_Fragment extends Fragment {
    FragmentGuideBinding binding;
 CardView cardview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentGuideBinding.inflate(inflater, container, false);

        binding.howToPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), MainActivityList.class);
                startActivity(intent);
            }
        });
        return binding.getRoot();
    }
}