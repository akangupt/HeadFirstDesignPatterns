package chapter12;

import chapter12.Factory.AbstractDuckFactory;
import chapter12.Factory.CountingDuckFactory;
import chapter12.Goose.Goose;
import chapter12.Goose.GooseAdapter;
import chapter12.Interfaces.Quackable;
import chapter12.Observer.Quackologist;

public class DuckSimulator {

    public static void main(String args[]) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);

        Flock flockOfMallards = new Flock();

        Quackable mallardDuckOne = duckFactory.createMallardDuck();
        Quackable mallardDuckTwo = duckFactory.createMallardDuck();
        Quackable mallardDuckThree = duckFactory.createMallardDuck();
        Quackable mallardDuckFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardDuckOne);
        flockOfMallards.add(mallardDuckTwo);
        flockOfMallards.add(mallardDuckThree);
        flockOfMallards.add(mallardDuckFour);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);
        simulate(flockOfMallards);

        System.out.println("The ducks quacked " +
                QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
 }
