package chapter4.Pizza;

import chapter4.PizzaIngredient.ChicagoPizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

    private ChicagoPizzaIngredientFactory factory;

    public PepperoniPizza(ChicagoPizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Chicago Style Sauce and Pepperoni Pizza");
        System.out.println(factory.createCheese());
        System.out.println(factory.createDough());
        System.out.println(factory.createVeggies());
    }
}
