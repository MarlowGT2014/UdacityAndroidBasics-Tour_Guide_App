package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MyFavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poi_list);

        final ArrayList<POI> p = new ArrayList<POI>();
        p.add(new POI(R.string.gt, R.string.gtAdd, R.string.gtDescrip, R.drawable.gt_xxxhdpi));
        p.add(new POI(R.string.ea, R.string.eaAdd, R.string.eaDescrip, R.drawable.eddiesattic_xxxhdpi));
        p.add(new POI(R.string.sf, R.string.sfAdd, R.string.sfDescrip, R.drawable.sixflags_xxxhdpi));

        POIAdapter itemsAdapter = new POIAdapter(this, p);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
