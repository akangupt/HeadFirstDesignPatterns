package chapter9;

import chapter9.Menu.Menu;
import chapter9.Menu.MenuComponent;
import chapter9.Menu.MenuItem;

public class MenuTestDrive {
    public static void main(String args[]) {
        MenuComponent breakfast = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent lunch = new Menu("Diner Menu", "Lunch");
        MenuComponent dinner = new Menu("Cafe Menu", "Dinner");
        MenuComponent dessert = new Menu("Dessert Menu", "Dessert");

        dinner.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce", true, 3.89));
        dessert.add(new MenuItem("ice cream", "Vanilla", true, 2.89));
        dinner.add(dessert);

        MenuComponent allMenus = new Menu("All menus", "Complete menu");
        allMenus.add(breakfast);
        allMenus.add(lunch);
        allMenus.add(dinner);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
