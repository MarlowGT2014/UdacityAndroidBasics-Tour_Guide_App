package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poi_list);

        final ArrayList<POI> p = new ArrayList<POI>();

        p.add(new POI(R.string.maryMacs, R.string.maryMacsAdd, R.string.maryMacsDesrip, R.drawable.marymacs_xxxhdpi));
        p.add(new POI(R.string.ss, R.string.ssAdd, R.string.ssDescrip, R.drawable.silverskillet_xxxhdpi));
        p.add(new POI(R.string.v, R.string.vAdd, R.string.vDescrip, R.drawable.varsity_xxxhdpi));



        POIAdapter itemsAdapter = new POIAdapter(this, p);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
