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
public class Mocha extends CondimentDecorator{
    
    public Mocha(Beverage beverage) {
        super(beverage);
    }
    
    @Override
    public String getDescription()
    {
        return getBeverage().getDescription() + ", Mocha";
    }
    
    @Override
    public double cost()
    {
        return .20 + getBeverage().cost();
    }
    
}
