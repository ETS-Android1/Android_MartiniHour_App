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

public class VodkaModernScreen extends AppCompatActivity {
    // making objec of adapter class
    DrinkAdapter drinkAdapter;
    RecyclerView recyclerView;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vodka_modern_screen);


        backBtn = findViewById(R.id.backBtn);
        recyclerView = findViewById(R.id.recyclerViewForVodkaModernScreen);

        // setting layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //calling adapter class object
        drinkAdapter = new DrinkAdapter(this, getMyList(), "no");
        recyclerView.setAdapter(drinkAdapter);


        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VodkaModernScreen.this, VodkaTypeScreen.class));
                VodkaModernScreen.this.finish();
            }
        });

    }

    private ArrayList<Drink> getMyList() {
        ArrayList<Drink> modals = new ArrayList<>();
        Drink model = new Drink();

        model.setName_drink("Espresso");
        model.setDescription_drink("Originated in London 1983." +
                " It was the first cocktail to combine coffee and alcohol." +
                " Creamy texture with a balance of bitter and sweet flavours.");
        model.setRecipe_drink("- 30 ml Vodka\n" +
                "- 30 ml fresh espresso\n" +
                "- 30 ml coffee liqueur\n" +
                "- 15 ml sugar syrup");
        model.setDrink_image(R.drawable.vodmodthree);
        modals.add(model);

        model = new Drink();
        model.setName_drink("French");
        model.setDescription_drink("Originated in New York mid 80s.\n" +
                "Combines a tart fruity flavour with a sweet vanilla flavour and a vodka undertone");
        model.setRecipe_drink("- 45 ml vodka\n" +
                "- 60 ml pineapple juice\n" +
                "- 20 ml Chambord\n" +
                "- 20 ml vanilla liqueur");
        model.setDrink_image(R.drawable.vodmodone);
        modals.add(model);


        model = new Drink();
        model.setName_drink("Pornstar");
        model.setDescription_drink("Originated in London late 90s.\n" +
                "Fruity cocktail with tropical flavours vanilla undertone");
        model.setRecipe_drink("- 45 ml vodka\n" +
                "- 30 ml Passoa\n" +
                "-20 ml vanilla liqueur\n" +
                "- 30 ml passionfruit juice");
        model.setDrink_image(R.drawable.vodmodtwo);
        modals.add(model);


        model = new Drink();
        model.setName_drink("Chilli");
        model.setDescription_drink("A modern spiced version of the classic vodka martini." +
                " A hint of sweetness and a subtle spicy kick.");
        model.setRecipe_drink("- 45 ml Vodka\n" +
                "- 60 ml Peach juice\n" +
                "- 15 ml sugar syrup\n" +
                "- 1 Thai Chilli");
        model.setDrink_image(R.drawable.vodmodfour);
        modals.add(model);

        return modals;
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(VodkaModernScreen.this, VodkaTypeScreen.class));
        VodkaModernScreen.this.finish();
    }
}