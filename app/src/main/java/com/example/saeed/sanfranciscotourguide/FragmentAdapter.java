package com.example.saeed.sanfranciscotourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    private Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantFragment();
        } else if (position == 1) {
            return new HistoricalFragment();
        }
        else if (position == 2) {
            return new ShoppingFragment();}
        else {
            return new BarsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_Restaurant);
        } else if (position == 1) {
            return context.getString(R.string.category_historical);
        }
        else if (position == 2) {
            return context.getString(R.string.category_shopping);}
        else {
            return context.getString(R.string.category_bars);
        }
    }
}
