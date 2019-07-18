package com.fordlabs.news_application;

import com.fordlabs.models.TvShow;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface TvShowService {

    @Headers({
            "X-RapidAPI-Key: a0155a14c1msh2e220116b4e5552p1405a5jsn396c273e9ee3"
    })

    @GET("/schedule")
    Call<List<TvShow>> getTvShowList();
}
