package chapter2;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature, humidity, pressure;

    public WeatherData() {
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    // Notify observers when there is change in measurements
    public void measurementsChanged() {

        /* Reference: Head First design patterns
         [important] if setChanged() is not called then it will not notify observers
         Why is this necessary? The setChanged() method is meant to give you more flexibility in how
         you update observers by allowing you to optimize the notifications. For example, in our weather
         station, imagine if our measurements were so sensitive that the temperature readings were
         constantly fluctuating by a few tenths of a degree. That might cause the WeatherData object
         to send out notifications constantly. Instead, we might want to send out notifications only if the
         temperature changes more than half a degree and we could call setChanged() only after that
         happened. You might not use this functionality very often, but it’s there if you need it. In either case, you
         need to call setChanged() for notifications to work. If this functionality is something that is useful
         to you, you may also want to use the clearChanged() method, which sets the changed state back to
         false, and the hasChanged() method, which tells you the current state of the changed flag.
        */
        setChanged();


        // If you want to “push” data to the observers you can pass the data as a data object
        // to the notifyObserver(arg) method. If not, then the Observer has to “pull” the data
        // it wants from the Observable object passed to ().
        // We are using pull method here! Observer will have to pull for the updates.
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
