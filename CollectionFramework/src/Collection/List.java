package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* List -->
 * 1.it is interface which extends Collection Interface and have implemented classes used to store linear data 
 * 2. it is index based data structure.
 * 3. its follows insertion(data at first index will retrive first).
 * 4. it can store duplicate values also.
 * 5. we can iterate(get) data by using Iterator and ListIterator.
 * 
 * Implemented Classes --> 1.ArrayList
 * 						   2.LinkedList
 * 						   3.Vector(legacy class)
 * 						   4.Stack(legacy class)
 * Legacy Class --> before collection java consist of data structures classes which modified and added in java
 * 					1.2 version these classes known as Legacy Classes(Vector,Stack)
 */

public class List {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		al.add("Pradip");
		al.add("Rahil");
		al.add("Amit");
		al.add("Vijay");
		al.add("Shiv");

		LinkedList<Integer> l = new LinkedList<>();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);

		// Iterator is interface which is used to get values.
		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// ListIterator is interface specially used to get values inside the list.
		ListIterator itr1 = l.listIterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
