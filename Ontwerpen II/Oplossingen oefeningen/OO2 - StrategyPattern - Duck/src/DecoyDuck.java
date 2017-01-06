/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robby
 */
public class DecoyDuck extends Duck{
    public DecoyDuck()
    {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    
    @Override
    public String display(){
        return "Ik probeer eendjes te vangen";
    }
}
