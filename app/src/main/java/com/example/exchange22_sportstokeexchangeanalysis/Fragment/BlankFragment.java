package com.example.exchange22_sportstokeexchangeanalysis.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.exchange22_sportstokeexchangeanalysis.APIService.API_Service;
import com.example.exchange22_sportstokeexchangeanalysis.Adapter.Matches_Adapter;
import com.example.exchange22_sportstokeexchangeanalysis.Model.Demo;
import com.example.exchange22_sportstokeexchangeanalysis.R;
import com.example.exchange22_sportstokeexchangeanalysis.RetrofitInstance;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class BlankFragment extends Fragment {
    API_Service myService;
    RecyclerView recyclerView;
    Matches_Adapter adapter;
    public  List<Demo> versionList = new ArrayList<>();
    public BlankFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("myTag", "oBlankFrtagment ");

       View view =inflater.inflate(R.layout.fragment_blank, container, false);
        myService= RetrofitInstance.getInstance().create(API_Service.class);
        recyclerView = view.findViewById(R.id.recyclerView);
        final Gson gson = new Gson();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://livescore6.p.rapidapi.com/matches/v2/list-by-date?Category=cricket&Date=20210729")
                .method("GET", null)
                .addHeader("x-rapidapi-key", "37caee5f8fmshfb50e7c7cd6cfb1p1ab879jsnec872fe982c0")
                .addHeader("x-rapidapi-host", "livescore6.p.rapidapi.com")
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                if (response.isSuccessful()){

                    if (response.body()!=null){

                        try {
                            JSONObject jsonObject= new JSONObject(response.body().string());
                            Log.d("myTag", "onResponse123rty5ty5t: "+jsonObject);

                            Type type = new TypeToken<List<Demo>>() {}.getType();

                            versionList = gson.fromJson(jsonObject.getJSONArray("Stages").toString(), type);

                            adapter = new Matches_Adapter(versionList);
                            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                            recyclerView.setAdapter(adapter);



                        } catch (JSONException e) {
                            e.printStackTrace();

                        }

                    }
                }


            }
        });
       return view;
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}