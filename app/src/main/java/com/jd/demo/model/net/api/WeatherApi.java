package com.jd.demo.model.net.api;

import com.jd.demo.model.net.bean.ObserveBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by lenovo on 2017/3/8.
 */
public interface WeatherApi {

    @GET("observe")
    Observable<ObserveBean> getObserveWeather(@Query("city") String city, @Query("key") String key);
}
