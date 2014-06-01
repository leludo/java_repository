package headfirst.chapter02.disp;

import headfirst.chapter02.Display;
import headfirst.chapter02.Observable;
import headfirst.chapter02.Observer;
import headfirst.chapter02.WeatherData;

public class ForecastDisplay implements Observer<WeatherData>, Display {

    private float temperture, humidity;
    private Observable data;

    public ForecastDisplay(Observable weatherData) {
        this.data = weatherData;
        this.data.registerObserver(this);
    }

    public void display() {
        System.out.printf("%s = TEMP: %2.2f, humidity: %2.2f\n", this.getClass().getSimpleName(), this.temperture, this.humidity);
    }

    public void update(WeatherData c) {
        this.temperture = c.getTemperture();
        this.humidity = c.getHumidity();
        display();
    }
}
