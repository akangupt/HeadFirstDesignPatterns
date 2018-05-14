package chapter10.State;

import chapter10.GumballMachine;

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we’re already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn’t get you another gumball!");
    }

    @Override
    public void dispense() {
        System.out.println("Gumball on the way!");
        int count = gumballMachine.getCount();
        count -= 1;
        gumballMachine.setCount(count);
        if(count <= 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
            gumballMachine.getSoldOutState().refill(10);
        }
        else gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void refill(int count) {
        System.out.println("There are already gumballs in the machine.");
    }
}
