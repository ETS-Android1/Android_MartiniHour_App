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

public class GinClassicScreen extends AppCompatActivity {
    // making object of adapter class
    DrinkAdapter drinkAdapter;
    RecyclerView recyclerView;
    Button backBtnScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gin_classic_screen);
        // getting id's for button
        backBtnScreen = findViewById(R.id.backBtn);


        recyclerView = findViewById(R.id.recyclerViewForGinClassicScreen);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        drinkAdapter = new DrinkAdapter(this, getMyList(), "no");
        recyclerView.setAdapter(drinkAdapter);


        // click listner for back button
        backBtnScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GinClassicScreen.this, GinTypeScreen.class));
                GinClassicScreen.this.finish();
            }
        });
    }

    private ArrayList<Drink> getMyList() {
        ArrayList<Drink> modals = new ArrayList<>();


        Drink model = new Drink();
        model.setName_drink("Dirty");
        model.setDescription_drink("A classic martini with olive juice" +
                " that adds another dimension of umami flavour");
        model.setRecipe_drink("-75 ml Gin\n" +
                "- 15 ml Dry Vermouth\n" +
                "- 1 teaspoon olive juice\n" +
                "Garnish: 1 or 3 olives");
        model.setDrink_image(R.drawable.ginscreen);
        modals.add(model);

        model = new Drink();
        model.setName_drink("Dry");
        model.setDescription_drink("Claimed to be the most famous cocktail in the world.\n" +
                "Is a true martini. Botanical bouquet with a dry profile.");
        model.setRecipe_drink("-75 ml Gin\n" +
                "- 15 ml Dry Vermouth\n" +
                "Garnish: Lemon twist or more common 1 or 3 olives");
        model.setDrink_image(R.drawable.ginsecond);
        modals.add(model);


        model = new Drink();
        model.setName_drink("Lemon Twist");
        model.setDescription_drink("Add to the classic Martini citrus notes to leave a fresh mouth feel.");
        model.setRecipe_drink("-75 ml Gin\n" +
                "- 15 ml Dry Vermouth\n" +
                "Garnish: lemon rind");
        model.setDrink_image(R.drawable.ginthird);
        modals.add(model);

        model = new Drink();
        model.setName_drink("Gibson");
        model.setDescription_drink("Classic Martini originated in the 50s." +
                " Made without bitters has a fresh and crunchy taste.");
        model.setRecipe_drink("-75 ml Gin\n" +
                "- 15 ml Dry Vermouth\n" +
                "Garnish: Pickled onion");
        model.setDrink_image(R.drawable.ginfour);
        modals.add(model);


        return modals;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(GinClassicScreen.this, GinTypeScreen.class));
        GinClassicScreen.this.finish();
    }
}