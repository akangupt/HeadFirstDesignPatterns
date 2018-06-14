package chapter12.Observer;

import chapter12.Observable.QuackObservable;

public interface Observer {

    public void update(QuackObservable duck);
}
