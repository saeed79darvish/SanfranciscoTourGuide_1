package com.example.saeed.sanfranciscotourguide;

import android.content.Context;

import java.util.List;

public class Bars {

    public static void initBarsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.bars_unionlarder_name),
                context.getString(R.string.bars_unionlarder_description),
                context.getString(R.string.bars_unionlarder_address),
                context.getString(R.string.bars_unionlarder_phone),
                context.getString(R.string.bars_unionlarder_web),
                R.drawable.bars_unionlarder
        ));

        list.add(new Location(
                context.getString(R.string.bars_louiesbar_name),
                context.getString(R.string.bars_louiesbar_description),
                context.getString(R.string.bars_louiesbar_address),
                context.getString(R.string.bars_louiesbar_phone),
                context.getString(R.string.bars_louiesbar_web),
                R.drawable.bars_louiesbar
        ));

        list.add(new Location(
                context.getString(R.string.bars_novela_name),
                context.getString(R.string.bars_novela_description),
                context.getString(R.string.bars_novela_address),
                context.getString(R.string.bars_novela_phone),
                context.getString(R.string.bars_novela_web),
                R.drawable.bars_novela
        ));

        list.add(new Location(
                context.getString(R.string.bars_barbarosa_name),
                context.getString(R.string.bars_barbarosa_description),
                context.getString(R.string.bars_barbarosa_address),
                context.getString(R.string.bars_barbarosa_phone),
                context.getString(R.string.bars_barbarosa_web),
                R.drawable.bars_barbarossa
        ));
    }
}
