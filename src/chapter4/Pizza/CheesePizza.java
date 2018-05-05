package chapter4.Pizza;

import chapter4.PizzaIngredient.NYPizzaIngredientFactory;

public class CheesePizza extends Pizza {
    private NYPizzaIngredientFactory factory;

    public CheesePizza(NYPizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("NY Style Sauce and Cheese Pizza");
        System.out.println(factory.createCheese());
        System.out.println(factory.createDough());
        System.out.println(factory.createVeggies());
    }
}
