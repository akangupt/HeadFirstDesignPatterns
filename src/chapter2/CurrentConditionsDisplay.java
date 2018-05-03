package chapter2;

import java.util.Observable;
import java.util.Observer;

/*  Reference: Head First design patterns
    The dark side of java.util.Observable
    Observable is a class
    Yes, good catch. As you’ve noticed, Observable is a class, not an interface, and worse,
    it doesn’t even implement an interface. Unfortunately, the java.util.Observable
    implementation has a number of problems that limit its usefulness and reuse. That’s not
    to say it doesn’t provide some utility, but there are some large potholes to watch out for.
    You already know from our principles this is a bad idea, but what harm does it really
    cause?
    First, because Observable is a class, you have to subclass it. That means you can’t add
    on the Observable behavior to an existing class that already extends another superclass.
    This limits its reuse potential (and isn’t that why we are using patterns in the first place?).
    Second, because there isn’t an Observable interface, you can’t even create your own
    implementation that plays well with Java’s built-in Observer API. Nor do you have
    the option of swapping out the java.util implementation for another (say, a new, multithreaded
    implementation).
    Observable may serve your needs if you can extend java.util.Observable. On the other
    hand, you may need to roll your own implementation as we did at the beginning of the
    chapter. In either case, you know the Observer Pattern well and you’re in a good position
    to work with any API that makes use of the pattern.
    If you look at the Observable API, the setChanged() method is protected. So what? Well,
    this means you can’t call setChanged() unless you’ve subclassed Observable. This means
    you can’t even create an instance of the Observable class and compose it with your own
    objects, you have to subclass. The design violates a second design principle here…favor
    composition over inheritance
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature, humidity;

    // [important] we have a reference to Subject here
    // This comes handy while registering and removing ourselves with Subject
    private Observable observable;

    // [important] Subject is passed in constructor
    // this is used to register the Observer with Subject
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature+ " F degrees " +
                humidity + " % humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            this.temperature = ((WeatherData) o).getTemperature();
            this.humidity = ((WeatherData) o).getHumidity();
        }

        // [important] Every time there is a update in the condition, call display method
        display();

    }
}
