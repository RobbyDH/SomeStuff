package ui;

import java.util.*;

public class OefLinkedList_opgave {

    public OefLinkedList_opgave() {

//Cre�er een Integer-array "getallen" en initialiseer met 4, 3, 9 en 7
//-------------------------------------------------------------------
        Integer getallen[] = {4,3,9,7};
        
//Cre�er een 'arrayList' en vul op met de array "getallen" (1 instructie)
//-----------------------------------------------------------------------------------

    List<Integer> arrayList = new ArrayList<>(Arrays.asList(getallen));


//Cre�er de linkedList "lijstInteger" en vul op met de inhoud van de arrayList ( 1 instructie )
//--------------------------------------------------------------------------------

    LinkedList<Integer> lijstInteger = new LinkedList<>(arrayList);

//Voeg vooraan in "lijstInteger" getal 2 toe
//------------------------------------------------
    lijstInteger.add(0,2);
//Voeg achteraan in "lijstInteger" getal 12 toe
//---------------------------------------------------

    lijstInteger.add(12);

        weergevenLijst("oplossing: 2 4 3 9 7 12", lijstInteger);

//Verwijder het eerste element van "lijstInteger" en toon op het scherm d.m.v. printf
//----------------------------------------------------------------
        System.out.printf("%s\n%s", "oplossing: 2", "           ");
        int eersteElement = lijstInteger.remove(0);
        System.out.printf("%d\n", eersteElement);

        metEenVerhogen(lijstInteger);
        weergevenLijst("oplossing: 5 4 10 8 13", lijstInteger);


        elementenMetOnevenIndexVerwijderen(lijstInteger);
        weergevenLijst("oplossing: 6 11 14", lijstInteger);


        
        String woorden[] = {"aaa", "bbb", "ccc", "ddd", "eee", "fff"};

//Cre�er de LinkedList "lijstString" en vul op met de array "woorden" (1 instructie)
//-----------------------------------------------------------------------
        
        List<String> lijstString = new LinkedList<>(Arrays.asList(woorden));

        elementenMetOnevenIndexVerwijderen(lijstString);

        weergevenLijst("oplossing: aaa ccc eee", lijstString);
        

    }

    public void metEenVerhogen(List<Integer> lijst) //------------
    {
        //Alle elementen van de lijst wijzigen:
        //alle elementen worden met ��n verhoogd
        //JAVA 7:
        
        ListIterator<Integer> it = lijst.listIterator();
        
        while(it.hasNext()){
            int getal = it.next();
            it.set(getal +1);
        }
    }


    
    //generieke methode:
    public <E> void elementenMetOnevenIndexVerwijderen(Collection<E> lijst) //---                                           -------------
    {
        //Alle elementen, met oneven index, verwijderen (enkel met een iterator werken)
        //-----------------------------------------------------------------------------
        
        Iterator<E> it = lijst.iterator();
        
        while(it.hasNext()){
            it.next();
            if(it.hasNext())
            {
                it.next();
                it.remove();
            }
        }

    }
    


    //generieke methode:
    public <E> void weergevenLijst(String oplossing, Collection<E> lijst) //---                                       -------------
    // Alle elementen van de Collection<Integer> weergeven
    //---------------------------------------------------
    {
        System.out.printf("%s\n%s", oplossing, "           ");
        //TODO
        for(E element : lijst )
        {
            System.out.printf("%s ", element);
        }
        
        System.out.println();
    }
    
    //generieke methode:
    public void weergevenLijstOmgekeerdeVolgorde(
		String oplossing, List<Integer> lijst) {
    // Alle elementen van de List<Integer> in omgekeerde volgorde weergeven 
    //--------------------------------------------------------------------------------------
       System.out.printf("%s\n%s", oplossing, "           ");
       //TODO: JAVA 7:
       
            int getal;
            ListIterator<Integer> it= lijst.listIterator();
            
            while(it.hasNext())
            {
                getal=it.next();
                if(getal%2!=0)
                {
                    it.add(getal+2);
                }
            }
    
       
       System.out.println();

 
    }

    public static void main(String args[]) {
        new OefLinkedList_opgave();
    }
}
