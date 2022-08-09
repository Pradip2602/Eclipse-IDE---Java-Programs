package Collection;

/* Set --> it s an interface which extends collection and used to store linear data.
 * 1. it is not index based, it stores data according to hashcode values.
 * 2. it does not allow to store duplicate values.
 * 3.it does not follow insertion order.
 * 4.we can iterate(get) element by using Iterator interface.
 * 
 * Implemented Classes -->1.HashSet
 * 						  2.LinkedHashSet
 * 						  3.TreeSet
 * Interfaces --> 1.SortedSet
 * 				  2.NavigableSet
 */


import java.util.HashSet;
import java.util.Iterator;

	public class Set {
	
		public static void main(String[] args) {
	
			
			HashSet<Integer> h = new HashSet<Integer>();
			
			h.add(100);
			h.add(200);
			h.add(300);
			h.add(null);
			
			System.out.println(h);
			
			Iterator<Integer> itr = h.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		}
	
	}
