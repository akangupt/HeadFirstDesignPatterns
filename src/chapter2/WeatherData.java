package chapter2;

import java.util.ArrayList;
import java.util.Iterator;

public class WeatherData implements Subject{

    private ArrayList<Observer> observers;
    private float temperature, humidity, pressure;

    public WeatherData(ArrayList<Observer> observers) {
        observers = new ArrayList<Observer>();
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

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        // First check if Observer o is registered
        int index = observers.indexOf(o);
        if(index >= 0) observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Iterator i = observers.iterator(); i.hasNext();) {
            Observer o = (Observer) (i.next());
            o.update(temperature, humidity, pressure);
        }
    }

    // Notify observers when there is change in measurements
    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
