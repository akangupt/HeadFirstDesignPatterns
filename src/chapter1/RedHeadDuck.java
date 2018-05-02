package chapter1;

public class RedHeadDuck extends Duck implements Flyable, Quackable{

    @Override
    public void display() {
        System.out.println("Looks like RedHeadDuck");
    }

    public void fly() {
        System.out.println("Fly with wings");
    }

    public void quack() {
        System.out.println("Quack quack");
    }
}
