package com.fordlabs.news_application;


import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

import com.fordlabs.models.TvShow;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

public class TvShowListViewModel implements LifecycleObserver {

    public TvShowsAdapter tvShowsAdapter = new TvShowsAdapter(this);
    private List<TvShowsItemViewModel> tvShowsItemViewModelList = new ArrayList<>();

    @Inject
    TvShowsItemViewModel tvShowsItemViewModel;

    @Inject
    public TvShowListViewModel(TvShowsItemViewModel tvShowsItemViewModel) {
        this.tvShowsItemViewModel = tvShowsItemViewModel;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        TvShowService tvShowService = RetrofitClientInstance.getRetrofitInstance().create(TvShowService.class);
        Call<List<TvShow>> resultResponse = tvShowService.getTvShowList();
        resultResponse.enqueue(new Callback<List<TvShow>>() {
            @Override
            public void onResponse(Call<List<TvShow>> call, Response<List<TvShow>> response) {
                generateTvShowsList(response.body());
            }

            @Override
            public void onFailure(Call<List<TvShow>> call, Throwable t) {
                Log.d(TAG, "onFailure: Data is received");
            }
        });
    }

    public void generateTvShowsList(List<TvShow> tvShowList) {
        for (int i = 0; i < tvShowList.size(); i++) {
            tvShowsItemViewModel.setTitle(tvShowList.get(i).getName());
            tvShowsItemViewModelList.add(tvShowsItemViewModel);
        }
        tvShowsAdapter.setAdapterData(tvShowsItemViewModelList);
    }
}
