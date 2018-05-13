package chapter9.Menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    private ArrayList<MenuComponent> menus;
    private String name, description;

    public Menu(String name, String description) {
        menus = new ArrayList<MenuComponent>();
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menus.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menus.remove(menuComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menus.get(i);
    }

    @Override
    public void print() {
        Iterator iterator = menus.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
