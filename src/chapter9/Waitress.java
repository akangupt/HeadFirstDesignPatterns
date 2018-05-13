package chapter9;

import chapter9.Menu.MenuComponent;
import chapter9.Menu.MenuItem;

import java.util.Iterator;

public class Waitress {

    private MenuComponent allmenus;

    public Waitress(MenuComponent allmenus) {
        this.allmenus = allmenus;
    }

    public void printMenu() {
        allmenus.print();
    }
}
