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
public class SoldState extends GumballMachineState {

    protected SoldState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }
    
    @Override
    public String dispence(){
        String msg = gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0){
            gumballMachine.toState(new NoQuarterState(gumballMachine));
        }
        else
        {
            msg = String.format("%s\n%s", msg, "Oops, out of gumballs!");
            gumballMachine.toState(new OutOfGumballsState(gumballMachine));
        }
        return msg;
    }
    
    @Override
    public String toString(){
        return "Dispencing a gumball";
    }


}
