package headfirst.chapter02.disp;

import headfirst.chapter02.Display;
import headfirst.chapter02.Observable;
import headfirst.chapter02.Observer;
import headfirst.chapter02.WeatherData;
import headfirst.chapter02.WeatherStation;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CurrentConditionDisplay implements Observer<WeatherData>, Display {

    private float temperture, pression;
    private Observable data;

    public CurrentConditionDisplay(Observable weatherData) {
        this.data = weatherData;
        this.data.registerObserver(this);
    }

    public void display() {

        System.out.printf("%s = TEMP: %2.2f, pression: %2.2f\n", this.getClass().getSimpleName(), this.temperture, this.pression);

    }

    public void update(WeatherData data) {
        this.temperture = data.getTemperture();
        this.pression = data.getPression();
        display();

    }
}
