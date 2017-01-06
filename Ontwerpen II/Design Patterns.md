# Design Patterns

## Decorator Pattern

Ons doel is dat klassen eenvoudig uitgebreid kunnen worden om nieuw gedrag te incorporeren zonder de bestaande code te wijzigen.

Het Decorator Pattern kent dynamisch additionele  verantwoordelijkheden toe aan een object. Decorators bieden  een flexibel alternatief voor het gebruik van subklassen om functionaliteiten uit te breiden.

![](https://i.gyazo.com/f41b850bcf10d4e1771f30eff46090fa.png)

**Voorbeeld:**

![](https://i.gyazo.com/4707cc3f07a4eeb4941c1ed36ad62e72.png)



## Facade Pattern

Het façade pattern verbergt alle complexiteit van één of meer klassen achter een nette, goed belichte façade. 

![](https://i.gyazo.com/427657942d190303454d1d4f8d88a616.png)

Het Facade Pattern zorgt voor een vereenvoudigde interface naar een verzameling interfaces in een subsysteem. De façade definieert een interface op een hoger niveau zodat het gebruik van het subsysteem vereenvoudigt. 

De client heeft maar 1 rechtstreekse vriend en dit is de Facade. Dit is het principe van kennisabstractie. 

**Voorbeeld op Kennisabstractie**

![](https://i.gyazo.com/9d65de23d12ac10769ecb776d32abe59.png)



## Observer Pattern

Het Observer Pattern definieert een één-op-veel-relatie  tussen objecten, zodanig dat wanneer de toestand van een  object verandert, alle afhankelijke objecten worden bericht en automatisch worden geüpdatet.

![](https://i.gyazo.com/5a56edfff8ed09aa8a368e60d8765a81.png)



## Simple Factory

Voorbeeld van een pizzastore. Als we pizza's willen toevoegen of verwijderen moeten we steeds in de code gaan duiken om deze aan te passen. We gaan hiervoor Simple Factory toepassen. We gaan een klasse PizzaFactory toevoegen waar we alleen maar pizza's maken. En in de klasse PizzaStore gaan we de Factory oproepen. 

![](https://i.gyazo.com/c051af3946d9f25f846d455f89f721f0.png)



## State Pattern

Het State Pattern maakt het voor een object mogelijk zijn gedrag te veranderen wanneer zijn interne toestand verandert. Het object lijkt van klasse te veranderen. 

![](https://i.gyazo.com/65865d02bc7cf3663f50c0d7b9ebcd6d.png)

1. We verzamelen de toestanden
2. We maken een instantievariabele om de huidige toestand te bevatten, en definiëren we waarden voor iedere toestand
3. We verzamelen alle acties
4. Voor iedere actie maken we een methode

![](https://i.gyazo.com/e87ca48e6dacd4aa96a70f426e3727f1.png)




## Strategy Pattern

Elemineren van gedupliceerde code.

Het Strategy Pattern definieert een familie algoritmen, isoleert ze en maakt ze uitwisselbaar. Strategy maakt het  mogelijk om het algoritme los van de client die deze gebruikt, te veranderen.

![](https://i.gyazo.com/3c624dbe55c0912af8b29891f317cfa1.png)

Hier wordt het voorbeeld van de eenden toegepast. Hierin maakt men gebruik van verschillende soorten eenden maar deze kunnen niet allemaal vliegen. Om dit eenvoudig op te lossen worden interfaces toegevoegd FlyBehavior met daaraan nog klassen die het vliegen nog meer specifieren. Nu kunnen we eenden doen vliegen die dit kunnen en de badeenden kunnen niet vliegen.

![](https://i.gyazo.com/e0199c26332ff334b560f1a14f271f94.png)

### Zie Oefeningen 