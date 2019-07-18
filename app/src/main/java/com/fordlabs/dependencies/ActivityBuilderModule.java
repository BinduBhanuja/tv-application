package com.fordlabs.dependencies;

import com.fordlabs.news_application.TvShowsListActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract TvShowsListActivity tvShowsListActivity();
}
