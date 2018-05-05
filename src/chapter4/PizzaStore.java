package chapter4;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = create(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza create(String type);

}
