package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

/*	ListIterator -->
 * 	ListIterator is an interface which extends Iterator, its works like same Iterator.
 * 	but it has a feature to traverse in reverse direction.
 * 
 * 	hasPrevious --> this method will check previous element in collection and return boolean value.
 * 	previous --> it will return the previous object.
 * 
 *  This Interface is only used for List interface.
 */

public class CollectionListIterator {
	public static void main(String[] args) {
	
		LinkedList<Integer> num = new LinkedList<>();
		
		num.add(100);
		num.add(200);
		num.add(500);
		num.add(90);
		num.add(150);
		num.add(190);
	System.out.println("********forward Direction***********");
		
		// Traversing in forward direction.
			ListIterator fitr = num.listIterator();
			
			while(fitr.hasNext()) {
				System.out.println(fitr.next());
			}
			
	System.out.println("********Reverse Direction***********");
		
		// ListIterator can traverse in reverse direction also.	
			ListIterator itr = num.listIterator(num.size());
			
			while(itr.hasPrevious()) {
				System.out.println(itr.previous());
			}
	}
}
