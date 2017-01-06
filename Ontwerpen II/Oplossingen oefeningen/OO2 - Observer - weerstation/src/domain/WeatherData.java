/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Robby
 */
public class WeatherData implements Subject{
    private double temperature;
    private double humidity;
    private double pressure;
    
    private Set<Observer> observers;
    
    public WeatherData()
    {
        observers = new HashSet<>();
    }
    
    public void setMeasurements(double tempearture, double humidity, double pressure)
    {
        this.temperature = tempearture;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
    

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
    
    
}
