package chapter1;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("Looks like DecoyDuck");
    }
}
