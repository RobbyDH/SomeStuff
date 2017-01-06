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
public class Whip extends CondimentDecorator{
    
    public Whip(Beverage beverage) {
        super(beverage);
    }
    
    @Override
    public String getDescription()
    {
        return getBeverage().getDescription() + ", whip";
    }
    
    @Override
    public double cost()
    {
        return .25 + getBeverage().cost();
    }
    
}
