package chapter12.Factory;

import chapter12.Ducks.DuckCall;
import chapter12.Ducks.MallardDuck;
import chapter12.Ducks.RedheadDuck;
import chapter12.Ducks.RubberDuck;
import chapter12.Interfaces.Quackable;

public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
