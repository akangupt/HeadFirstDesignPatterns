package chapter12.Observable;

import chapter12.Observer.Observer;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
