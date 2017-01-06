/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import domain.Beverage;
import domain.DarkRoast;
import domain.Espresso;
import domain.Mocha;
import domain.Whip;

/**
 *
 * @author Robby
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        
        Beverage beverage2 = new Whip(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(beverage2.getDescription()+ " $" + beverage2.cost());
        
    }
}
