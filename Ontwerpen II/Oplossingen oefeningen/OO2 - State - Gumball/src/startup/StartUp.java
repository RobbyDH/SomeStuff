/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup;

import domain.GumballMachine;

/**
 *
 * @author Robby
 */
public class StartUp {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        
        System.out.println(gumballMachine);
        
        System.out.println(gumballMachine.insertQuarter());
        System.out.println(gumballMachine.turnCrank());
        
        System.out.println(gumballMachine);
        System.out.println(gumballMachine.insertQuarter());
        System.out.println(gumballMachine.ejectQuarter());
        System.out.println(gumballMachine.turnCrank());
    }
}
