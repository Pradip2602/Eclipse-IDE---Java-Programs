package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/* Map is an interface that extends the Iterable Interface and contains implemented classes and interfaces.
 * 1. Map stores data on basis of key-value pair.
 * 2. It does not allow the storage of duplicate keys but provides to the storage of duplicate values.
 * 3. Map is is useful for search,update,delete elements.
 * 
 * implemented classes --> 1.HashMap
 * 					       2.LinkedHashMap
 * 					       3.HashTable
 * 					       4.TreeMap(implements Sorted&NavigableMap)
 * Interfaces ---> 1.SortedMap
 				   2.NavigableMap
 				   
 */

public class Map {

	public static void main(String[] args) {

		HashMap<Integer, String> m = new HashMap<Integer, String>();

		m.put(101, "Mayuri");
		m.put(102, "Pradip");
		m.put(103, "Amit");
		m.put(104, "Shweta");

//		System.out.println("Keys  = " + m.keySet());
//		System.out.println("values = " + m.values());
//		System.out.println("The KV pair = " + m.entrySet());
//		System.out.println(m);

		// iterating the values By Iterator.
		
//		Iterator <Entry<Integer,String>> itr = m.entrySet().iterator();
//		
//		while(itr.hasNext()) {
//			Entry<Integer,String> entry = itr.next();
//			
//			System.out.println("ID : "+entry.getKey()+"\n"+
//								"name :"+entry.getValue());
//		}
		
		// getting keys and values by for each loop.
		
		for(int id:m.keySet()) {
			System.out.println("Students ID: "+id);
		}
		for(String name:m.values()) {
			System.out.println("Students Name: "+name);
		}
	}
}
