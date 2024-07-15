package src.main.java.com.rad3sh;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Initializes the class where the meals are stored
        MealsStorage mealsStorage = new MealsStorage();

        // Coxinha ingredients, weight in grams and volume in milliliters
        // Since an ingredient can be measured by weight or volume, I created 2
        // different classes for each
        SolidIngredient ingredientFlour = new SolidIngredient("Wheat Flour", 500, 100);
        SolidIngredient ingredientChickenBreast = new SolidIngredient("Chicken Breast", 12, 100);
        LiquidIngredient ingredientMilk = new LiquidIngredient("Milk", 12, 1000);
        LiquidIngredient ingredientOil = new LiquidIngredient("Oil", 12, 1000);
        SolidIngredient ingredientStrawberryPulp = new SolidIngredient("Strawberry Pulp", 12, 1000);

        // Create the list of portions for the coxinha and add the portion of each
        // ingredient
        ArrayList<IngredientPortion> coxinhaIngredients = new ArrayList<>();
        coxinhaIngredients.add(new IngredientPortion(ingredientFlour, 100));
        coxinhaIngredients.add(new IngredientPortion(ingredientChickenBreast, 300));
        coxinhaIngredients.add(new IngredientPortion(ingredientMilk, 400));
        coxinhaIngredients.add(new IngredientPortion(ingredientOil, 120));

        Meal coxinha = new Meal("Chicken Coxinha", 5, coxinhaIngredients);
        mealsStorage.addMeal(coxinha);

        // List of ingredients for the strawberry juice
        ArrayList<IngredientPortion> strawberryJuiceIngredients = new ArrayList<>();
        strawberryJuiceIngredients.add(new IngredientPortion(ingredientStrawberryPulp, 100));
        strawberryJuiceIngredients.add(new IngredientPortion(ingredientMilk, 400));

        Meal strawberryJuice = new Meal("Strawberry Juice (500ml)", 4, strawberryJuiceIngredients);
        mealsStorage.addMeal(strawberryJuice);

        // Display all meals as if it were a menu
        mealsStorage.showMeals();

        // mealsStorage.showMealsIngredients();

        // Main function of the system, shows the cost of each ingredient portion and
        // the total cost of a specific meal
        strawberryJuice.showIngredientsProductionCost();
    }
}
