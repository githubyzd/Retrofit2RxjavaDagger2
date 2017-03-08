package com.jd.demo.dagger.module.activity;

import com.jd.demo.MainActivity;
import com.jd.demo.presenter.activity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lenovo on 2017/3/8.
 */
@Module
public class MainActivityModule {

    MainActivity activity;

    public MainActivityModule(MainActivity activity) {
        this.activity = activity;
    }

    @Provides
    MainActivityPresenter getMainActivityPresenter(){
        return new MainActivityPresenter(activity);
    }
}
