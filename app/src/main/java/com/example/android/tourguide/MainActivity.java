package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView restaurants = (TextView) findViewById(R.id.restaurants);
        TextView attractions = (TextView) findViewById(R.id.attractions);
        TextView history = (TextView) findViewById(R.id.history);
        TextView myFavorites = (TextView) findViewById(R.id.myFavorites);

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
                Toast.makeText(getApplicationContext(), "Welcome to the Restaurants Page!", Toast.LENGTH_SHORT).show();
            }
        });

        attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(attractionsIntent);
                Toast.makeText(getApplicationContext(), "Welcome to the Attractions Page!", Toast.LENGTH_SHORT).show();
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(historyIntent);
                Toast.makeText(getApplicationContext(), "Welcome to the Outdoor Page!", Toast.LENGTH_SHORT).show();
            }
        });

        myFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myFavoritesIntent = new Intent(MainActivity.this, MyFavoritesActivity.class);
                startActivity(myFavoritesIntent);
                Toast.makeText(getApplicationContext(), "Welcome to the My Favorites Page!", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
