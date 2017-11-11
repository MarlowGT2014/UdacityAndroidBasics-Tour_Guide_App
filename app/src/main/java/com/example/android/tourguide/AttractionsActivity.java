package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poi_list);

        ArrayList<POI> p = new ArrayList<POI>();
        p.add(new POI(R.string.coke, R.string.cokeAdd, R.string.cokeDescrip, R.drawable.coke_xxxhdpi));
        p.add(new POI(R.string.aqua, R.string.aquaAdd, R.string.aquaDescrip, R.drawable.aquarium_xxxhdpi));
        p.add(new POI(R.string.fox, R.string.foxAdd, R.string.foxDescrip, R.drawable.fox_xxxhdpi));
        p.add(new POI(R.string.i85, R.string.i85Add, R.string.i85Descrip, R.drawable.i85_xxxhdpi));

        POIAdapter itemsAdapter = new POIAdapter(this, p);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
