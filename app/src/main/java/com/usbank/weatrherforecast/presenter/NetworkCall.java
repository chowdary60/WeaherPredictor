package com.usbank.weatrherforecast.presenter;

import android.util.Log;

import com.usbank.weatrherforecast.Interface.IAPIInterface;
import com.usbank.weatrherforecast.model.WeatherResponse;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by madhu on 4/13/19.
 */

public class NetworkCall {


    public Observable<WeatherResponse> getWeatherData(double lat, double lang) {

        return APIClient.getRetrofit().create(IAPIInterface.class)
                .getCurrentWeather(lat,lang)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
