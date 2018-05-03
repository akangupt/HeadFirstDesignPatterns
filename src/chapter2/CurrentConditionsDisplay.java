package chapter2;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature, humidity;

    // [important] we have a reference to Subject here
    // This comes handy while registering and removing ourselves with Subject
    private Subject weatherData;

    // [important] Subject is passed in constructor
    // this is used to register the Observer with Subject
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature+ " F degrees " +
                humidity + " % humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;

        // [important] Every time there is a update in the condition, call display method
        display();
    }
}
