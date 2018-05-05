package chapter4;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    public String name, dough, sauce;
    public List<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    }

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
