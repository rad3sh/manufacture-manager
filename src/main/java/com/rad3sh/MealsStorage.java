package src.main.java.com.rad3sh;

import java.util.ArrayList;

public class MealsStorage {
    private ArrayList<Meal> meals;

    public MealsStorage() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public void showMealsIngredients() {
        for (Meal meal : meals) {
            meal.showIngredients();
        }
    }

    public void showMeals() {
        System.out.println("----------- Menu de Refeições -----------");
        for (Meal meal : meals) {
            meal.showDetails();
        }
    }
}