package src.main.java.com.rad3sh;

public class IngredientPortion {
    private Ingredient ingredient;
    private double amount; // Pode ser peso ou volume, depende do tipo de ingrediente

    public IngredientPortion(Ingredient ingredient, double amount) {
        this.ingredient = ingredient;
        this.amount = amount;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}