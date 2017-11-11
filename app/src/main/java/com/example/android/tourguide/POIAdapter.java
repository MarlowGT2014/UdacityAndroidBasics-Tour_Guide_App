package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by joshua on 4/27/17.
 */

public class POIAdapter extends ArrayAdapter<POI> {

    public POIAdapter(Context context, ArrayList<POI> POIs) {
        super(context, 0, POIs);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
            //Get the current position
            POI currentPOI = getItem(position);

            //Add the Name line
            TextView locationView = (TextView) listItemView.findViewById(R.id.location_text_view);
            locationView.setText(currentPOI.getName());

            //Add the Address line
            TextView addressView = (TextView) listItemView.findViewById(R.id.address_text_view);
            addressView.setText(currentPOI.getAddress());

            //Add the Description Line
            TextView descripView = (TextView) listItemView.findViewById(R.id.description_text_view);
            descripView.setText(currentPOI.getDescription());

            //Add the image
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
            if (currentPOI.hasImage()) {
                imageView.setImageResource(currentPOI.getImageID());
                imageView.setVisibility(View.VISIBLE);
            } else {
                imageView.setVisibility(View.GONE);
            }

        return listItemView;

    }




}
