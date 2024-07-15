package src.main.java.com.rad3sh;

import java.util.ArrayList;

public class Drink {
    private String name;
    private ArrayList<LiquidIngredient> ingredients;

    public Drink(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<LiquidIngredient> getIngredients() {
        return this.ingredients;
    }
}
