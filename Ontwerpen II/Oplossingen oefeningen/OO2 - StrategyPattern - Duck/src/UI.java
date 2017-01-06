

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Robby
 */
public class UI {
    public static void main(String[] args) {
        
        
        Duck duck1 = new MallardDuck();
        System.out.println(duck1.performQuack());
        System.out.println(duck1.performFly());
        System.out.println(duck1.display());
        
        System.out.println();
        
        Duck duck2 = new RubberDuck();
        System.out.println(duck2.performQuack());
        System.out.println(duck2.performFly());
        System.out.println(duck2.display());
        
        
        
    }

    
}
