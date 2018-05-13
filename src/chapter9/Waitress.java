package chapter9;

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
            breakfastItems.get(i).toString();
        }

        for(int i = 0; i < lunchItems.length; i++) {
            lunchItems[i].toString();
        }

    }
}
