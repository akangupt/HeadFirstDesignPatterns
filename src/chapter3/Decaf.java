package chapter3;

public class Decaf extends Beverage {

    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double getCost() {
        return 1.05;
    }
}
