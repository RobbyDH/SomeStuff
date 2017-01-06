/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robby
 */
public class RubberDuck extends Duck {
    
    public RubberDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }
    

    @Override
    public String display(){
        return "Ik ben een badeend";
    }
    
}
