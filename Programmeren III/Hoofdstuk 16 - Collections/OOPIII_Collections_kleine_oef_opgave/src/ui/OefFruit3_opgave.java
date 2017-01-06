package ui;

import java.util.*;
import java.util.stream.Collectors;

public class OefFruit3_opgave {

    public static void main(String args[]) {
        String kist[][] = {{"appel", "peer", "citroen", "kiwi", "perzik"},
        {"banaan", "mango", "citroen", "kiwi", "zespri", "pruim"},
        {"peche", "lichi", "kriek", "kers", "papaya"}};

        List<String> list = Arrays.stream(kist).flatMap(Arrays::stream).collect(Collectors.toList());


        /*Berg de fruit list van vorige oefeningen in een boom
 op zodat dubbels ge�limineerd worden.
 Er moet ook de mogelijkheid zijn de bijhorende prijs
 (decimale waarde) bij te houden.*/
        //------------------------------------------------------------
        
        Map<String, Double> fruit = new TreeMap<>(); 
        
        list.forEach((eenFruit) -> {
            fruit.put(eenFruit, null);
        }); 
        
        /*Doorloop de boom in lexicaal oplopende volgorde en vraag
        telkens de bijhorende prijs, die je mee in de boom opbergt.*/ //------------------------------------------------------------
        
        Scanner scanner = new Scanner(System.in);
        
        for(Map.Entry<String, Double> eenEntry : fruit.entrySet()){
            System.out.printf("De prijs van %s: ", eenEntry.getKey());
            double prijs = scanner.nextDouble();
            eenEntry.setValue(prijs);
        }
        
        /*Druk vervolgens de volledige lijst in twee
        kolommen (naam : prijs) in lexicaal oplopende volgorde af
        op het scherm.*/
        //------------------------------------------------------------
        
        fruit.entrySet().forEach((eenEntry) -> {
            System.out.printf("%s\t%.2f\n", eenEntry.getKey(), eenEntry.getValue());
        });
        
    }
}
