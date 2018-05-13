package chapter9.Iterator;

import chapter9.Menu.MenuItem;

public class DinerMenuIterator implements Iterator {
    private MenuItem menuItems[];
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return ((position < menuItems.length) ||
                (menuItems[position] != null));
    }

    @Override
    public Object next() {

        if(position >= menuItems.length) return null;

        position++;
        return menuItems[position];
    }
}
