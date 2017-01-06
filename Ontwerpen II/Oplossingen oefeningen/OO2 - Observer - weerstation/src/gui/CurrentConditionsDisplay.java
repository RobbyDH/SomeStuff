/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domain.Observer;
import domain.Subject;

/**
 *
 * @author Robby
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private Subject weatherData;
    private double temperature, humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    
    
    
    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.printf("Actuele weergesteldheid %.1f graden en %.1f %% luchtvochtigheid\n", temperature, humidity);
    }
    
}
