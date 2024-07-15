package src.main.java.com.rad3sh;

public class SolidIngredient extends Ingredient {

    private double weight;

    public SolidIngredient(String name, double value, double weight) {
        super(name, value);
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }
}
