package observer.weather;

import java.util.*;

public class NischalDisplay implements Observer, DisplayElement{

    private float temp;
    private float humidity;
    private WeatherData weatherData;

    
    public NischalDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        
    }
    
    public void update(float temp, float humidity, float pressure){
        this.temp=temp;
        this.humidity=humidity;
        display();
    }
    
    public void display(){
        
        if(temp> 100 && humidity> 50){
            System.out.println("Current temperature:"+temp+ "and Current Humidity:"+humidity);
            System.out.println("It is steaming and humid.");
        }
        
        else if((temp >= 60 && temp <= 80) && (humidity >= 35 && humidity =< 50)){
            System.out.println("Current temperature:"+temp+"F and Current Humidity:"+humidity);
            System.out.println("It is really good weather outside and no humidity.");
        }
        else if(temp < 40 && humidity < 40){
            System.out.println("Current temperature:"+temp+"F and Current Humidity:"+humidity);
            System.out.println("It is pretty chilly outside better put something warm.");
        }
        else{
            System.out.println("Current temperature:"+temp+"F and Current Humidity:"+humidity);
            System.out.println("It is freezing outside, better stay home.");
        }
        
    }


}
