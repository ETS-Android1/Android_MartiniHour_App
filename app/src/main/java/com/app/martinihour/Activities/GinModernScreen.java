
package com.app.martinihour.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.martinihour.Adapters.DrinkAdapter;
import com.app.martinihour.Model.Drink;
import com.app.martinihour.R;

import java.util.ArrayList;

public class GinModernScreen extends AppCompatActivity {
    DrinkAdapter drinkAdapter;
    RecyclerView recyclerView;
    Button backBtnScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gin_modern_screen);

        // getting id for button
        backBtnScreen = findViewById(R.id.backBtn);

        recyclerView = findViewById(R.id.recyclerViewForGinModern);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        drinkAdapter = new DrinkAdapter(this, getMyList(), "no");
        recyclerView.setAdapter(drinkAdapter);

        backBtnScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GinModernScreen.this, GinTypeScreen.class));
                GinModernScreen.this.finish();
            }
        });


    }

    private ArrayList<Drink> getMyList() {
        ArrayList<Drink> modals = new ArrayList<>();
        Drink model = new Drink();
        model.setName_drink("Pink Gin");
        model.setDescription_drink("Similar to a classic gin martini" +
                " but with the fresh addition of strawberry notes and a pink colour");
        model.setRecipe_drink("- 60 ml Gin\n" +
                "- 45 ml kirsch\n" +
                "- 20 ml blanc vermouth\n" +
                "-3 dashes Angostura\n" +
                "Garnish: Lemon twist and Maraschino cherries");
        model.setDrink_image(R.drawable.modginone);
        modals.add(model);


        model = new Drink();
        model.setName_drink("Imperial");
        model.setDescription_drink("Delightful simple cocktail that adds" +
                " to your dry martini a small amount of cherry maraschino");
        model.setRecipe_drink("- 60 ml Gin\n" +
                "- 1 teaspoon maraschino liqueur\n" +
                "- 2 dashes aromatic bitter\n" +
                "Garnish: lemon twist");
        model.setDrink_image(R.drawable.ginmodtwo);
        modals.add(model);


        model = new Drink();
        model.setName_drink("Saketini");
        model.setDescription_drink("Classic Gin Martini with added oriental" +
                " flavours and dry finish from sake.");
        model.setRecipe_drink("- 60 ml Gin\n" +
                "- 20 ml Sake\n" +
                "Garnish: Cucumber slice");
        model.setDrink_image(R.drawable.ginmodthree);
        modals.add(model);


        model = new Drink();
        model.setName_drink("Vesper");
        model.setDescription_drink("The James’s Bond Martini.");
        model.setRecipe_drink("- 90 ml Gin\n" +
                "- 30 ml Vodka\n" +
                "- 15 ml Dry Vermouth\n" +
                "Garnish: Lemon peel");
        model.setDrink_image(R.drawable.ginmodfour);
        modals.add(model);

        return modals;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(GinModernScreen.this, GinTypeScreen.class));
        GinModernScreen.this.finish();
    }
}