# Hoofdstuk 16 - Collections

## List

Declareren van lijsten met strings

	List<String> list, list2;


Maak een arrayList list en vul deze op met de array colors. Voeg dan green toe op het einde en ook op index 2.

	list = new ArrayList<>(Arrays.asList(COLORS));
    list.add("green");
    list.add(2, "green");

Verwijder het 2de index element

	list.remove(1);

Verwijder green: 

	list.remove("green");

Weergeven van 2de index met printf

    System.out.printf("Het 2de element is: %s", list.get(1));

Komt blue voor in de list:

   	if (  list.contains("blue") )
   		System.out.println("           blue komt voor\n");
   	else
   		System.out.println("           blue komt niet voor\n");

Maak het derde element string yellow:

	list.set(2,"yellow");

Aanmaken lege arrayList:

	list2 = new ArrayList<>();

list in list2 steken: 

	list2.addAll(list);

Is list = list2

	if (  list2.equals(list) )
   		System.out.println("            idem\n");
   	else
   		System.out.println("            niet idem\n");


Enhanced for 

	for(String element : list){
		System.out.printf("%s ", element);
	}

Elke string in de lijst naar hoofdletters omzetten: 

Gebruik maken van een ListIterator: 

	ListIterator<String> listIterator = list.listIterator();

    while(listIterator.hasNext()){
    	String woord = listIterator.next();
        listIterator.set(woord.toUpperCase());
    }

Naar kleine letters omzetten met Java 8:

       list = list.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
      
       return list;


 

	




