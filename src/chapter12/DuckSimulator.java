package chapter12;

import chapter12.Ducks.DuckCall;
import chapter12.Ducks.MallardDuck;
import chapter12.Ducks.RedheadDuck;
import chapter12.Ducks.RubberDuck;
import chapter12.Goose.Goose;
import chapter12.Goose.GooseAdapter;
import chapter12.Interfaces.Quackable;

public class DuckSimulator {

    public static void main(String args[]) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
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
