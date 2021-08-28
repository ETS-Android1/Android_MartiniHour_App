package com.app.martinihour.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.martinihour.Adapters.DrinkAdapter;
import com.app.martinihour.R;
import com.app.martinihour.Database.DatabaseHelper;

public class FavoriteListScreen extends AppCompatActivity {

    Button backBtn;
    DrinkAdapter drinkAdapter;
    RecyclerView recyclerView;
    private DatabaseHelper databaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_list_screen);

        //getting id's
        backBtn = findViewById(R.id.backBtn);
        databaseHelper = new DatabaseHelper(FavoriteListScreen.this);
        recyclerView = findViewById(R.id.recyclerViewForVodkaModernScreen);

        // setting layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //calling adapter class object
        drinkAdapter = new DrinkAdapter(this, databaseHelper.getAllDrinks(), "yes");
        recyclerView.setAdapter(drinkAdapter);


        // click listener
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FavoriteListScreen.this, MainActivity.class));
                FavoriteListScreen.this.finish();
            }
        });
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(FavoriteListScreen.this, MainActivity.class));
        FavoriteListScreen.this.finish();
    }
}