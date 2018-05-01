package chapter1;

public class DecoyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Looks like RubberDuck");
    }

    @Override
    public void quack() {
        //System.out.println("Do not quack");
    }

    @Override
    public void fly() {
        //System.out.println("Do not fly");
    }
}
