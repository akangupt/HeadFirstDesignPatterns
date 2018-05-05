package chapter4.PizzaStore;

import chapter4.Pizza.CheesePizza;
import chapter4.Pizza.Pizza;
import chapter4.Pizza.VeggiePizza;
import chapter4.PizzaIngredient.NYPizzaIngredientFactory;

/*
    Reference: Head first design pattern
    As with every factory, the Factory Method Pattern gives us a way to encapsulate the instantiations
    of concrete types. The abstract Creator gives you an interface with a method for creating objects,
    also known as the “factory method.” Any other methods implemented in the abstract Creator are written to
    operate on products produced by the factory method. Only subclasses actually implement the factory method
    and create products.
    As in the official definition, you’ll often hear developers say that the Factory Method lets
    subclasses decide which class to instantiate. They say “decides” not because the pattern
    allows subclasses themselves to decide at runtime, but because the creator class is written
    without knowledge of the actual products that will be created, which is decided purely by
    the choice of the subclass that is used.
*/
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza create(String type) {
        if(type.equals("cheese")) {
            return new CheesePizza(new NYPizzaIngredientFactory());
        } else if(type.equals("veggie")) {
            return new VeggiePizza(new NYPizzaIngredientFactory());
        }
        return null;
    }
}
