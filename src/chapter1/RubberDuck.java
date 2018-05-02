package chapter1;
/*
    RubberDuck has quack method overriding squeak
*/

public class RubberDuck extends Duck{

    @Override
    public void display() {
        System.out.println("Looks like RubberDuck");
    }


}
