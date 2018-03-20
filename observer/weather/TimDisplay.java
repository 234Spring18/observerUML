package observer.weather;

import java.util.*;

public class TimDisplay implements Observer, DisplayElement {
  	private float humidity;
  	private float pressure;
	private float temp;
	private WeatherData weatherData;

	public TimDisplay(WeatherData weatherData) {
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
		if(humidity >= 100){
    			if(temp < 32){
      				System.out.println(“It’s going to snow”);
    			}
    			else if(temp <= 32){
      				System.out.println(“it’s going to rain”);
    			}
    		
		}
		else
			System.out.println(“no precipitation today”);
  }

