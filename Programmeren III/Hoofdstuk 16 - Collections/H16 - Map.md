# Hoofdstuk 16 - Collections

## Map

Maak de lege hashMap "auteurs"; de sleutel is van type Integer, de waarde van type Auteur

	Map<Integer, Auteur> auteurs = new HashMap<>();

Voeg toe aan de hashmap: auteursID = 1234, naam = Chevallier, voornaam = Robert
Voeg toe aan de hashmap: auteursID = 9876, naam = Gosling, voornaam = James
Voeg toe aan de hashmap: auteursID = 5648, naam = Chapman, voornaam = Steve

	auteurs.put(1234, new Auteur("Chevallier", "Robert"));
    auteurs.put(9876, new Auteur("Gosling", "James"));
    auteurs.put(5648, new Auteur("Chapman", "Steve"));


Wijzig de voornaam van Chapman: John ipv Steve

    Auteur chapman = auteurs.get(5648);
    chapman.setVoornaam("John");

Komt de auteursID 1234 voor in de hashmap

    if (auteurs.containsKey(1234))
		System.out.println("auteursID 1234 komt voor\n");
    else
		System.out.println("auteursID 1234 komt niet voor\n");

Toon de naam en voornaam van auterusID 5648
	
	Auteur auteur = auteurs.get(5648);
	if (auteur != null)
		System.out.println(auteur);


Maak nieuwe treeMap met de hashmap auteurs. En roep de methode toonAlleSleutels op

	Map<Integer, Auteur> treeMap = new TreeMap<>(auteurs);
    toonAlleSleutels(treeMap);


Alle sleutels van de map worden op het scherm weergegeven.

    public void toonAlleSleutels(Map<Integer, Auteur> map) {
        
        for (Integer eenAuteursID : map.keySet()) {
            System.out.println(eenAuteursID);
        }
        System.out.println();
    }

Alle gegevens van de map worden op het scherm weergegeven. Per lijn wordt een auteursnr, naam en voornaam weergegeven.
	
	public void toonAlleAuteurs(Map<Integer, Auteur> map) {
        
        for(Map.Entry<Integer,Auteur> eenEntry: map.entrySet()){
            Auteur auteur = eenEntry.getValue();
            System.out.printf("%d\t%s\n", eenEntry.getKey(), auteur);
        }
        System.out.println();
    }


	