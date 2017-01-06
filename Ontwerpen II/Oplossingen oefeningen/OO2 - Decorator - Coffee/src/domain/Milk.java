/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Robby
 */
public class Milk extends CondimentDecorator{
    
    public Milk(Beverage beverage) {
        super(beverage);
    }
    
    @Override
    public String getDescription()
    {
        return getBeverage().getDescription() + ", Milk";
    }
    
    @Override
    public double cost()
    {
        return .10 + getBeverage().cost();
    }
    
}
