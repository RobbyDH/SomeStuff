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
public class NoQuarterState extends GumballMachineState{

    public NoQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }
    
    @Override
    public String insertQuarter()
    {
        gumballMachine.toState(new HasQuarterState(gumballMachine));
        return "You inserted a quarter";
    }
    
    @Override
    public String toString(){
        return "waiting for quarter";
    }
}
