# Hoofdstuk 16 - Collections

## Arrays

Gebruikte methodes in de kleine oefening opgave: 

KleineOefeningenArrays_Opgave: 

Vul de array "getallen" op als volgt:
6 6 6 6 6 6 6 6 6 6

        
    Arrays.fill(getallen, 6);

Vul de array "getallen" op als volgt:
6 6 6 6 6 4 4 8 8 8		(enkel methode fill gebruiken)


    Arrays.fill(getallen, 5, 7, 4);
    Arrays.fill(getallen, 7, getallen.length, 8); //Let hier op met de index cijfers

Zorg dat "getallen2" gelijk is aan "getallen" (m.a.w. getallen2[0]=getallen[0], getallen2[1]=getallen[1],...
en vanaf de index "getallen.length" : getallen2[10]=null, ...)
        
    System.arraycopy(getallen, 0, getallen2, 0, getallen.length);

Zorg dat "getallen2" gelijk is aan {1 1 1 1 6 6 6 4 4 8 1 1 1 1 }
eerst opvullen met 1	(methode fill)
vervolgens methode arrayCopy gebruiken  6 6 6 4 4 8

        
    Arrays.fill(getallen2, 1);
    System.arraycopy(getallen, 2, getallen2, 4, 6);


Kijken of getallen gelijk is aan getallen2

	Arrays.eaquels(getallen, getallen2);


Array met namen sorteren op alfabetische volgorde:

	Arrays.sort(namen);

Met klasse scanner gebruiker een naam laten ingeven

	Scanner input = new Scanner(System.in);
	String naam = input.nextLine();

Komt de ingegeven naam voor in de array "namen". Zoja, geef je de index weer waar de naam staat. Zo nee, geef je index weer waar de ingegeven naam zou moeten staan in de array. (printf gebruiken).
	
    int index = Arrays.binarySearch(namen, naam);
    if(index >= 0)
        System.out.printf("De naam %s komt voor op index %s", naam, index);
    else
       System.out.printf("De naam %s komt niet voor in de array en zou op index %s staan", naam, index*-1-1);


Enhanced for lus om arrays weer te geven

	for(Integer element : elementen)
		System.out.printf("%s ", element);

	for(String element : elementen)
		System.out.printf("%s ", element);

