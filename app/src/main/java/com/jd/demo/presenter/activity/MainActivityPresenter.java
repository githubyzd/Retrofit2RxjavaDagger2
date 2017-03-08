package com.jd.demo.presenter.activity;

import android.widget.TextView;

import com.jd.demo.MainActivity;
import com.jd.demo.model.net.api.NetApi;
import com.jd.demo.model.net.api.WeatherApi;
import com.jd.demo.model.net.bean.ObserveBean;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by lenovo on 2017/3/8.
 */
public class MainActivityPresenter {
    private CompositeSubscription mSubscriptions;
    private MainActivity activity;

    public MainActivityPresenter(MainActivity mainActivity) {
        this.activity = mainActivity;
    }

    public void getObserveBean(final TextView textView, String city, String key) {
        if (mSubscriptions == null) {
            mSubscriptions = new CompositeSubscription();
        }
        String id = "CH010100";
        switch (city) {
            case "北京":
                id = "CH010100";
                break;
            case "上海":
                id = "CH020100";
                break;
            case "天津":
                id = "CH030100";
                break;
            case "重庆":
                id = "CH040100";
                break;
        }
        WeatherApi retrofitService = NetApi.createRetrofitService(WeatherApi.class);
        mSubscriptions.add(retrofitService.getObserveWeather(id, key)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<ObserveBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        textView.setText(e.toString());
                    }

                    @Override
                    public void onNext(ObserveBean observeBean) {
                        textView.setText(observeBean.getData().getTq() + " " + observeBean.getData()
                                .getFx() + " " + observeBean.getData().getFl());
                    }
                }));
    }
}
