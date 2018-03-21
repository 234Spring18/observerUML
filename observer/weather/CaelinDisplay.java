package observer.weather;

import java.util.*;

public class CaelinDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private WeatherData WeatherData;
    
    public CaelinDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        display();
    }
    
    public void display() {
        if(temp > 100) {
            System.out.println("Temperature: " + temp + " and Current Humidity: " + humidity);
            System.out.println("I would definitely go to the pool today.")
        }
        
        else if((temp > 80 && temp <= 100)) {
            System.out.println("Temperature: " + temp + " and Current Humidity: " + humidity);
            System.out.println("I would still go to the pool.");
        }
        
        else if((temp > 65 && temp <= 80)) {
            System.out.println("Temperature: " + temp + " and Current Humidity: " + humidity);
            System.out.println("Uhh, it is very nice weather right now. I would hangout with friends outside.");
        }
        
        else if((temp >= 40 && temp <= 65)) {
            System.out.println("Temperature: " + temp + " and Current Humidity: " + humidity);
            System.out.println("This weather is the greatest for playing sports.");
        }
        
        else {
            System.out.println("Temperature: " + temp + " and Current Humidity: " + humidity);
            System.out.println("It is just too cold..");
        }
            
    }
}
