package ui;
import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.*;
/*
Maak gebruik van Scanner om enkele regeltjes tekst in te lezen
Plaats de woordjes zowel op Stack , Queue als PriorityQueue.
Druk dan de woordjes in drie kolommen (20 breed) af,
eerste kolom uit Stack, tweede uit Queue, derde uit PriorityQueue
VB:
invoer -->
een twee drie vier vijf zes zeven acht negen tien

uitvoer -->
               Stack               Queue       PriorityQueue

                tien                 een                acht
               negen                twee                drie
                acht                drie                 een
               zeven                vier               negen
                 zes                vijf                tien
                vijf                 zes                twee
                vier               zeven                vier
                drie                acht                vijf
                twee               negen                 zes
                 een                tien               zeven


*/

public class OefStackQueue_opgave
{
	public static void main(String args[])
	{	Scanner in = new Scanner(System.in);
                String[] lijst = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien"};
                
		//definieer stack, queue en pqueue

                Deque<String> stack = new ArrayDeque<>();
                Queue<String> queue = new ArrayDeque<>();
                Queue<String> pqueue = new PriorityQueue<>();
                

		//lees woord per woord en plaats in de drie containers

                int teller = 1;
                while(teller++ <= 10)
                {
                    String w = in.next();
                    stack.push(w);
                    queue.offer(w);
                    pqueue.offer(w);
                }

	  	//druk hoofding
                
                System.out.printf("%20s%20s%20s\n\n", "Stack","Queue","PriorityQueueu");

                
	  	//zolang containers niet ledig, druk een regel met betreffende woord

                while(!stack.isEmpty()){
                    System.out.printf("%20s%20s%20s\n",stack.pop(),queue.poll(),pqueue.poll());
                }
	}
}