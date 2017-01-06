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
public class Pizza {
    public void prepare(){
        System.out.println("Pizza wordt belgd");
    }
    public void bake(){
        System.out.println("Pizza in de oven");
    }
    
    public void cut(){
        System.out.println("Pizza snijden");
    }
    
    public void box(){
        System.out.println("pizza wordt in de doos gestoken");
    }
}
