package com.example.exchange22_sportstokeexchangeanalysis.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.exchange22_sportstokeexchangeanalysis.APIService.API_Service;
import com.example.exchange22_sportstokeexchangeanalysis.Activity.LegalityActivity;
import com.example.exchange22_sportstokeexchangeanalysis.Model.Codebeautify;
import com.example.exchange22_sportstokeexchangeanalysis.R;
import com.example.exchange22_sportstokeexchangeanalysis.RetrofitInstance;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Matches_Fragment extends Fragment {
    API_Service myService;

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
        getCourse();
        return inflater.inflate(R.layout.fragment_matches_, container, false);
    }


    private void getCourse() {
        final Gson gson = new Gson();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://livescore6.p.rapidapi.com/matches/v2/list-by-date?Category=cricket&Date=20210722")
                .method("GET", null)
                .addHeader("x-rapidapi-key", "37caee5f8fmshfb50e7c7cd6cfb1p1ab879jsnec872fe982c0")
                .addHeader("x-rapidapi-host", "livescore6.p.rapidapi.com")
                .build();
        // Response response = client.newCall(request).execute();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()){
                    if (response.body()!=null){

                   // Codebeautify user = gson.fromJson(response.body().charStream(), Codebeautify.class);



                    }
                }

                Log.d("myTag", "onResponse: "+response.body());
            }
        });


        /* Call<Codebeautify> call=myService.getCourse1();
    call.enqueue(new Callback<Codebeautify>() {
        @Override
        public void onResponse(Call<Codebeautify> call, Response<Codebeautify> response) {
        if (response.isSuccessful()){
            if (response.body()!=null){
                Codebeautify codebeautify=response.body();
                Log.d("myTag", "INNN: "+codebeautify.toString());

            }
        }
            Log.d("myTag", "out: "+response.body());
            Toast.makeText(getContext(), "yesss", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onFailure(Call<Codebeautify> call, Throwable t) {
            Toast.makeText(getContext(), "nooo", Toast.LENGTH_SHORT).show();

        }
    });*/
       /* Log.d("myTag", "onResponse: ");
        // on below line we are creating a retrofit
        // builder and passing our base url

        // below line is to create an instance for our retrofit api class.
        API_Service retrofitAPI = retrofit.create(API_Service.class);
        Call<Codebeautify> call = retrofitAPI.getCourse1();
        call.enqueue(new Callback<Codebeautify>() {
            @Override
            public void onResponse(Call<Codebeautify> call, Response<Codebeautify> response) {
                if (response.isSuccessful()) {

                    Codebeautify modal = response.body();
                    Log.d("myTag", "onResponse: ");
                    Log.d("myTag", "onResponse: "+modal.toString());
                    Toast.makeText(getContext(), "had fdf ", Toast.LENGTH_SHORT).show();

                  *//*  courseNameTV.setText(modal.getCourseName());

                    courseTracksTV.setText(modal.getCourseTracks());
                    courseBatchTV.setText(modal.getCourseMode());
                    // we are using picasso to load the image from url.
                    Picasso.get().load(modal.getCourseimg()).into(courseIV);*//*
                }
            }



            @Override
            public void onFailure(Call<Codebeautify> call, Throwable t) {
                Log.d("myTag", "onResponse: ");
                // displaying an error message in toast
                Toast.makeText(getContext(), " af adf had fdf ", Toast.LENGTH_SHORT).show();
              //  Toast.makeText(MainActivity.this, "Fail to get the data..", Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}