package com.usbank.weatrherforecast.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.usbank.weatrherforecast.R;

/**
 * Created by madhu on 4/13/19.
 */

public class WeatherViewHolder extends RecyclerView.ViewHolder {
    public TextView temperature;
    public TextView summary;

    public WeatherViewHolder(@NonNull View itemView) {
        super(itemView);
        temperature = itemView.findViewById(R.id.temperature);
        summary= itemView.findViewById(R.id.summary);
    }
}
