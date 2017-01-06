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
public abstract class CondimentDecorator extends Beverage {
    
    private Beverage beverage;
    
    public CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    
    protected Beverage getBeverage(){
        return beverage;
    }
    
    @Override
    public abstract String getDescription();

}
