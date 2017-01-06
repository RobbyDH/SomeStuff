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
public class OutOfGumballsState extends GumballMachineState{
    public OutOfGumballsState(GumballMachine gumballMachine){
        super(gumballMachine);
    }
    
    public String toString(){
        return "SOld out";
    }
}
