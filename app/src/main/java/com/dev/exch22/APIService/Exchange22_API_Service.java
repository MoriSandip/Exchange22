package com.dev.exch22.APIService;


import com.dev.exch22.Model.Exchange22_Match;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Exchange22_API_Service {
    //@GET("list-by-date?Category=cricket&Date=20210722")
    @GET("matches")
    Call<List<Exchange22_Match>> getMatch();
}
