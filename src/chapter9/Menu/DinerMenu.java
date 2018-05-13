package chapter9.Menu;
import chapter9.Iterator.DinerMenuIterator;

import java.util.Iterator;

public class DinerMenu implements Menu{
    public static final int MAX_ITEMS = 6;
    private int size;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        size = 0;
        addItem("Vegetarian BLT",
                "(Fakin’) Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if(size < MAX_ITEMS) {
            menuItems[size] = new MenuItem(name, description, vegetarian, price);
            size++;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
