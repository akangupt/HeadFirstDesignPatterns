package chapter1;
/*
    RubberDuck has quack method overriding squeak
*/

public class RubberDuck extends Duck{

    @Override
    public void display() {
        System.out.println("Looks like RubberDuck");
    }

    @Override
    public void quack() {
        squeak();
    }

    private void squeak() {
        System.out.println("Squeak squeak");
    }

    @Override
    public void fly() {
        //System.out.println("Do not fly");
    }

}
