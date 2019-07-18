package com.fordlabs.news_application;

import android.databinding.BaseObservable;

import javax.inject.Inject;

public class TvShowsItemViewModel extends BaseObservable {

    @Inject
    public TvShowsItemViewModel() {

    }

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
