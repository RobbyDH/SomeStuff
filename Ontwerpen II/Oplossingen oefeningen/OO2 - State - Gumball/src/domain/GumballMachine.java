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
public class GumballMachine {
    
    private GumballMachineState currentState;
    private  int count = 0;

    public GumballMachine(int numberGumballs) {
        this.count = numberGumballs;
        if (numberGumballs > 0)
            toState(new NoQuarterState(this));
        else
            toState(new OutOfGumballsState(this));
    }


    
    /*Nu de acties. Deze kun je nu ZEER EENVOUDIG implementeren. We delegeren dat aan de huidige toestand. */   
    public String insertQuarter() 
    {  
        return currentState.insertQuarter();  
    }    
    
    public String ejectQuarter() { 
        return currentState.ejectQuarter();  
    }   
    public String turnCrank() {
        String msg1 = currentState.turnCrank();  
        String msg2 = currentState.dispence(); 
        return String.format( 
                "%s\n%s", msg1, msg2); 
    } 
    
/*We hebben geen actiemethode voor dispense() in GumballMachine nodig, omdat dit een interne actie betreft. */ 
    
/*De machine ondersteunt de hulpmethode releaseBall() die  de bal vrijgeeft en de instantievariabele count verlaagt.*/
    protected String releaseBall(){
        if (count != 0){
            count = count-1;
        }
        return "A gumball comes rolling out the slot";
    }
    
   //De machine vullen met kauwgommen. De toestand       
    // wordt op ‘No Quarter’ gezet.  
    
    public void refill(int count)
    {
        if(count > 0){
            this.count = count;
            toState(new NoQuarterState(this));
        }
    }
    
    /*via deze methode kan een toestandsobject de machine in  een andere toestand brengen.*/
    
    protected void toState(GumballMachineState state) {
        currentState = state;
    }
    
    public int getCount(){return count;}
    
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model");
        result.append("\nInventory: " + count + " gumball");
        if(count != 1){
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is" + currentState + "\n");
        return result.toString();
    }
    
}
