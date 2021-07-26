package com.example.exchange22_sportstokeexchangeanalysis.APIService;

import com.example.exchange22_sportstokeexchangeanalysis.Model.Demo;
import com.example.exchange22_sportstokeexchangeanalysis.Model.Match;
import com.example.exchange22_sportstokeexchangeanalysis.Model.Team;
import com.example.exchange22_sportstokeexchangeanalysis.Model.TeamOne;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API_Service {
    //@GET("list-by-date?Category=cricket&Date=20210722")
    @GET("matches")
    Call<List<Demo>> getCourse1();
    Call<List<TeamOne>> getTeam();
    Call<List<Match>> getMatch();
}
