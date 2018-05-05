package chapter4.PizzaStore;

import chapter4.Pizza.ClamPizza;
import chapter4.Pizza.PepperoniPizza;
import chapter4.Pizza.Pizza;

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
