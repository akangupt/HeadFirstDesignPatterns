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
        int n = random.nextInt(10);

        // We want machine to enter winner state only if there are more than 1 gumballs to return
        if((n == 0) && (gumballMachine.getCount() >1)) gumballMachine.setState(gumballMachine.getWinnerState());
        else gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed.");
    }
}