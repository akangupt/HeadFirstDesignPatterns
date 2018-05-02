package chapter1;


public class MallardDuck extends Duck implements Flyable, Quackable{

    @Override
    public void display() {
        System.out.println("Looks like MallardDuck");
    }

    public void fly() {
        System.out.println("Fly with wings");
    }

    public void quack() {
        System.out.println("Quack quack");
    }

}
