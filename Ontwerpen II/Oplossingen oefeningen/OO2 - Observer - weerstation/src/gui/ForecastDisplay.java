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
public class ForecastDisplay implements Observer, DisplayElement{
    
    private double currentPressure = 29.92f;
    private double lastPressure;
    private Subject subject;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    

    @Override
    public void display() {
           
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        

    }
    
    
}
