package chapter1;
/*
    RubberDuck has quack method overriding squeak
*/

public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Looks like RubberDuck");
    }


}
