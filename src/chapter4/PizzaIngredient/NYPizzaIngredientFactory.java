package chapter4.PizzaIngredient;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createDough() {
        return "Thin Crust";
    }

    @Override
    public String createSauce() {
        return "Marinara";
    }

    @Override
    public String createCheese() {
        return "Grated Reggiano Cheese";
    }

    @Override
    public String[] createVeggies() {
        String[] veggies = {"Garlic", "Onion"};
        return veggies;
    }
}
