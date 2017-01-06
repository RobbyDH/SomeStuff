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
public class MyStack {
    private MyList list;

    public MyStack() {
        this("stack");
    }

    public MyStack(String name) {
        list = new MyList();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
    
    public void push(String data){
        list.insertAtFront(data);
    }
    
    public String pop(){
        return list.removeFromFront();
    }
    
}
