package com.usbank.weatrherforecast.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.usbank.weatrherforecast.R;
import com.usbank.weatrherforecast.model.Weather;

import java.util.List;

/**
 * Created by madhu on 4/15/19.
 */

public class CurrentWeatherAdapter extends BaseAdapter{
   Weather weather;
   Context context;
    private static LayoutInflater inflater=null;

 public   CurrentWeatherAdapter(Weather weather,Context context){
       this.weather = weather;
       this.context = context;
     inflater = ( LayoutInflater )context.
             getSystemService(Context.LAYOUT_INFLATER_SERVICE);


   }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

     Holder holder=new Holder();
        View view;
        view = inflater.inflate(R.layout.contact_item, null);
        holder.summary = (TextView) view.findViewById(R.id.summary);
        holder.temperature = (TextView) view.findViewById(R.id.temperature);
        holder.summary.setText(weather.getSummary());
        holder.temperature.setText(weather.getTemperature());

     return view;
    }

    public class Holder{
        TextView summary;
        TextView temperature;
    }
}
