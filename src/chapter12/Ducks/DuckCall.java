package chapter12.Ducks;

import chapter12.Interfaces.Quackable;
import chapter12.Observable.Observable;
import chapter12.Observable.QuackObservable;
import chapter12.Observer.Observer;

public class DuckCall implements Quackable {

    private Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }
}