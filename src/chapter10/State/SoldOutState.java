package chapter10.State;

import chapter10.GumballMachine;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out.");
        gumballMachine.getSoldOutState().refill(10);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet.");
        gumballMachine.getSoldOutState().refill(10);
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs.");
        gumballMachine.getSoldOutState().refill(10);
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed.");
        gumballMachine.getSoldOutState().refill(10);
    }

    @Override
    public void refill(int count) {
        gumballMachine.setCount(count);
        System.out.println("Refilling the machine");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
