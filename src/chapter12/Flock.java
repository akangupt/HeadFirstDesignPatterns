package chapter12;

import chapter12.Interfaces.Quackable;
import chapter12.Observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    private ArrayList<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable)(iterator.next());
            duck.quack();
            notifyObservers();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable)(iterator.next());
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }
}
