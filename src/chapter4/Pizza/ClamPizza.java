package chapter4.Pizza;

import chapter4.PizzaIngredient.ChicagoPizzaIngredientFactory;

public class ClamPizza extends Pizza {
    private ChicagoPizzaIngredientFactory factory;

    public ClamPizza(ChicagoPizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Chicago Style Sauce and clam Pizza");
        System.out.println(factory.createCheese());
        System.out.println(factory.createDough());
        System.out.println(factory.createVeggies());
    }
}
