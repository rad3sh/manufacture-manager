package src.main.java.com.rad3sh;

public abstract class Ingredient {

    private String name;
    private double value;

    public Ingredient(String name, double value) {
        this.name = name;
        this.value = value;
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
}
