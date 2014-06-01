package headfirst.chapter02;

import java.util.ArrayList;

public class WeatherData implements Observable {

    private boolean changed;
    //private ArrayList<Observer<WeatherData>> observers;
    private ArrayList<Observer<WeatherData>> observers;
    private float temperture;
    private float humidity;
    private float pression;

    public float getTemperture() {
        return temperture;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPression() {
        return pression;
    }

    public boolean isChanged() {
        return this.changed;
    }

    public WeatherData() {
        observers = new ArrayList<Observer<WeatherData>>();
        this.changed = false;
    }

    public void setMesurements(float temperture, float humidity, float pression) {
        this.temperture = temperture;
        this.humidity = humidity;
        this.pression = pression;
        setChanged();
        notifyObservers();

    }

    public void notifyObservers() {
        if (isChanged()) {
            for (Observer<WeatherData> o : observers) {
                o.update(this);
            }
        }
        changed = false;
    }

    public void setChanged() {
        this.changed = true;
    }

    public void registerObserver(Observer<?> observer) {
        if (!observers.contains(observer)) {
            //observers.add((Observer<WeatherData>) observer);
            observers.add((Observer<WeatherData>) observer);
        }
    }

    public void unregisterObserver(Observer<? extends Observable> observer) {
        observers.remove(observer);
    }

}
