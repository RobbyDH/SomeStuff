/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import exceptions.EmptyListException;
import java.util.Iterator;

/**
 *
 * @author Robby
 */
public class MyListIterable implements Iterable<String>{

    private Node firstNode;
    private Node lastNode;
    private String nameList;

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

    public MyListIterable() {
        this("List");
    }

    public MyListIterable(String name) {
        this.nameList = name;
    }
    
    public boolean isEmpty(){
        return firstNode == null;
    }
    
    public String toString(){
        if (isEmpty())
            return nameList + " is empty";
        
        StringBuilder builder = new StringBuilder();
        builder.append("The ").append(nameList).append(" is: ");
        
        Iterator<String> iterator = this.iterator();
        while(iterator.hasNext())
            builder.append(iterator.next()).append("    ");
        
        return builder.toString();
    }
    
    public void insertAtFront(String data){
        Node aNode = new Node(data);
        
        if(isEmpty())
            firstNode = lastNode=  aNode;
        else{
            aNode.setNext(firstNode);
            firstNode = aNode;
        }
            
    }
    
    public void insertAtBack(String insertItem)
    {
        Node aNode = new Node(insertItem);
        
        if(isEmpty())
            firstNode = lastNode = aNode;
        else{
            lastNode.setNext(aNode);
            lastNode = lastNode.getNext();
        }
    }
    
    public String removeFromFront(){
        if(isEmpty())
            throw new EmptyListException();
      
        String verwijderd = firstNode.getData();
        
        if(firstNode == lastNode)
            firstNode = lastNode = null;
        else
        {
            firstNode = firstNode.getNext();
        }
        return verwijderd; 
    }
    
    
    @Override
    public Iterator<String> iterator() {
        return new MyIterator(); 
    }


private class MyIterator implements Iterator<String>{

    private Node current = MyListIterable.this.firstNode;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public String next() {
            String woord = current.getData();
            current = current.getNext();
            return woord;
        }
    
    
}
}