/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import exceptions.EmptyListException;

/**
 *
 * @author Robby
 */
public class MyList {
    
    private Node firstNode;
    private Node lastNode;
    private String nameList;
    
    public MyList(){}
    
    public MyList(String name){
        this.nameList = name;
    }
    
    public boolean isEmpty(){
        return firstNode == null;
    }
    
    public String toString(){
        
        if(isEmpty())
            return nameList + " is empty";
        
        StringBuilder builder = new StringBuilder();
        builder.append("The ").append(nameList).append(" is: ");
        Node current = firstNode;
        while(current != null){
            builder.append(current.getData()).append("    ");
            current.getNext();
        }
        
        return builder.toString();      
    }
    
    public void insertAtFront(String data){
        
        Node aNode = new Node(data);
        if(isEmpty())
            firstNode = lastNode = aNode;
        else{
            aNode.setNext(firstNode);
            firstNode = aNode;
        }
    }
    
    public void insertAtBack(String insertItem){
        Node aNode = new Node(insertItem);
        if(isEmpty())
            firstNode = lastNode = aNode;
        else{
            lastNode.setNext(aNode);
            lastNode.getNext();
        }
            
    }
    
    public String removeFromFront(){
        if(isEmpty()){
            throw new EmptyListException(nameList);
        }
        String verwijderd = firstNode.getData();
        
        if(firstNode == lastNode)
        {
            firstNode = lastNode = null;
        }
        else
            firstNode = firstNode.getNext();
        
        return verwijderd;
        
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }

    public String getNameList() {
        return nameList;
    }

    public void setNameList(String nameList) {
        this.nameList = nameList;
    }
   
    
    
    
}
