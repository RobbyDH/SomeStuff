package ui;
//KLEINE OEFENING
// class Arrays : fill, sort, arraycopy, equals, binarySearch

import java.util.*;

public class KleineOefeningenArrays_Opgave {

    private Integer[] getallen = new Integer[10];

    public KleineOefeningenArrays_Opgave() {
        test();
    }

    public void test() {
        //Vul de array "getallen" op als volgt:
        //6 6 6 6 6 6 6 6 6 6
        //------------------------------------
        
        Arrays.fill(getallen, 6);

        //Vul de array "getallen" op als volgt:
        //6 6 6 6 6 4 4 8 8 8		(enkel methode fill gebruiken)
        //--------------------------------------------------------
        
        
        Arrays.fill(getallen, 5, 7, 4);
        Arrays.fill(getallen, 7, getallen.length, 8);
        
        //getallen weergeven op het scherm
        toonArray("oplossing : 6 6 6 6 6 4 4 8 8 8", getallen);

        Integer[] getallen2 = new Integer[14];
        //Zorg dat "getallen2" gelijk is aan "getallen" (m.a.w. getallen2[0]=getallen[0], getallen2[1]=getallen[1],...
        //en vanaf de index "getallen.length" : getallen2[10]=null, ...)
        //--------------------------------------------------------------------------------------------------------
        
        System.arraycopy(getallen, 0, getallen2, 0, getallen.length);
        
        //getallen2 weergeven op het scherm
        toonArray("oplossing : 6 6 6 6 6 4 4 8 8 8 null null null null", getallen2);

        //Zorg dat "getallen2" gelijk is aan {1 1 1 1 6 6 6 4 4 8 1 1 1 1 }
        //eerst opvullen met 1	(methode fill)
        //vervolgens methode arrayCopy gebruiken  6 6 6 4 4 8
        //---------------------------------------------------------------
        
        Arrays.fill(getallen2, 1);
        System.arraycopy(getallen, 2, getallen2, 4, 6);
        
        //"getallen2" weergeven op het scherm
        toonArray("oplossing : 1 1 1 1 6 6 6 4 4 8 1 1 1 1", getallen2);

        //Is "getallen" gelijk aan "getallen2"
        //-------------------------------
	    if (Arrays.equals(getallen, getallen2))
	    	System.out.println("gelijk");
	    else
	    	System.out.println("niet gelijk"); 
        System.out.println("oplossing: niet gelijk"); 


        String namen[] = {"Roobrouck", "Malfait", "Bernard", "Vandermeersch", "Van Schoor", "Vanenens"};
        //sorteer de array in alfabetische volgorde
        //-----------------------------------------

        Arrays.sort(namen);
        
        //"namen" weergeven op het scherm
        toonArray("oplossing : namen alfatisch", namen);

        //De gebruiker geeft een naam in via het toetsenbord (klasse Scanner gebruiken)
        //-----------------------------------------------------------------------------
        
        Scanner scanner = new Scanner(System.in);
        String naam = scanner.nextLine();
        
        //Komt de ingegeven naam voor in de array "namen". Zoja, geef je de index weer waar
        //de naam staat. Zo nee, geef je index weer waar de ingegeven naam zou moeten staan
        //in de array. (printf gebruiken)
        //--------------------------------------------------------------------------------
        
        int index = Arrays.binarySearch(namen, naam);
        if(index >= 0)
            System.out.printf("De naam %s komt voor op index %s", naam, index);
        else
            System.out.printf("De naam %s komt niet voor in de array en zou op index %s staan", naam, index*-1-1);
        
    }

    public void toonArray(String oplossing, Integer[] elementen) //Toon alle elementen op het scherm (laat 1 spatie tussen)
    //Gebruik "enhanced for" en "printf"
    //-----------------------------------------------------------
    {
        System.out.printf("%s\n%s", oplossing, "            ");

//for
        for(Integer element : elementen)
            System.out.printf("%s ", element);
        
        System.out.println("\n");
    }

    public void toonArray(String oplossing, String[] elementen) //Toon alle elementen op het scherm (laat 1 spatie tussen)
    //Gebruik "enhanced for" en "printf"
    //-----------------------------------------------------------
    {
        System.out.printf("%s\n%s", oplossing, "            ");

        // TODO
        for(String element: elementen)
           System.out.printf("%s ", element);
        
        System.out.println("\n");
    }

    public static void main(String[] args) {
        KleineOefeningenArrays_Opgave oefening = new KleineOefeningenArrays_Opgave();
    }

}
