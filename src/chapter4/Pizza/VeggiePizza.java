package chapter4.Pizza;

import chapter4.PizzaIngredient.NYPizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    private NYPizzaIngredientFactory factory;

    public VeggiePizza(NYPizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing NY Style Sauce and Veggie Pizza");
        System.out.println(factory.createCheese());
        System.out.println(factory.createDough());
        System.out.println(factory.createVeggies());
    }
}
