package snippet;

/* Wrapper classes :- wrapper classes are used to convert primitive into the object and vice versa.
 * 
 * Autoboxing :- automatically conversion of primitive type into the object type is known as Autoboxing.
 * Unboxing:- automatically conversion of object type into the primitive type is known as Unboxing.
 * 
 * Uses of Wrapper classes :-
 * 1. Change the value in method :- 
 *    Java supports only call by value. So, if we pass a primitive value,it will not change the original value. 
 * 	  But, if we convert the primitive value in an object, it will change the original value 
 * 	   
 * 2. Serialization :-
 * 	  We need to convert the objects into streams to perform the serialization. If we have a primitive value,
 *    we can convert it in objects through the wrapper classes.
 *  
 * 3. Synchronization :-
 *    Java synchronization works with objects in Multithreading. 
 * 
 * 4. java.util package: 
 *    The java.util package provides the utility classes to deal with objects.
 *    
 * 5. Collection Framework :-
 *    Java collection framework works with objects only. All classes of the collection framework
 *    deal with objects only.
 *
 */
public class Wrapper_Classes {

	public static void main(String[] args) {
		
		// Autoboxing --> primitive to object.
		int a =20;
		Integer i = Integer.valueOf(a); // converting int into Integer explicitly.
		Integer j = a ; //autoboxing, now compiler will write Integer.valueOf(a) internally
		
		System.out.println(a+" "+i+" "+j);
		
		// Unboxing --> object to primitive.
		Integer x = new Integer(3);
		
		int b = x.intValue(); // converting Integer to int explicitly.
		int c = x ;// unboxing, compiler will write x.intValue.
		
		System.out.println(x+" "+b+" "+c);
		
	}

}
