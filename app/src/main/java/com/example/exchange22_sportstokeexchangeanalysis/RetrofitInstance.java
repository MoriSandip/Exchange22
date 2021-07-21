package com.example.exchange22_sportstokeexchangeanalysis;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    public static Retrofit retrofit=null;

    public static Retrofit getInstance() {
        if (retrofit==null){
             retrofit = new Retrofit.Builder()
                    .baseUrl("https://livescore6.p.rapidapi.com/matches/v2/")
                    // on below line we are calling add Converter
                    // factory as GSON converter factory.
                    .addConverterFactory(GsonConverterFactory.create())
                    // at last we are building our retrofit builder.
                    .build();
        }

        return retrofit;
    }


}
