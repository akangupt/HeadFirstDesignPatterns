package chapter3;

public abstract class Beverage {
    
    private String description;

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
