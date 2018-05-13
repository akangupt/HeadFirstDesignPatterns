package chapter9.Iterator;

import chapter9.Menu.MenuItem;
import java.util.Iterator;

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

    @Override
    public void remove() {
        if (position <= 0) return;
        if (menuItems[position-1] != null) {
            for (int i = position-1; i < (menuItems.length-1); i++) {
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length-1] = null;
        }
    }
}
