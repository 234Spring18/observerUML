package observer.weather;

import java.util.*;

public class JordanDisplay implements Observer, DisplayElement {
    private float humidity;
    private WeatherData weatherData;

    public JordanDisplay(WeatherData weatherData) {
	this.weatherData = weatherData;
	weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
	this.humidity = humidity;
	display();
    }

    public void display() {
	if(humidity < 50){
	    System.out.println("Low humidity today.");
	}
	else if(humidity >= 50 < 80){
	    System.out.println("Moderate humidity today.");
	}
	else {
	    System.out.println("High humidity today.");
	}
	if(temp < 50){
            System.out.println("It's chilly out!");
        }
        else if(temp >= 50 < 80){
            System.out.println("It's warm out.");
        }
        else {
            System.out.println("It's a scorcher.");
        }
    }

}
