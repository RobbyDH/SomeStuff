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
public abstract class GumballMachineState {

    protected GumballMachine gumballMachine;
    
    public GumballMachineState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    
    
    public String insertQuarter(){
        return "You can't insert a quarter";
    }
    
    public String ejectQuarter(){
        return "You haven't inserted a quarter";
    }
    
    public String turnCrank(){
        return "You turn but you need to pay first";
    }
    
    
    protected String dispence(){
        return "You need to pay first";
    }


}
