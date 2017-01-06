package ui;

import java.util.*;

class CollectionOperaties {
    
    //methode verwijderOpLetter
    //-------------------------

    public static boolean verwijderOpLetter(Collection<String> c, char letter){
        boolean changed = false;
        Iterator<String> it = c.iterator();
        
        while(it.hasNext()){
            
            if(it.next().charAt(0) == letter)
                it.remove();
                changed = true;
        }
        
        return changed;
    }
    
    //methode verwijderSequence
    //-------------------------
    
    public static boolean verwijderSequence(List<String> list, String limit){
        boolean changed = false;
        int first = list.indexOf(limit);
        
        if(first != -1){
            int last = list.lastIndexOf(limit);
            list.subList(first, last + 1).clear();
            changed = true;  
        }
        return changed;   
    } 
}

public class OefFruit2_opgave {

    public static void main(String args[]) {
        String kist[][] = {{"appel", "peer", "citroen", "kiwi", "perzik"},
        {"banaan", "mango", "citroen", "kiwi", "zespri", "pruim"},
        {"peche", "lichi", "kriek", "kers", "papaya"}};

        List<String> list;
        String mand[];

//Voeg de verschillende kisten samen in een ArrayList list.
//--------------------------------------------------------
        
        list = new ArrayList<>();
        for(String[] element : kist)
            list.addAll(Arrays.asList(element));

        CollectionOperaties.verwijderOpLetter(list, 'p');
        System.out.println("na verwijder letter ('p') :  " + list + "\n");

        CollectionOperaties.verwijderSequence(list, "kiwi");
        System.out.println("na verwijder sequence (kiwi) : " + list + "\n");

//Plaats het resultaat terug in een array mand en sorteer die oplopend.
//---------------------------------------------------------------------

        mand = list.toArray(new String[list.size()]);
        Arrays.sort(mand);

//Geef de inhoud van de array "mand" terug
//----------------------------------------
        System.out.println("Inhoud van mand:\n" + Arrays.toString(mand));

    }
}
