package chapter12.Ducks;

import chapter12.Interfaces.Quackable;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}