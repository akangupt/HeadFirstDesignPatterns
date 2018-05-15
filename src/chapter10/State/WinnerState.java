package chapter10.State;

/*
Reference: Head First Design Patterns
Q:Why do we need the WinnerState? Couldn’t we just have the SoldState dispense two gumballs?
A: That’s a great question. SoldState and WinnerState are almost identical, except that WinnerState dispenses two
gumballs instead of one. You certainly could put the code to dispense two gumballs into the SoldState. The downside
is, of course, that now you’ve got TWO states represented in one State class: the state in which you’re a winner, and the
state in which you’re not. So you are sacrificing clarity in your State class to reduce code duplication. Another thing to
consider is the principle you learned in the previous chapter: One class, One responsibility. By putting the WinnerState
responsibility into the SoldState, you’ve just given the SoldState TWO responsibilities. What happens when the
promotion ends? Or the stakes of the contest change? So, it’s a tradeoff and comes down to a design decision.
*/

import chapter10.GumballMachine;

public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Wait, one gumball is already on the way.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you have already turned the crank.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Wait, one gumball is already on the way.");
    }

    @Override
    public void dispense() {
        /*
        Not a good implementation
        need to think about more than 2 gumball dispense case
         */
        System.out.println("YOU’RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.release();
        int count = gumballMachine.getCount();
        if(count == 0) {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
        else {
            gumballMachine.release();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

}

