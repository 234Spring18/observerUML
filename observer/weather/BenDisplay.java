package weather;

import java.util.*;
import java.math.*;

public class BenDisplay implements Observer, observer.weather.DisplayElement {
	private float humidity;
	private float pressure;
	private float temp;
	private observer.weather.WeatherData weatherData;

	public BenDisplay(observer.weather.WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public void display() {
		double heatIndex = (-42.379 + (2.04901523 * temp) + (10.14333127 * humidity) - (0.22475541 * temp * humidity) - (0.00683783 * (temp * temp)) - (0.05481717 * (humidity * humidity)) + (0.00122874 * (temp * temp) * humidity) + (0.00085282 * temp * (humidity * humidity)) - (0.00000199 * (temp * temp) * (humidity * humidity)));
		System.out.println("The current heat index is: " + heatIndex);
		double fahrenheitToKelvin = ((0.5555 * (temp - 32)) + 273.15);
		double speedOfSound = (643.855 * Math.pow((fahrenheitToKelvin / 273.15), 0.5));
		System.out.println("The current speed of sound is: " + speedOfSound + " knots, or " + (1.1507794 * speedOfSound) + " miles per hour.");

		if (temp < 32) {
			System.out.println("It might snow today.");
		} else if (temp >= 32 && temp < 60) {
			System.out.println("You might want a coat!");
		} else if (temp >= 60 && temp < 80) {
			System.out.println("It's going to be a pretty warm day out");
		} else {
			System.out.println("It's going to be super hot today! Look out!");
		}

	}
}

