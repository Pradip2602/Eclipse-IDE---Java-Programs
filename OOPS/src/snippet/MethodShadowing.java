package snippet;

/* Method Shadowing -->  
 **  When superclass and subclass contain the same method including parameters and if they are static. 
 *	 The method in the superclass will be hidden by the one that is in the subclass.This mechanism is 
 *	 known as method shadowing.
 
 */

	class Parent1{
		String name;
		int age;
			
			 static void info(String name, int age) {
				
				System.out.println("The parent name :"+name);
				System.out.println("The parent age :"+age);
			}
	}
	class Child1 extends Parent1{
		String name;
		int age;
		
			 static void info(String name, int age) {
				
				System.out.println("The Child name :"+name);
				System.out.println("The Child age :"+age);
			}
	}
	
public class MethodShadowing {

	public static void main(String[] args) {
		
		// created reference of parent but loaded child class members(UpCasting)
		Parent1 p = new Child1();
		
	// Down casting (explicitly).
		Child1 c = (Child1)p;
		
		p.info("XYZ", 60); // memory given to child but parent method called
		c.info("ABC", 50); 
	}

}
