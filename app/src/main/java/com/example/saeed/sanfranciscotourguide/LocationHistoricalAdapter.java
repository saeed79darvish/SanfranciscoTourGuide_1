package com.example.saeed.sanfranciscotourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class LocationHistoricalAdapter extends ArrayAdapter<LocationHistorical> {


    public LocationHistoricalAdapter(Context context, int resources, List<LocationHistorical> locationsList) {
        super(context, 0, locationsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final LocationHistorical currentLocationHistorical = getItem(position);
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_historical, parent, false);
        }

        TextView nameLocationTextView = (TextView) listItemView.findViewById(R.id.nameTextViewhistorical);
        nameLocationTextView.setText(currentLocationHistorical.getName());

        TextView descriptionLocationTextView = (TextView)
                listItemView.findViewById(R.id.descriptionTextViewhistorical);
        descriptionLocationTextView.setText(currentLocationHistorical.getDescription());

        TextView addressLocationTextView = (TextView) listItemView.findViewById(R.id.addressTextViewhistorical);
        addressLocationTextView.setText(currentLocationHistorical.getAddress());


        ImageView photoLocationImageView = (ImageView) listItemView.findViewById(R.id.photoImageViewhistorical);

        if (currentLocationHistorical.hasImage()) {
            photoLocationImageView.setImageResource(currentLocationHistorical.getImageResourceId());
            photoLocationImageView.setVisibility(View.VISIBLE);
        } else {
            photoLocationImageView.setVisibility(View.GONE);
        }


        if (currentLocationHistorical.hasAddress()) {
            addressLocationTextView.setVisibility(View.VISIBLE);
        } else {
            addressLocationTextView.setVisibility(View.GONE);
        }

        return listItemView;
    }

}