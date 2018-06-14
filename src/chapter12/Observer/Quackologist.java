package chapter12.Observer;

import chapter12.Observable.QuackObservable;

public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
