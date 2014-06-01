package headfirst.chapter02;

import headfirst.chapter02.disp.ForecastDisplay;
import headfirst.chapter02.disp.CurrentConditionDisplay;
import headfirst.chapter02.disp.StatisticsDisplay;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The observer pattern
 *
 * @author ludovic
 *
 */
public class WeatherStation {

    public static void main(String[] argv) {
        WeatherData weatherData = new WeatherData();
        // create the displays
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        StatisticsDisplay anotherstatisticsDisplay = new StatisticsDisplay(weatherData);

        try { //set weather data (wait 2 seconds between each update)
            weatherData.setMesurements(22f, 45f, 100f);
            Thread.sleep(2000);
            weatherData.setMesurements(28f, 50f, 80f);
            Thread.sleep(2000);
            weatherData.setMesurements(20f, 43f, 90f);
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WeatherStation.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
