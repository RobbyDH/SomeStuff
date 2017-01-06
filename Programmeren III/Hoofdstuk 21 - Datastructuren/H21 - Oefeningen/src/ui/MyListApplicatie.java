/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import domain.MyStack;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Formatter;

/**
 *
 * @author Robby
 */
public class MyListApplicatie {
    public static void main(String[] args) {
        
        MyStack stack = new MyStack("sleutelwoordenlijst");
        try(Scanner scanner = new Scanner(new FileInputStream("Sleutelwoorden.txt"));
                Formatter uit = new Formatter("Omgekeerd.txt")) {
            
            while(scanner.hasNext())
                stack.push(scanner.nextLine());
            
            while(!stack.isEmpty()){
                uit.format("%s%n" , stack.pop());
            }
                
        }
        catch(FileNotFoundException ex){
            System.err.println("Error");
            System.exit(1);
        }
    }
}
