package com.app.martinihour.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.martinihour.R;

public class MainActivity extends AppCompatActivity {
    // create global variables
    public Button ginBtn, vodkaBtn, favouriteBtn, randomBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // get ids for button to perform action
        // we give to the buttons the value that has been assigned -- through findViewById
        ginBtn = findViewById(R.id.ginBtn);
        vodkaBtn = findViewById(R.id.vodkaBtn);
        favouriteBtn = findViewById(R.id.fvrtListBtn);
        randomBtn = findViewById(R.id.randomBtn);

        // calling the screen from button click
        ginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GinTypeScreen.class));
                MainActivity.this.finish();
            }
        });
        vodkaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, VodkaTypeScreen.class));
                MainActivity.this.finish();
            }
        });

        randomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RandomScreen.class));
                MainActivity.this.finish();
            }
        });


        favouriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // move to favorite list
                startActivity(new Intent(MainActivity.this, FavoriteListScreen.class));
                MainActivity.this.finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        MainActivity.this.finish();
    }
}