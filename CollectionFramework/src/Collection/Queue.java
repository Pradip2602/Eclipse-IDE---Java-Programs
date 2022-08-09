package Collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* Queue is specially work on FIFO(First IN First Out) concept for insertion and deletion.
 * 
 *  Implemented classes -->1.Priority Queue.
 *  					   2.LinkedList.
 *                         3.ArrayDequeue.(Dequeue implemented class)
 *  Interface --> Dequeue(doubly ended queue).
 *  			 (we can add and delete values from both end).
 */
public class Queue {

	public static void main(String[] args) {

	
		PriorityQueue <String> p = new PriorityQueue <>();
		
		p.add("Amit");
		p.add("Jay");
		p.add("Rahul");
		p.add("Vijay");
		System.out.println(p);
		
		ArrayDeque<Integer> q = new ArrayDeque <Integer> ();
		
		
		q.offer(100);
		q.offer(200);
		q.offer(300);
		q.offer(400);
		
		System.out.println(q);
		
		
	// adding the element from both end
		q.offerFirst(50);
		System.out.println("OfferFirst :"+q);
		q.offerLast(400);
		System.out.println("offerLast :"+q);
		
	// it will delete first element from Dequeue.
		System.out.println(q.poll()+"will be deleted");
		System.out.println("poll :"+q);
	// it will delete last element of Dequeue.
		System.out.println(q.pollLast()+"will be deleted");
		System.out.println("pollLast :"+q);

	// it will show first element from Dequeue.
		System.out.println(q.peek());
		
	// it will show last element of Dequeue.
		System.out.println(q.peekLast());
		
		
	}

}
