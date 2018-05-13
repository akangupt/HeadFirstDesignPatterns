package chapter9;

import chapter9.Iterator.Iterator;
import chapter9.Menu.DinerMenu;
import chapter9.Menu.MenuItem;
import chapter9.Menu.PancakeHouseMenu;

public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public void printMenu() {
        pancakeHouseMenu = new PancakeHouseMenu();
        printMenu(pancakeHouseMenu.createIterator());

        dinerMenu = new DinerMenu();
        printMenu(dinerMenu.createIterator());
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.toString());
        }
    }
}
