package com.dev.exch22.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev.exch22.APIService.API_Service;
import com.dev.exch22.Adapter.Matches_Adapter;
import com.dev.exch22.R;
import com.dev.exch22.RetrofitInstance;

public class BlankFragment extends Fragment {
    API_Service myService;
    RecyclerView recyclerView;
    Matches_Adapter adapter;
    public BlankFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d("myTag", "oBlankFrtagment ");

       View view =inflater.inflate(R.layout.fragment_blank, container, false);
        myService= RetrofitInstance.getInstance().create(API_Service.class);
        recyclerView = view.findViewById(R.id.recyclerView);
     return view;
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}