# H20 - Generiek programmeren

It would be nice if we could write a single sort method that could sort the elements in an Integer array, a String array, or an array of any type that supports ordering.

Java Generic methods and generic classes enable programmers to specify, with a single method declaration, a set of related methods, or with a single class declaration, a set of related types, respectively.


## Generic Methods


You can write a single generic method declaration that can be called with arguments of different types. Based on the types of the arguments passed to the generic method, the compiler handles each method call appropriately. 

Rules: 

* All generic method declarations have a type parameter section delimited by angle brackets (< and >) that precedes the method's return type
* Each type parameter section contains one or more type parameters separated by commas. A type parameter, also known as a type variable, is an identifier that specifies a generic type name.
* The type parameters can be used to declare the return type and act as placeholders for the types of the arguments passed to the generic method, which are known as actual type arguments.
* A generic method's body is declared like that of any other method. Note that type parameters can represent only reference types, not primitive types (like int, double and char).

### Example

![](https://i.gyazo.com/c76952a74e958f470bb70fb560157b53.png)

## Bounded Type Parameters

For example: a method that operates on numbers might only want to accept instances of Number or its subclasses. This is what bounded type parameters are for.

### Example

![](https://i.gyazo.com/4a49090ae4ccabe3c4a74d5bbdad7f99.png)

## Generic classes

A generic class declaration looks like a non-generic class declaration, except that the class name is followed by a type parameter section.

As with generic methods, the type parameter section of a generic class can have one or more type parameters separated by commas. These classes are known as parameterized classes or parameterized types because they accept one or more parameters.

### Example

![](https://i.gyazo.com/2f048823c4049e1cf1d2cd259efea3db.png)


---
[https://www.tutorialspoint.com/java/java_generics.htm](https://www.tutorialspoint.com/java/java_generics.htm)

---

## Oefeningen in Theorie

###2 Generieke methoden

Schrijf de generieke methode "minimum" die het kleinste getal van een Collection van type E teruggeeft.

        private <E extends Comparable<E>> E minimum(Collection<E> lijst){
            
            return lijst.stream().min(E::compareTo).get();
        }

Schrijf de generieke methode geefAlleElementenKleinerDan
De methode heeft twee argumenten: een Collection van type E "lijst" en een element van type E "grens"
De methode geeft een arrayList van type E terug; alle elementen van "lijst" die kleiner zijn dan "grens" worden in de arrayList bewaard.
        
   	private <E extends Comparable<E>> List<E> geefAlleElementenKleinerDan(Collection<E> lijst, E grens) {
        List<E> nieuweLijst = new ArrayList<>();
         for(E element: lijst){
             if(element.compareTo(grens)<0) 
             {
             	nieuweLijst.add(element);
             } 
        }
        return nieuweLijst;
        
        //return lijst.stream().filter(e -> e.compareTo(grens) < 0).collect(Collectors.toList());
    }

Volgende oefening van theorie

	//schrijf een klasse die een set van Kat, Hond of Huisdier kan bevatten
	class VerzamelingHuisdier< E extends Huisdier >                                             
	{

    	//attribuut "huisdieren" = set van Kat, Hond of Huisdier
    	//--------------------------------------------------------------------------
    	private Set<E> huisdieren = new HashSet<E>();
    
		//getHuisdieren
		//-------------------
    	public Set<E> getHuisdieren(){
        	return Collections.unmodifiableSet(huisdieren);
    	}
    
		//methode add: een dier toevoegen in de set
		//------------------------------------------------------------
    	public void add(E dier){
        	huisdieren.add(dier);
    	}
	}	

	class Tools
	{

	//methode bevatHuisdier met twee argumenten: een huisdier en een set van Kat, Hond of Huisdier.
	//Geeft true terug indien het huisdier in de set voorkomt, anders false.

	//schrijf de static methode bevatHuisdier d.m.v. wildcards
	//------------------------------------------------------------------------------
	public static  boolean bevatHuisdier(Huisdier huisdier, Set<? extends Huisdier> huisdieren){
    	return huisdieren.contains(huisdier);
	}

	//schrijf de static methode bevatHuisdier2 d.m.v. generieke methode
	//---------------------------------------------------------------------------------------------
	public static <T extends Huisdier> boolean bevatHuisdier2(T huisdier, Set<T> lijstHuisdieren){
    	return lijstHuisdieren.contains(huisdier);
	}