package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poi_list);

        final ArrayList<POI> p = new ArrayList<POI>();

        p.add(new POI(R.string.sm, R.string.smAdd, R.string.smDescrip, R.drawable.stonemountain_xxxhdpi));
        p.add(new POI(R.string.pp, R.string.ppAdd, R.string.ppDescrip, R.drawable.piedmont_xxxhdpi));
        p.add(new POI(R.string.bl, R.string.blAdd, R.string.blDescrip, R.drawable.beltline_xxxhdpi));

        POIAdapter itemsAdapter = new POIAdapter(this, p);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
