package chapter4;

public class SimplePizzaFactory {
    public Pizza create(String type) {
        if(type.equals("cheese")) {
            return new CheesePizza();
        } else if(type.equals("veggie")) {
            return new VeggiePizza();
        }
        return null;
    }
}
