package chapter4.PizzaIngredient;

public interface PizzaIngredientFactory {

    /*
        Reference : Head first design patterns
        We provided a means of creating a family of ingredients for pizzas by introducing a new type of
        factory called an Abstract Factory. An Abstract Factory gives us an interface for creating a family
        of products. By writing code that uses this interface, we decouple our code from the actual factory
        that creates the products. That allows us to implement a variety of factories that produce products
        meant for different contexts – such as different regions, different operating systems, or different
        look and feels. Because our code is decoupled from the actual products, we can substitute different
        factories to get different behaviors (like getting marinara instead of plum tomatoes).
     */

    // Technically every ingredient should have its own class
    // For example Dough, Sauce, Cheese etc, But I have represented
    // them as String

    public String createDough();
    public String createSauce();
    public String createCheese();
    public String[] createVeggies();
}
