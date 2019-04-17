package com.usbank.weatrherforecast.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.usbank.weatrherforecast.R;
import com.usbank.weatrherforecast.model.Weather;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by madhu on 4/13/19.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherViewHolder> {
    //public Weather weatherList;
    public Context context;
    public List<Weather> weatherList;

//    public WeatherAdapter( Weather weatherList,Context context) {
//        this.weatherList = weatherList;
//        this.context = context;
//    }

    public WeatherAdapter(  List<Weather> weatherList,Context context) {
        this.weatherList = weatherList;
        this.context = context;
    }

    @NonNull
    @Override
    public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_item, viewGroup,false);
        return new WeatherViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull WeatherViewHolder weatherViewHolder, int position) {
        Weather weather = weatherList.get(position);
        long date = Long.parseLong(weather.getTime());

        java.util.Date time=new java.util.Date((long)date*1000);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        weatherViewHolder.summary.setText(dateFormat.format(time));
        weatherViewHolder.temperature.setText(weather.getTemperature());

    }

    @Override
    public int getItemCount() {
        return weatherList.size();
    }
}
