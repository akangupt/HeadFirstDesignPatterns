package chapter12;

import chapter12.Ducks.DuckCall;
import chapter12.Ducks.MallardDuck;
import chapter12.Ducks.RedheadDuck;
import chapter12.Ducks.RubberDuck;
import chapter12.Factory.AbstractDuckFactory;
import chapter12.Factory.CountingDuckFactory;
import chapter12.Goose.Goose;
import chapter12.Goose.GooseAdapter;
import chapter12.Interfaces.Quackable;

public class DuckSimulator {

    public static void main(String args[]) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("The ducks quacked " +
                QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
 }
