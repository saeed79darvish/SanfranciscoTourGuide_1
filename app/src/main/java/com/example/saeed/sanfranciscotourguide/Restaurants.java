package com.example.saeed.sanfranciscotourguide;

import android.content.Context;

import java.util.List;


public class Restaurants {

    public static void initRestaurantsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.restaurant_barcha_name),
                context.getString(R.string.restaurant_barcha_description),
                context.getString(R.string.restaurant_barcha_address),
                context.getString(R.string.restaurant_barcha_phone),
                context.getString(R.string.restaurant_barcha_web),
                R.drawable.restaurant_barcha
        ));

        list.add(new Location(
                context.getString(R.string.restaurant_maykadeh_name),
                context.getString(R.string.restaurant_maykadeh_description),
                context.getString(R.string.restaurant_barcha_address),
                context.getString(R.string.restaurant_maykadeh_phone),
                context.getString(R.string.restaurant_maykadeh_web),
                R.drawable.restaurant_maykadeh
        ));

        list.add(new Location(
                context.getString(R.string.restaurant_zarzuela_name),
                context.getString(R.string.restaurant_zarzuela_description),
                context.getString(R.string.restaurant_zarzuela_address),
                context.getString(R.string.restaurant_zarzuela_phone),
                context.getString(R.string.restaurant_zarzuela_web),
                R.drawable.restaurant_zarzuela
        ));

        list.add(new Location(
                context.getString(R.string.restaurant_takobasushi_name),
                context.getString(R.string.restaurant_takobasushi_description),
                context.getString(R.string.restaurant_takobasushi_address),
                context.getString(R.string.restaurant_takobasushi_phone),
                context.getString(R.string.restaurant_takobasushi_web),
                R.drawable.restaurant_takobasushi
        ));
    }
}
