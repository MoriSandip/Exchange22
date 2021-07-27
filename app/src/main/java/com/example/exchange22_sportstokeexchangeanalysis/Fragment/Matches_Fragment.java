package com.example.exchange22_sportstokeexchangeanalysis.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.exchange22_sportstokeexchangeanalysis.APIService.API_Service;
import com.example.exchange22_sportstokeexchangeanalysis.Adapter.Matches_Adapter;
import com.example.exchange22_sportstokeexchangeanalysis.Model.Match;
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


public class Matches_Fragment extends Fragment {
    API_Service myService;
    RecyclerView recyclerView;
    Matches_Adapter adapter;
    Thread thread;
    public  List<Match> versionList = new ArrayList<>();

    public Matches_Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         myService= RetrofitInstance.getInstance().create(API_Service.class);


        View view =inflater.inflate(R.layout.fragment_matches_, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        Log.d("myTag", "onCreateView: ");
        getCourse();

        return  view;
    }
    private void getCourse() {
        final Gson gson = new Gson();

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://www.cricapi.com/api/matches")
                .method("GET", null)
                .addHeader("apikey", "fVBqVF8QNKNhDVsuSaIl61Pngmo1")
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Toast.makeText(getContext(), "fsiled to load", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                if (response.isSuccessful()){

                    if (response.body()!=null){



                        try {
                            JSONObject jsonObject= new JSONObject(response.body().string());

                            Type type = new TypeToken<List<Match>>() {}.getType();

                            versionList = gson.fromJson(jsonObject.getJSONArray("matches").toString(), type);
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {




                                    adapter = new Matches_Adapter(versionList);
                                    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                                    recyclerView.setAdapter(adapter);
                                }
                            });





                        } catch (JSONException e) {
                            e.printStackTrace();

                        }
                    }
                }else {
                    getActivity().runOnUiThread(new Runnable() {
                        public void run() {
                            Toast.makeText(getContext(), "\"failed to load", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

            }
        });


    }



}