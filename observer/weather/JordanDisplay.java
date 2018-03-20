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
    if(humidity < 70){
      System.out.println("You won't sweat too much today");
    }
    else if(humidity >= 70 && humidity < 90){
      System.out.println("It's really steamy out there");
    }
    else {
		System.out.println("Drink lots of water! You'll be drenched!");
    }
  }

}
