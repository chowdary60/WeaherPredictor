package com.usbank.weatrherforecast.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by madhu on 4/13/19.
 */

public class Weather {
    @SerializedName("temperature")
    @Expose
    private String temperature;
    @SerializedName("summary")
    @Expose
    private String summary;


    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("nearestStormDistance")
    @Expose
    private String nearestStormDistance;
    @SerializedName("nearestStormBearing")
    @Expose
    private String nearestStormBearing;
    @SerializedName("precipIntensity")
    @Expose
    private String precipIntensity;
    @SerializedName("precipProbability")
    @Expose
    private String precipProbability;
    @SerializedName("apparentTemperature")
    @Expose
    private String apparentTemperature;
    @SerializedName("dewPoint")
    @Expose
    private String  dewPoint;
    @SerializedName("humidity")
    @Expose
    private  String humidity;
    @SerializedName("pressure")
    @Expose
    private String pressure ;

    @SerializedName("windSpeed")
    @Expose
    private String windSpeed;

    @SerializedName("windGust")
    @Expose
    private String windGust ;

    @SerializedName("windBearing")
    @Expose
    private String windBearing ;

    @SerializedName("cloudCover")
    @Expose
    private String cloudCover ;

    @SerializedName("uvIndex")
    @Expose
    private String uvIndex ;

    @SerializedName("visibility")
    @Expose
    private String visibility ;

    @SerializedName("ozone")
    @Expose
    private String ozone ;

    @SerializedName("time")
    @Expose
    private String time ;





    public Weather(String temperature, String summary, String icon, String nearestStormDistance, String nearestStormBearing, String precipIntensity, String precipProbability, String apparentTemperature, String dewPoint, String humidity, String pressure, String windSpeed, String windGust, String windBearing, String cloudCover, String uvIndex, String visibility, String ozone,String time) {
        this.temperature = temperature;
        this.summary = summary;
        this.icon = icon;
        this.nearestStormDistance = nearestStormDistance;
        this.nearestStormBearing = nearestStormBearing;
        this.precipIntensity = precipIntensity;
        this.precipProbability = precipProbability;
        this.apparentTemperature = apparentTemperature;
        this.dewPoint = dewPoint;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.windGust = windGust;
        this.windBearing = windBearing;
        this.cloudCover = cloudCover;
        this.uvIndex = uvIndex;
        this.visibility = visibility;
        this.ozone = ozone;
        this.time = time;
    }


    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getNearestStormDistance() {
        return nearestStormDistance;
    }

    public void setNearestStormDistance(String nearestStormDistance) {
        this.nearestStormDistance = nearestStormDistance;
    }

    public String getNearestStormBearing() {
        return nearestStormBearing;
    }

    public void setNearestStormBearing(String nearestStormBearing) {
        this.nearestStormBearing = nearestStormBearing;
    }

    public String getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(String precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public String getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(String precipProbability) {
        this.precipProbability = precipProbability;
    }

    public String getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(String apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public String getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(String dewPoint) {
        this.dewPoint = dewPoint;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindGust() {
        return windGust;
    }

    public void setWindGust(String windGust) {
        this.windGust = windGust;
    }

    public String getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(String windBearing) {
        this.windBearing = windBearing;
    }

    public String getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(String cloudCover) {
        this.cloudCover = cloudCover;
    }

    public String getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getOzone() {
        return ozone;
    }

    public void setOzone(String ozone) {
        this.ozone = ozone;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }





}
