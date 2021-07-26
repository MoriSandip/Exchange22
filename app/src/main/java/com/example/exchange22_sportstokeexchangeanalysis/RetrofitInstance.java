package com.example.exchange22_sportstokeexchangeanalysis;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    public static Retrofit retrofit=null;

    public static Retrofit getInstance() {
        if (retrofit==null){
             retrofit = new Retrofit.Builder()
                    .baseUrl("https://www.cricapi.com/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }


}
