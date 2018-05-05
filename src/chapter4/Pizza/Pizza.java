package chapter4.Pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    public String name, dough, sauce;
    public List<String> toppings = new ArrayList<String>();

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking");
    }

    public void cut() {
        System.out.println("Cutting");
    }

    public void box() {
        System.out.println("Boxing");
    }

    public String getName() {
        return name;
    }
}
