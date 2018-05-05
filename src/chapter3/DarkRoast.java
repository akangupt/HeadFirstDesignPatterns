package chapter3;

public class DarkRoast extends Beverage {

    @Override
    public String getDescription() {
        return "Dark roast";
    }

    @Override
    public double getCost() {
        return 0.99;
    }
}
