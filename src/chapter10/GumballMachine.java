package chapter10;

public class GumballMachine {
    public final static int SOLD_OUT = 0;
    public final static int NO_QUARTER = 1;
    public final static int HAS_QUARTER = 2;
    public final static int SOLD = 3;

    private int state = SOLD_OUT;
    private int count = 0;

    public GumballMachine(int count) {
        if(count > 0) {
            this.count = count;
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {//System.out.println("in insert quarter");
        if(state == SOLD_OUT) {
            System.out.println("Sorry we are sold out.");
            refill(10);
        } else if(state == NO_QUARTER) {
            System.out.println("You inserted a quarter.");
            state = HAS_QUARTER;
        } else if(state == HAS_QUARTER) {
            System.out.println("Wait, you have already put the quarter.");
        } else if(state == SOLD) {
            System.out.println("Wait, one gumball is already on the way.");
        }
    }

    public void ejectQuarter() {//System.out.println("in eject quarter");
        if(state == NO_QUARTER) {
            System.out.println("You didn't insert a quarter.");
        } else if(state == HAS_QUARTER) {
            System.out.println("Returning the quarter.");
            state = NO_QUARTER;
        } else if(state == SOLD) {
            System.out.println("Sorry, you have already turned the crank.");
        } else if(state == SOLD_OUT) {
            System.out.println("You can’t eject, you haven’t inserted a quarter yet");
            refill(10);
        }
    }

    public void turnCrank() {//System.out.println("in turns crank");
        if(state == SOLD_OUT) {
            System.out.println("Sorry we are sold out.");
            refill(10);
        } else if(state == NO_QUARTER) {
            System.out.println("You haven't put the quarter.");
        } else if(state == HAS_QUARTER) {
            System.out.println("You turned the crank.");
            state = SOLD;
            dispense();
        } else if(state == SOLD) {
            System.out.println("Wait, one gumball is already on the way.");
        }
    }

    public void dispense() {//System.out.println("in dispense gumball");
        if(state == SOLD_OUT) {
            System.out.println("Sorry we are sold out.");
            refill(10);
        } else if(state == NO_QUARTER) {
            System.out.println("You haven't put the quarter.");
        } else if(state == HAS_QUARTER) {
            System.out.println("Turn the crank first.");
        } else if(state == SOLD) {
            System.out.println("Gumball on the way!");
            count -= 1;
            if(count <= 0) {
                state = SOLD_OUT;
                refill(10);
            }
            else state = NO_QUARTER;
        }
    }

    public void refill(int count) {//System.out.println("in refill");
        if(state == SOLD_OUT) {
            this.count = count;
            System.out.println("Refilling the machine");
            state = NO_QUARTER;
        } else {
            System.out.println("There are already gumballs in the machine.");
        }
    }

    public String toString() {//System.out.println("in tostring");
        String result = "Inventory: ";

        result += Integer.toString(count);
        result += "\n";
        if(state == SOLD_OUT) {
            result += "Waiting to be refilled. ";
        } else if(state == NO_QUARTER) {
            result += "Waiting for the quarter. ";
        } else if(state == HAS_QUARTER) {
            result += "You inserted the quarter. ";
        } else if(state == SOLD) {
            result += "Gumball rolling out. ";
        }
        result += "\n";
        return result;
    }
}
