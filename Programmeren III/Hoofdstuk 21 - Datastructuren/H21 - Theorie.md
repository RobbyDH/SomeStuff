# H21 - Datastructuren 

## Gelinkte lijsten

Hier wordt gebruik gemaakt van knopen. Elke knoop bevat data + een link naar de volgende. Enkel de laatste knoop bevat null. 

eerste knoop = firstNode

laatste knoop = lastNode


In de oefening maken we een MyList waarin we de methoden aanmaken en gebruik maken van de Nodes. 

In de Exception klasse maken we een exception indien de lijst leeg is. 

## Stack

Bij een stack kunnen we enkel vanvoor toevoegen en ook enkel vanvoor verwijderen. 

Push = nieuwe knoop wordt op de top van de stack geplaatst.

Pop = knoop die op de top van de stack staat wordt verwijderd.

In de oefening maken we gebruik van de methodes van MyList om de methodes van stack in te vullen. 

## Queue (wachtrij)

Dit werkt volgens het FIFO principe. Wie eerst binnenkomt gaat er ook als eerste terug uit. Bijvoorbeeld zoals aan een loket. 

Offer: element toevoegen aan de queue

poll: element verwijderen van de queue

## Lijst lezen en schrijven
Maken eerst een nieuwe stack aan en geven deze de naam sleutelwoordenlijst. 

Met de try-catch gaan we proberen te lezen en schrijven. 

Try: Om te lezen maken we een scanner met een FileInputStream en geven ons tekstbestand mee. Ook met Formatter een nieuw tekstbestand maken.

Vervolgens in de try met de eerste while loop elk woord lezen en in de stack plaatsen en met de volgende while naar een ander bestand schrijven.

Catch is voor als we de file niet vinden. 

	MyStack stack = new MyStack("sleutelwoordenlijst");

        try(Scanner scanner = new Scanner(new FileInputStream("Sleutelwoorden.txt"));
                Formatter uit = new Formatter("Omgekeerd.txt"))
		{
            
            while(scanner.hasNext()){
                stack.push(scanner.nextLine());
			}
            
            while(!stack.isEmpty()){
                uit.format("%s%n" , stack.pop());
            }
                
        }
        catch(FileNotFoundException ex){
            System.err.println("Error");
            System.exit(1);
        }

## Iterator

In general, to use an iterator to cycle through the contents of a collection, follow these steps −

* Obtain an iterator to the start of the collection by calling the collection's iterator( ) method.

* Set up a loop that makes a call to hasNext( ). Have the loop iterate as long as hasNext( ) returns true.

* Within the loop, obtain each element by calling next( ).

For collections that implement List, you can also obtain an iterator by calling ListIterator.

![](https://i.gyazo.com/e1df4f09afcdee207b54e9eaa7061686.png)

![](https://i.gyazo.com/485a92121c13d817993e32e9a80fad3c.png)

[Link voor meer uitleg over iterator](https://www.tutorialspoint.com/java/java_using_iterator.htm)