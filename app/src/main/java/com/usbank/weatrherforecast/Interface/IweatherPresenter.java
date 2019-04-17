package com.usbank.weatrherforecast.Interface;

import com.usbank.weatrherforecast.model.WeatherResponse;

import io.reactivex.Observable;
import io.reactivex.observers.DisposableObserver;

/**
 * Created by madhu on 4/13/19.
 */

public interface IweatherPresenter {
    void getWeather(double lat, double lang);
    DisposableObserver<WeatherResponse> getWeatherObs();
}
