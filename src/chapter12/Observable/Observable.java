package chapter12.Observable;

import chapter12.Interfaces.Quackable;
import chapter12.Observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {

    private Quackable duck;
    private  ArrayList observers = new ArrayList();

    public Observable(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
