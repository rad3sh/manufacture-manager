package src.main.java.com.rad3sh;

import java.util.ArrayList;

public class Meal {

    private String name;
    private double value;
    ArrayList<IngredientPortion> ingredientsPortions;

    public Meal(String name, double value, ArrayList<IngredientPortion> ingredientPortions) {
        this.name = name;
        this.value = value;
        this.ingredientsPortions = ingredientPortions;
    }

    public String getName() {
        return this.name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public void setIngredientsPortions(ArrayList<IngredientPortion> ingredientsPortions) {
        this.ingredientsPortions = ingredientsPortions;
    }

    public ArrayList<IngredientPortion> getIngredientsPortions() {
        return this.ingredientsPortions;
    }

    public void showIngredients() {
        System.out.println("------------- Ingredients to " + this.name + " -------------");
        if (this.ingredientsPortions.size() > 0) {
            for (IngredientPortion ingredientPortion : this.ingredientsPortions) {
                Ingredient ingredient = ingredientPortion.getIngredient();
                double amount = ingredientPortion.getAmount();

                if (ingredient instanceof SolidIngredient) {
                    System.out.println(amount + "g of " + ingredient.getName());
                } else if (ingredient instanceof LiquidIngredient) {
                    System.out.println(amount + "ml of " + ingredient.getName());
                }
            }
        } else {
            System.out.println("No ingredients registered!");
        }
    }

    public void showDetails() {
        System.out.println(this.name + " - " + this.value + "R$");
    }

    public void showIngredientsProductionCost() {
        System.out
                .println("------------- Production cost for " + this.name + " - " + this.value + "R$ -------------");
        double totalCost = 0;
        if (this.ingredientsPortions.size() > 0) {
            for (IngredientPortion ingredientPortion : this.ingredientsPortions) {
                Ingredient ingredient = ingredientPortion.getIngredient();
                double ingredientValue = ingredient.getValue();
                double amount = ingredientPortion.getAmount();

                if (ingredient instanceof SolidIngredient) {
                    double ingredientWeight = ((SolidIngredient) ingredient).getWeight();
                    final double cost = (ingredientValue * amount) / ingredientWeight;

                    System.out.println(amount + "g of " + ingredient.getName() + " - " + cost + "R$");
                    totalCost += cost;
                } else if (ingredient instanceof LiquidIngredient) {
                    double ingredientWeight = ((LiquidIngredient) ingredient).getVolume();
                    final double cost = (ingredientValue * amount) / ingredientWeight;
                    System.out.println(amount + "ml of " + ingredient.getName() + " - " + cost + "R$");
                    totalCost += cost;
                }

            }
            // System.out.println("--> Valor da Refeição: " + this.value + "R$");
            System.out.println("--> Total production cost: " + totalCost + "R$");
            System.out.println("--> Profit: " + (this.value - totalCost) + "R$");
        } else {
            System.out.println("No ingredients registered!");
        }
    }
}
