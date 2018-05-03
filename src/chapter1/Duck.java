package chapter1;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void display() {
        System.out.println("Looks like Duck");
    }

    public void swim() {
        System.out.println("Swim swim");
    }


    // These setters can be used to change duck's behaviour on the fly
    // Which means these behaviours/algorithms can be changed at runtime
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
