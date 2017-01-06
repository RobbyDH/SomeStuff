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
public class Ui {
    public static void main(String[] args) {
        
        PizzaStore store = new PizzaStore(new PizzaFactory());
        store.orderPizza("cheese");
    }
}
