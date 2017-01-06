package ui;


import domain.MyListIterable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Scanner;

public class MyListApplicatie2 {

    public static void main(String args[]) {
        MyListIterable myList = new MyListIterable("sleutelwoordenlijst");
        try (Scanner invoer = new Scanner(Files.newInputStream(Paths.get("Sleutelwoorden.txt")));
                Formatter uitvoer = new Formatter("Sleutelwoorden_eindigend_op_e.txt")) {

            while(invoer.hasNext()){
                myList.insertAtBack(invoer.nextLine());
            }
            //System.out.println(myList.toString());
            
            String woord;
            Iterator<String> myIterator = myList.iterator();
            while(myIterator.hasNext()){
                woord = myIterator.next();
                if(woord.endsWith("e")){
                    uitvoer.format("%s%n", woord);
                }
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println("Bestand met opgegeven naam niet gevonden.");
        }
        catch(IOException ex){
            System.out.println("IOException.");
        }
        
    }
}