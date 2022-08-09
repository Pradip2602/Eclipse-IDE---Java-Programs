package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*	Iterator -->
 * 	Iterator is an interface provided in java.util.package for do traversal or iterating the collection.
 *	
 *	 hasNext() --> this method will check next element in collection and return boolean value.
 *	 Next() --> this method will return next object value.
 */
public class CollectionIterator {

	public static void main(String[] args) {

		List<String> sub = new LinkedList<>();
		
		sub.add("English");
		sub.add("Math");
		sub.add("Science");
		sub.add("Physics");
		sub.add("Chemistry");
		sub.add("Geography");
	
	// traversing the LinkedList element by for each loop.	
		for(String str:sub)
		{
			System.out.println(str);
		}
		
	System.out.println("*****FOR ITERATOR**********");	
		ArrayList marks = new ArrayList<>();	
		
		marks.add(55);
		marks.add(60);
		marks.add(75);
		marks.add(54);
		marks.add(63);
		marks.add(85);
		
	// traversing the ArrayList Element by Iterator.
		
		Iterator<Integer> itr = marks.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
