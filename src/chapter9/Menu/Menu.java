package chapter9.Menu;

import chapter9.Iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    private ArrayList<MenuComponent> menus;
    private String name, description;

    // [important] We need to keep only one iterator for one menu
    private Iterator iterator = null;


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

    @Override
    public Iterator createIterator() {
        if(iterator == null) {
            synchronized(Menu.class) {
                if(iterator == null) {
                    iterator = new CompositeIterator(menus.iterator());
                }
            }
        }

        return iterator;
    }
}
