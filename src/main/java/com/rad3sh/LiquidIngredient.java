package src.main.java.com.rad3sh;

public class LiquidIngredient extends Ingredient {

    private double volume;

    public LiquidIngredient(String name, double value, double volume) {
        super(name, value);
        this.volume = volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }
}
