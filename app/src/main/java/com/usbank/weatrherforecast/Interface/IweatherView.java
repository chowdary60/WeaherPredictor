package com.usbank.weatrherforecast.Interface;

import com.usbank.weatrherforecast.model.Weather;
import com.usbank.weatrherforecast.model.WeatherResponse;

import java.util.List;

/**
 * Created by madhu on 4/13/19.
 */

public interface IweatherView {
    void dispayData(WeatherResponse weatherResponse);
    void displayHourlyWeather(List<Weather> weatherList);
}
