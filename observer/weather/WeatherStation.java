
package observer.weather;

import java.util.*;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay =
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        BenDisplay benDisplay = new BenDisplay(weatherData);
        CaelinDisplay caelinDisplay = new CaelinDisplay(weatherData);
        FrancisDisplay francisDiplay = new FrancisDisplay(weatherData);
        GeorgeDisplay georgeDisplay = new GeorgeDisplay(weatherData);
		JordanDisplay jordanDisplay = new JordanDisplay(weatherData);
        NischalDisplay nischalDisplay = new NischalDisplay(weatherData);
        TimDisplay timDisplay = new TimDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
