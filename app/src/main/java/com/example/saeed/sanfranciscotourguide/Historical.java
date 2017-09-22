package com.example.saeed.sanfranciscotourguide;

import android.content.Context;

import java.util.List;


public class Historical {

    public static void initHistoricalList(List<LocationHistorical> list, Context context) {

        list.add(new LocationHistorical(
                context.getString(R.string.historical_unionSquare_name),
                context.getString(R.string.historical_unionSquare_description),
                context.getString(R.string.historical_unionSquare_address),

                R.drawable.historical_unionsquare
        ));

        list.add(new LocationHistorical(
                context.getString(R.string.historical_marketstreet_name),
                context.getString(R.string.historical_marketstreet_description),
                context.getString(R.string.historical_marketstreet_address),

                R.drawable.historical_marketstreet
        ));

        list.add(new LocationHistorical(
                context.getString(R.string.historical_goldengatebridge_name),
                context.getString(R.string.historical_goldengatebridge_description),
                context.getString(R.string.historical_goldengatebridge_address),

                R.drawable.historical_goldengate
        ));

        list.add(new LocationHistorical(
                context.getString(R.string.historical_palace_name),
                context.getString(R.string.historical_palace_description),
                context.getString(R.string.historical_palace_address),

                R.drawable.historical_palace
        ));
    }
}
