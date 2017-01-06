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
public class MyQueue {
    private MyList list;

    public MyQueue() {
        this("Queue");
    }
    
    public MyQueue(String name){
        list = new MyList();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
    
    public void offer(String data){
        list.insertAtBack(data);
    }
    
    public String poll(){
        return list.removeFromFront();
    }
    
    
    
}
