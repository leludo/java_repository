package headfirst.chapter02.disp;

import headfirst.chapter02.Display;
import headfirst.chapter02.Observable;
import headfirst.chapter02.Observer;
import headfirst.chapter02.WeatherData;

public class StatisticsDisplay implements Observer<WeatherData>, Display {

    private float pression, humidity;
    private Observable data;

    public StatisticsDisplay(Observable weatherData) {
        this.data = weatherData;
        this.data.registerObserver(this);
    }

    public void display() {

        System.out.printf("%s = PRESSION: %2.2f , humidity: %2.2f \n", this.getClass().getSimpleName(), this.pression, this.humidity);

    }

    public void update(WeatherData data) {
        this.pression = data.getPression();
        this.humidity = data.getHumidity();
        display();

    }
}
