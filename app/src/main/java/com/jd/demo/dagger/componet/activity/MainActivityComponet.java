package com.jd.demo.dagger.componet.activity;

import com.jd.demo.MainActivity;
import com.jd.demo.dagger.module.activity.MainActivityModule;

import dagger.Component;

/**
 * Created by lenovo on 2017/3/8.
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponet {
    void in(MainActivity activity);
}
