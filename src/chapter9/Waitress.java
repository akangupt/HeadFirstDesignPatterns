package chapter9;

import chapter9.Menu.DinerMenu;
import chapter9.Menu.MenuItem;
import chapter9.Menu.PancakeHouseMenu;

import java.util.ArrayList;

public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public void printMenu() {
        pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        for(int i = 0; i < breakfastItems.size(); i++) {
            System.out.println(breakfastItems.get(i).toString());
        }

        for(int i = 0; i < lunchItems.length; i++) {
            System.out.println(lunchItems[i].toString());
        }

    }
}
