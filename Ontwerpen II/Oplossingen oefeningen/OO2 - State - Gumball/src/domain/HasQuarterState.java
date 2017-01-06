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
public class HasQuarterState extends GumballMachineState{

    HasQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }
    
    public String ejectQuarter(){
        gumballMachine.toState(new NoQuarterState(gumballMachine));
        return "Quarter returned";
    }
    
    public String turnCrank(){
        gumballMachine.toState(new SoldState(gumballMachine));
        return "You turned...";
    }
    
    public String toString(){
        return "waiting for turn of crank";
    }
}
