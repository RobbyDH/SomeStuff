package ui;

import java.util.*;

public class OefFruit1_opgave {

    public static void main(String args[]) {
        String arX[] = {"appel", "peer", "citroen", "kiwi"},
                arY[] = {"banaan", "mango", "citroen", "kiwi", "zespri"};

        /*
	Behandel arX en arY als Collections en maak gebruik van de bulk
	peraties om volgende output te leveren:
		In y zit extra [banaan, mango, zespri]
		In x zit extra [appel, peer]
		x en y hebben gemeenschappelijk [citroen, kiwi]
         */
        
        Collection<String> x = Arrays.asList(arX);
        Collection<String> y = Arrays.asList(arY);
        
        List<String> res = new ArrayList<>(y);
        res.removeAll(x);
        System.out.printf("In y zit extra %s\n", res);
        
        res = new ArrayList<>(x);
        res.removeAll(y);
        System.out.printf("In x zit extra %s\n", res);
        
        res = new ArrayList<>(y);
        res.retainAll(x);
        System.out.printf("x en y hebben gemeenschappelijk %s\n", res);
                
        
        
        
    }
}
