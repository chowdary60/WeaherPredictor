package com.usbank.weatrherforecast.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by madhu on 4/13/19.
 */

public class WeatherResponse {

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }


    public WeatherResponse(Weather weather, HourlyWeather hourlyWeather) {
        this.weather = weather;
        this.hourlyWeather = hourlyWeather;
    }

    @SerializedName("currently")
    @Expose
    private Weather weather;

    @SerializedName("hourly")
    @Expose
    private HourlyWeather hourlyWeather;

    public HourlyWeather getHourlyWeather() {
        return hourlyWeather;
    }

    public void setHourlyWeather(HourlyWeather hourlyWeather) {
        this.hourlyWeather = hourlyWeather;
    }



}
