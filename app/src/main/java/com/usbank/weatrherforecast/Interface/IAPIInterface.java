package com.usbank.weatrherforecast.Interface;

import com.usbank.weatrherforecast.model.WeatherResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by madhu on 4/13/19.
 */

public interface IAPIInterface {
    @GET("{lat},{lang}")
    Observable<WeatherResponse> getCurrentWeather(@Path("lat")double lat, @Path("lang")double lang);

}
