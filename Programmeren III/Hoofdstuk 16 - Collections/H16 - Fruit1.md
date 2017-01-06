# Hoofdstuk 16 - Collections

## Oefening fruit1 

Behandel arX en arY als Collections en maak gebruik van de bulk operaties om de volgende output te leveren: 

	In y zit extra [banaan, mango, zespri]
	In x zit extra [appel, peer]
	x en y hebben gemeenschappelijk [citroen, kiwi]

Oplossing:

We stoppen de arrays in een Collection list van strings.
Daarna maken we een nieuwe arraylist waar we y in plaatsen en dan x uit verwijderen, wat overblijft is wat extra in y zit. Voor x doen we hetzelfde. 

Om te zien wat ze gemeenschappelijk hebben gebruiken we retainAll(). 


	String arX[] = {"appel", "peer", "citroen", "kiwi"},
           arY[] = {"banaan", "mango", "citroen", "kiwi", "zespri"};

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



