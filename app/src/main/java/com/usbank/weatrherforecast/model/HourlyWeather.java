package com.usbank.weatrherforecast.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by madhu on 4/13/19.
 */

public class HourlyWeather {
    @SerializedName("summary")
    @Expose
    private String summary;

    @SerializedName("icon")
    @Expose
    private String icon;

    @SerializedName("data")
    @Expose
    private List<Weather> weatherList;

    public HourlyWeather(String summary, String icon, List<Weather> weatherList) {
        this.summary = summary;
        this.icon = icon;
        this.weatherList = weatherList;
    }




    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<Weather> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }




}
