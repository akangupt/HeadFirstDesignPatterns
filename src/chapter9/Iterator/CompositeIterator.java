package chapter9.Iterator;

import chapter9.Menu.Menu;
import chapter9.Menu.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

/*

Reference: Head first design patterns
When we wrote the print() method in the
MenuComponent class we used an iterator to
step through each item in the component and if
that item was a Menu (rather than a MenuItem),
then we recursively called the print() method to
handle it. In other words, the MenuComponent
handled the iteration itself, internally.
With this code we are implementing an external
iterator so there is a lot more to keep track of.
For starters, an external iterator must maintain its
position in the iteration so that an outside client
can drive the iteration by calling hasNext() and
next(). But in this case, our code also needs to
maintain that position over a composite, recursive
structure. That’s why we use stacks to maintain
our position as we move up and down the
composite hierarchy.
 */

public class CompositeIterator implements Iterator {
    private Stack<Iterator> stack = new Stack<Iterator>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty()) return false;

        Iterator iterator = stack.peek();
        if(iterator.hasNext()) return true;

        stack.pop();
        return hasNext();
    }

    @Override
    public Object next() {
        if(!hasNext()) return null;

        Iterator iterator = stack.peek();
        MenuComponent menuComponent = (MenuComponent) iterator.next();
        if(menuComponent instanceof Menu) stack.push(menuComponent.createIterator());
        return menuComponent;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
