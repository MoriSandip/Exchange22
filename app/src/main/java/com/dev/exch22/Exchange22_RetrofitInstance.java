package com.dev.exch22;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Exchange22_RetrofitInstance {
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
