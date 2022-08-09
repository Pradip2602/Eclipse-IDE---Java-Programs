package snippet;

/* 
 * Interface --> interface are the blueprint of the class which specifies what to do but not how.
 * 	1. it is used to achieve abstraction.
 * 	2. it supports multiple inheritance.
 * 	3. it can be used to achieve loose coupling.
 * 	4. interface contains public abstract method by default.
 * 	5. all fields are(public,static,final)by default.
 * 	6. we can create public static methods in interface.
 * 	7. from java 8th version we can create default concrete methods in interface.
 * 	8. from java 9th version we can create private method in interface.
 * 
 */
interface Interf1{
	
	// fields are (public,static,final)by default.
	int a =10; 
	
	// public key word compiler will add
	void run(); 
	void show();
	
	// we can create default method with body.
	default void start() {
		System.out.println("default method with body");
	}
	
	// we can also create public static method with body.
	public static void read() {
		System.out.println("public static method");
	}
}

// multiple inheritance supported in interface
interface Interf2{
	void watch();
}

public class Interfce implements Interf1,Interf2 {

	// overriding method should contain greater or equal access modifier than overridden method.
	public void run() {
		System.out.println("this is 1st method");
	}
	
	public void show() {
		System.out.println("this is 2nd method");
	}
	public void watch() {
		System.out.println("This is multiple inheritance");
	}
	
	public static void main(String[] args) 
	{
		// we cannot instantiate interface 
		Interfce i = new Interfce();
		i.watch();
		i.run();
		i.show();
		i.start();
		Interf1.read();
		System.out.println(Interf1.a);
		
	}

}
