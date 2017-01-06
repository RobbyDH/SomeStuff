# Hoofdstuk 16 - Collections

## Fruit2

methode verwijderOpLetter : 

de iterator en while gaan elk element overlopen

INDIEN CHAR OP pos 0 == aan letter wordt dit element verwijdert
deze methode kan makkelijk uitgebreid worden met een index als 3e attribuut


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

Methode verwijderSequence:

Alles verwijderen wat tussen 2 stirngs bevindt (hier is dit kiwi) 


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

Voeg volgende kisten samen in 1 Arraylist:

	String kist[][] = {{"appel", "peer", "citroen", "kiwi", "perzik"},
        {"banaan", "mango", "citroen", "kiwi", "zespri", "pruim"},
        {"peche", "lichi", "kriek", "kers", "papaya"}};

Oplossing:

	list= new ArrayList<>();
	for(String[] element : kist){
		list.addAll(Arrays.asList(element));
	}

Vervolgens worden volgende operaties uitgevoerd op de list: 

	CollectionOperaties.verwijderOpLetter(list, 'p');
    System.out.println("na verwijder letter ('p') :  " + list + "\n");

    CollectionOperaties.verwijderSequence(list, "kiwi");
    System.out.println("na verwijder sequence (kiwi) : " + list + "\n");

Na deze uitvoering gaan we het resultaat terug in een array mand plaatsen en sorteren:

	mand = list.toArray(new String[list.size()];
	Arrays.sort(mand);

Geef de inhoud van de array "mand" weer:

	System.out.println("Inhoud van de mand:\n" + Arrays.toString(mand));

