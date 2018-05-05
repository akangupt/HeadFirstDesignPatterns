package chapter4.PizzaIngredient;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createDough() {
        return "Thick Crust";
    }

    @Override
    public String createSauce() {
        return "Plum Tomato";
    }

    @Override
    public String createCheese() {
        return "Shredded Mozzarella Cheese";
    }

    @Override
    public String[] createVeggies() {
        String[] veggies = {"Mushroom", "Red pepper"};
        return veggies;
    }
}
