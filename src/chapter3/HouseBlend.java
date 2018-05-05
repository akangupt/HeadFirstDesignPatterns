package chapter3;

public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "House blend";
    }

    @Override
    public double getCost() {
        return 0.89;
    }
}
