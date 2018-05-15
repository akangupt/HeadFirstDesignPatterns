package chapter10;

import chapter10.State.HasQuarterState;
import chapter10.State.NoQuarterState;
import chapter10.State.SoldOutState;
import chapter10.State.SoldState;
import chapter10.State.State;
import chapter10.State.WinnerState;

public class GumballMachine {

    private State hasQuarterState, noQuarterState, soldOutState, soldState, winnerState;
    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int count) {
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        if(count > 0) {
            this.count = count;
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void release() {
        System.out.println("A gumball comes rolling out the slot...");
        if(count > 0) count -= 1;
    }

    public void refill(int refillCount) {
        count += refillCount;
        state.refill();
    }


    public String toString() {
        String result = "Inventory: ";

        result += Integer.toString(count);
        result += "\n";
        if(state instanceof SoldOutState) {
            result += "Waiting to be refilled. ";
        } else if(state instanceof NoQuarterState) {
            result += "Waiting for the quarter. ";
        } else if(state instanceof HasQuarterState) {
            result += "You inserted the quarter. ";
        } else if(state instanceof SoldState) {
            result += "Gumball rolling out. ";
        }
        result += "\n";
        return result;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }
}
