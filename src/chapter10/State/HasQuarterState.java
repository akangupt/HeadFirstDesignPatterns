package chapter10.State;

import chapter10.GumballMachine;

import java.util.Random;

public class HasQuarterState implements State {

    Random random = new Random();
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can’t insert another quarter.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned....");

        int n = random.nextInt(10)+ 1;

        if(n == 7) {
            gumballMachine.setState(gumballMachine.getWinnerState());
            gumballMachine.getWinnerState().dispense();
            return;
        }
        gumballMachine.setState(gumballMachine.getSoldState());
        gumballMachine.getSoldState().dispense();
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed.");
    }

    @Override
    public void refill(int count) {
        System.out.println("There are already gumballs in the machine.");
    }
}