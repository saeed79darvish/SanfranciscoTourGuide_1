package com.example.saeed.sanfranciscotourguide;


import android.content.Context;

import java.util.List;

public class Shopping {


    public static void initShoppingList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.shopping_embarcadero_name),
                context.getString(R.string.shopping_embarcadero_description),
                context.getString(R.string.shopping_embarcadero_address),
                context.getString(R.string.shopping_embarcadero_phone),
                context.getString(R.string.shopping_embarcadero_web),
                R.drawable.shopping_embarcadero
        ));

        list.add(new Location(
                context.getString(R.string.shopping_ferrybuilding_name),
                context.getString(R.string.shopping_ferrybuilding_description),
                context.getString(R.string.shopping_ferrybuilding_address),
                context.getString(R.string.shopping_ferrybuilding_phone),
                context.getString(R.string.shopping_ferrybuilding_web),
                R.drawable.shopping_ferrybuilding
        ));

        list.add(new Location(
                context.getString(R.string.shopping_westfield_name),
                context.getString(R.string.shopping_westfield_description),
                context.getString(R.string.shopping_westfield_address),
                context.getString(R.string.shopping_westfield_phone),
                context.getString(R.string.shopping_westfield_web),
                R.drawable.shopping_westfield
        ));

        list.add(new Location(
                context.getString(R.string.shopping_metreon_name),
                context.getString(R.string.shopping_metreon_description),
                context.getString(R.string.shopping_metreon_address),
                context.getString(R.string.shopping_metreon_phone),
                context.getString(R.string.shopping_metreon_web),
                R.drawable.shopping_metreon
        ));
    }
}
