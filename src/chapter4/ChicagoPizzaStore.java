package chapter4;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza create(String type) {
        if(type.equals("clam")) {
            return new ClamPizza();
        } else if(type.equals("pepperoni")) {
            return new PepperoniPizza();
        }
        return null;
    }
}
