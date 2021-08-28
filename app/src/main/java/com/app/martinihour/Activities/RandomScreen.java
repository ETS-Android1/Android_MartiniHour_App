package com.app.martinihour.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.martinihour.Adapters.DrinkAdapter;
import com.app.martinihour.Model.Drink;
import com.app.martinihour.R;

import java.util.ArrayList;
import java.util.Collections;

public class RandomScreen extends AppCompatActivity {

    Button backBtn;
    DrinkAdapter drinkAdapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_list_screen);

        //getting id's
        backBtn = findViewById(R.id.backBtn);
        recyclerView = findViewById(R.id.recyclerViewForVodkaModernScreen);

        // setting layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //calling adapter class object
        ArrayList<Drink> drinkArrayList = getMyList();

        // Random shuffle of list
        Collections.shuffle(drinkArrayList);
        drinkAdapter = new DrinkAdapter(this, drinkArrayList, "ran");
        recyclerView.setAdapter(drinkAdapter);


        // click listener
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RandomScreen.this, MainActivity.class));
                RandomScreen.this.finish();
            }
        });
    }

    //create array list of Drink object
    private ArrayList<Drink> getMyList() {
        ArrayList<Drink> drinkArrayList = new ArrayList<>();


        Drink drink = new Drink();
        drink.setName_drink("Dirty");
        drink.setDescription_drink("A classic martini with olive juice" +
                " that adds another dimension of umami flavour");
        drink.setRecipe_drink("-75 ml Gin\n" +
                "- 15 ml Dry Vermouth\n" +
                "- 1 teaspoon olive juice\n" +
                "Garnish: 1 or 3 olives");
        drink.setDrink_image(R.drawable.ginscreen);
        drinkArrayList.add(drink);

        drink = new Drink();
        drink.setName_drink("Dry");
        drink.setDescription_drink("Claimed to be the most famous cocktail in the world.\n" +
                "Is a true martini. Botanical bouquet with a dry profile.");
        drink.setRecipe_drink("-75 ml Gin\n" +
                "- 15 ml Dry Vermouth\n" +
                "Garnish: Lemon twist or more common 1 or 3 olives");
        drink.setDrink_image(R.drawable.ginsecond);
        drinkArrayList.add(drink);


        drink = new Drink();
        drink.setName_drink("Lemon Twist");
        drink.setDescription_drink("Add to the classic Martini citrus notes to leave a fresh mouth feel.");
        drink.setRecipe_drink("-75 ml Gin\n" +
                "- 15 ml Dry Vermouth\n" +
                "Garnish: lemon rind");
        drink.setDrink_image(R.drawable.ginthird);
        drinkArrayList.add(drink);

        drink = new Drink();
        drink.setName_drink("Gibson");
        drink.setDescription_drink("Classic Martini originated in the 50s." +
                " Made without bitters has a fresh and crunchy taste.");
        drink.setRecipe_drink("-75 ml Gin\n" +
                "- 15 ml Dry Vermouth\n" +
                "Garnish: Pickled onion");
        drink.setDrink_image(R.drawable.ginfour);
        drinkArrayList.add(drink);

        drink.setName_drink("Pink Gin");
        drink.setDescription_drink("Similar to a classic gin martini" +
                " but with the fresh addition of strawberry notes and a pink colour");
        drink.setRecipe_drink("- 60 ml Gin\n" +
                "- 45 ml kirsch\n" +
                "- 20 ml blanc vermouth\n" +
                "-3 dashes Angostura\n" +
                "Garnish: Lemon twist and Maraschino cherries");
        drink.setDrink_image(R.drawable.modginone);
        drinkArrayList.add(drink);


        drink = new Drink();
        drink.setName_drink("Imperial");
        drink.setDescription_drink("Delightful simple cocktail that adds" +
                " to your dry martini a small amount of cherry maraschino");
        drink.setRecipe_drink("- 60 ml Gin\n" +
                "- 1 teaspoon maraschino liqueur\n" +
                "- 2 dashes aromatic bitter\n" +
                "Garnish: lemon twist");
        drink.setDrink_image(R.drawable.ginmodtwo);
        drinkArrayList.add(drink);


        drink = new Drink();
        drink.setName_drink("Saketini");
        drink.setDescription_drink("Classic Gin Martini with added oriental" +
                " flavours and dry finish from sake.");
        drink.setRecipe_drink("- 60 ml Gin\n" +
                "- 20 ml Sake\n" +
                "Garnish: Cucumber slice");
        drink.setDrink_image(R.drawable.ginmodthree);
        drinkArrayList.add(drink);


        drink = new Drink();
        drink.setName_drink("Vesper");
        drink.setDescription_drink("The James’s Bond Martini.");
        drink.setRecipe_drink("- 90 ml Gin\n" +
                "- 30 ml Vodka\n" +
                "- 15 ml Dry Vermouth\n" +
                "Garnish: Lemon peel");
        drink.setDrink_image(R.drawable.ginmodfour);
        drinkArrayList.add(drink);


        drink.setName_drink("Dry");
        drink.setDescription_drink("Claimed to be the most famous cocktail in the world.\n" +
                "Is a true martini. Botanical bouquet with a dry profile.");
        drink.setRecipe_drink("-75 ml Vodka\n" +
                "- 15 ml Dry Vermouth\n" +
                "Garnish: Lemon twist or more common 1 or 3 olives");
        drink.setDrink_image(R.drawable.ginsecond);
        drinkArrayList.add(drink);


        drink = new Drink();
        drink.setName_drink("Lemon Twist");
        drink.setDescription_drink("Add to the classic Martini citrus notes to leave a fresh mouth feel.");
        drink.setRecipe_drink("-75 ml Vodka\n" +
                "- 15 ml Dry Vermouth\n" +
                "Garnish: lemon rind");
        drink.setDrink_image(R.drawable.ginthird);
        drinkArrayList.add(drink);


        drink = new Drink();
        drink.setName_drink("Gibson");
        drink.setDescription_drink("Classic Martini originated in the 50s." +
                " Made without bitters has a fresh and crunchy taste.");
        drink.setRecipe_drink("-75 ml Vodka\n" +
                "- 15 ml Dry Vermouth\n" +
                "Garnish: Pickled onion");
        drink.setDrink_image(R.drawable.ginfour);
        drinkArrayList.add(drink);

        drink = new Drink();
        drink.setName_drink("Dirty");
        drink.setDescription_drink("A classic martini with olive juice" +
                " that adds another dimension of umami flavour");
        drink.setRecipe_drink("-75 ml Vodka\n" +
                "- 15 ml Dry Vermouth\n" +
                "- 1 teaspoon olive juice\n" +
                "Garnish: 1 or 3 olives");
        drink.setDrink_image(R.drawable.ginfour);
        drinkArrayList.add(drink);

        drink.setName_drink("Espresso");
        drink.setDescription_drink("Originated in London 1983." +
                " It was the first cocktail to combine coffee and alcohol." +
                " Creamy texture with a balance of bitter and sweet flavours.");
        drink.setRecipe_drink("- 30 ml Vodka\n" +
                "- 30 ml fresh espresso\n" +
                "- 30 ml coffee liqueur\n" +
                "- 15 ml sugar syrup");
        drink.setDrink_image(R.drawable.vodmodthree);
        drinkArrayList.add(drink);

        drink = new Drink();
        drink.setName_drink("French");
        drink.setDescription_drink("Originated in New York mid 80s.\n" +
                "Combines a tart fruity flavour with a sweet vanilla flavour and a vodka undertone");
        drink.setRecipe_drink("- 45 ml vodka\n" +
                "- 60 ml pineapple juice\n" +
                "- 20 ml Chambord\n" +
                "- 20 ml vanilla liqueur");
        drink.setDrink_image(R.drawable.vodmodone);
        drinkArrayList.add(drink);


        drink = new Drink();
        drink.setName_drink("Pornstar");
        drink.setDescription_drink("Originated in London late 90s.\n" +
                "Fruity cocktail with tropical flavours vanilla undertone");
        drink.setRecipe_drink("- 45 ml vodka\n" +
                "- 30 ml Passoa\n" +
                "-20 ml vanilla liqueur\n" +
                "- 30 ml passionfruit juice");
        drink.setDrink_image(R.drawable.vodmodtwo);
        drinkArrayList.add(drink);


        drink = new Drink();
        drink.setName_drink("Chilli");
        drink.setDescription_drink("A modern spiced version of the classic vodka martini." +
                " A hint of sweetness and a subtle spicy kick.");
        drink.setRecipe_drink("- 45 ml Vodka\n" +
                "- 60 ml Peach juice\n" +
                "- 15 ml sugar syrup\n" +
                "- 1 Thai Chilli");
        drink.setDrink_image(R.drawable.vodmodfour);
        drinkArrayList.add(drink);


        return drinkArrayList;
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(RandomScreen.this, MainActivity.class));
        RandomScreen.this.finish();
    }
}