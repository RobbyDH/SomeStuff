# Hoofdstuk 16 - Collections

## LinkedList

Maak een Integer-array "getallen" en initialiseer met 4, 3, 9 en 7

	Integer getallen[] = {4,3,9,7};


Maak een 'arrayList' en vul op met de array "getallen"

    List<Integer> arrayList = new ArrayList<>(Arrays.asList(getallen));


Maak de linkedList "lijstInteger" en vul op met de inhoud van de arrayList:

	LinkedList<Integer> lijstInteger = new LinkedList<>(arrayList);


Voeg vooraan in "lijstInteger" getal 2 toe

	lijstInteger.add(0,2);

Voeg achteraan 12 toe

	lijstInteger.add(12);

Verwijder het eerste element van "lijstInteger" en toon op het scherm dmv printf

	int eersteElement = lijstInteger.remove(0);
    System.out.printf("%d\n", eersteElement);


Maak de LinkedList "lijstString" en vul op met de array "woorden"

	List<String> lijstString = new LinkedList<>(Arrays.asList(woorden));

Alle elementen van de lijst wijzigen: alle elementen worden met één verhoogd

	public void metEenVerhogen(List<Integer> lijst) 
    {
        //JAVA 7:
        
        ListIterator<Integer> it = lijst.listIterator();
        
        while(it.hasNext()){
            int getal = it.next();
            it.set(getal +1);
        }
    }

De elementen van lijst worden met één verhoogd en worden als nieuwe List<Integer> teruggegeven.

    public List<Integer> metEenVerhogen_java8(List<Integer> lijst) 
    {

	 ListIterator<Integer> it = lijst.listIterator();
        
        while(it.hasNext()){
            int getal = it.next();
            it.set(getal +1);
        }
	}

Alle elementen, met oneven index, verwijderen (enkel met een iterator werken)

	public <E> void elementenMetOnevenIndexVerwijderen(Collection<E> lijst){

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


Generieke methode: Alle elementen van de Collection<Integer> weergeven

	public <E> void weergevenLijst(String oplossing, Collection<E> lijst)
	{
        System.out.printf("%s\n%s", oplossing, "           ");

        //Java 7:
        for(E element : lijst )
        {
            System.out.printf("%s ", element);
        }
        
        System.out.println();
    }

	//Java 8: 

	lijst.forEach(s-> System.out.printf("%s ", s);


Na ieder oneven getal wordt hetzelfde getal+2 toegevoegd in de Lijst. Vb. 5 10 13 wordt 5 7 10 13 15

	 public void elementenToevoegenNaOnevenGetallen(List<Integer> lijst)
	{
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
    }


