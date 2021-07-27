package com.example.exchange22_sportstokeexchangeanalysis.APIService;

import com.example.exchange22_sportstokeexchangeanalysis.Model.Match;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API_Service {
    //@GET("list-by-date?Category=cricket&Date=20210722")
    @GET("matches")
    Call<List<Match>> getMatch();
}
