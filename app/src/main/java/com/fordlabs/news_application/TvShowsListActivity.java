package com.fordlabs.news_application;

import android.arch.lifecycle.LifecycleOwner;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fordlabs.news_application.databinding.ActivityTvShowListBinding;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class TvShowsListActivity extends AppCompatActivity implements LifecycleOwner {

    @Inject
    TvShowListViewModel tvShowListViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        ActivityTvShowListBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_tv_show_list);
        this.getLifecycle().addObserver(tvShowListViewModel);
        binding.setViewModel(tvShowListViewModel);
    }
}
