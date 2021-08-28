package com.app.martinihour.Model;

public class Drink {
    // getters and setters
    String name_drink, description_drink, recipe_drink;
    int drink_image, drinkId;

    public String getName_drink() {
        return name_drink;
    }

    public void setName_drink(String name_drink) {
        this.name_drink = name_drink;
    }

    public String getDescription_drink() {
        return description_drink;
    }

    public void setDescription_drink(String description_drink) {
        this.description_drink = description_drink;
    }

    public String getRecipe_drink() {
        return recipe_drink;
    }

    public void setRecipe_drink(String recipe_drink) {
        this.recipe_drink = recipe_drink;
    }

    public int getDrink_image() {
        return drink_image;
    }

    public void setDrink_image(int drink_image) {
        this.drink_image = drink_image;
    }

    public int getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(int drinkId) {
        this.drinkId = drinkId;
    }
}
