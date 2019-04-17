package com.usbank.weatrherforecast.presenter;

import android.util.Log;

import com.usbank.weatrherforecast.Interface.IAPIInterface;
import com.usbank.weatrherforecast.Interface.IweatherPresenter;
import com.usbank.weatrherforecast.Interface.IweatherView;
import com.usbank.weatrherforecast.model.Weather;
import com.usbank.weatrherforecast.model.WeatherResponse;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by madhu on 4/13/19.
 */

public class WeatherPresenter implements IweatherPresenter {
    IweatherView iweatherView;
    NetworkCall networkCall;
    WeatherResponse mWeatherResponse;
    List<Weather> mWeatherList;


    public WeatherPresenter(IweatherView iweatherView,NetworkCall networkCall) {
        this.iweatherView = iweatherView;
        this.networkCall = networkCall;
    }


    @Override
    public void getWeather(double lat, double lang) {
        Log.i("madhu","get weather data "+lat +"  "+lang);
      networkCall.getWeatherData(lat,lang).subscribeWith(getWeatherObs());

    }

    @Override
    public DisposableObserver<WeatherResponse> getWeatherObs() {
        return new DisposableObserver<WeatherResponse>() {

            @Override
            public void onNext(WeatherResponse weatherResponse) {
                Log.i("madhu","get weather data "+weatherResponse.getHourlyWeather().getWeatherList().get(0).getTemperature());
                mWeatherResponse= weatherResponse;
                mWeatherList = weatherResponse.getHourlyWeather().getWeatherList();

            }

            @Override
            public void onError(Throwable e) {
               Log.e("madhu","e",e);
            }

            @Override
            public void onComplete() {
                iweatherView.dispayData(mWeatherResponse);
                iweatherView.displayHourlyWeather(mWeatherList);
            }
        };
    }


}
