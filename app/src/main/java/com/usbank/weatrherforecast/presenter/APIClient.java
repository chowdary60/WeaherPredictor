package com.usbank.weatrherforecast.presenter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by madhu on 4/13/19.
 */

public class APIClient {
    public static Retrofit retrofit;

    public static Retrofit getRetrofit(){

        if(retrofit == null){
            Gson gson = new GsonBuilder().setLenient().create();

            retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.darksky.net/forecast/6911468aa927ddfbd7c94635a51d240a/").
                            addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();


        }

        return retrofit;

    }
}
