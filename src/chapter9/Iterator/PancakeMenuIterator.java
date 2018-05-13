package chapter9.Iterator;

import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator {
    private ArrayList menuItems;
    private int position = 0;

    public PancakeMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return ((position < menuItems.size()) ||
                (menuItems.get(position) != null));
    }

    @Override
    public Object next() {
        if(position >= menuItems.size()) return null;

        position++;
        return menuItems.get(position);
    }
}
