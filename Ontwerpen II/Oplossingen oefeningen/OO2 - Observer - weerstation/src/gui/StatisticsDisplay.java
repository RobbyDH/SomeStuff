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
public class StatisticsDisplay implements Observer, DisplayElement{
    
    private double maxTemp = 0.0f;
    private double minTemp = 200;
    private double tempSum = 0.0f;
    
    private int numReadings;
    private Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getTempSum() {
        return tempSum;
    }

    public void setTempSum(double tempSum) {
        this.tempSum = tempSum;
    }

    public int getNumReadings() {
        return numReadings;
    }

    public void setNumReadings(int numReadings) {
        this.numReadings = numReadings;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    
    

    @Override
    public void update(double temp, double humidity, double pressure) {
        
    }

    @Override
    public void display() {
        System.out.printf("Gem/Max/Min temperature = %.1f/%.1f/%.1f", getTempSum(),getMaxTemp(),getMinTemp());
    }
            
            
    
}
