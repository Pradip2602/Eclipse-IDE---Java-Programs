package Collection;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;


/* TreeSet works like other Set but the values stored in TreeSet are by default in Ascending order.
 * TreeSet implements (SortedSet & NavigableSet).
 */
	
	public class DemoTreeSet {
	
		public static void main(String[] args) {
	
			NavigableSet <Integer> s =  new TreeSet<>();
			SortedSet <String> t =  new TreeSet<>();
			
				s.add(10);
				s.add(30);
				s.add(80);
				s.add(40);
				s.add(60);
				s.add(20);
				
				System.out.println(s);
				
				t.add("Pradip");
				t.add("Rahul");
				t.add("Amit");
				t.add("Shiv");
				t.add("Vijay");
			System.out.println(t);	
		}
	
	}
