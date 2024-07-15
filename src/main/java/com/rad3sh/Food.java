package src.main.java.com.rad3sh;

import java.util.ArrayList;

public class Food {
    private String name;
    private ArrayList<Ingredient> ingredients;

    public Food(String name, ArrayList<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return this.ingredients;
    }
}
