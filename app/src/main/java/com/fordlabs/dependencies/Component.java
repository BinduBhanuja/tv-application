package com.fordlabs.dependencies;

import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@dagger.Component(modules = {ActivityBuilderModule.class, AndroidSupportInjectionModule.class})
public interface Component extends AndroidInjector<TvShowInstance> {
}
