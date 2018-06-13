package chapter12;

import chapter12.Ducks.DuckCall;
import chapter12.Ducks.MallardDuck;
import chapter12.Ducks.RedheadDuck;
import chapter12.Ducks.RubberDuck;
import chapter12.Interfaces.Quackable;

public class DuckSimulator {

    public static void main(String args[]) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        System.out.println("\nDuck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
 }
