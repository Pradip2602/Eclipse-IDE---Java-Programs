package snippet;

/*  Object Type Casting --> like data type casting we also type cast object
 * 2 type of object type casting -->1.Up casting(Child to Parent)
 * 									2.Down casting(Parent to Child)
 * 1.Up Casting--> it is the process of child class object type casted into the parent object. 
 * 				1.we can use implicitly or explicitly
 * 				2. we can use child class methods but not all.
 * 2. Down Casting--> it is the process of Parent class object type cast into the Child object. 
 * 				  1. we cannot use it implicitly(gives compile time error).	
 * 				  2. we can use the states and methods of both classes.
 * 				  3. we have to pass the reference of parent class in the child object.
 *  
 * */
 class Parent {
	 String name ;
	 
	 void showMessage() {
		 System.out.println("this is parent method");
	 }
 }
 class Child extends Parent{
	 int age ;
	 
	 @Override
	 void showMessage() {
		 System.out.println("this is child method");
	 }
 }

 public class ObjectCasting {

	public static void main(String[] args) {
		// Up casting
		Parent p = new Child();
		p.showMessage();
//		p.age = 18; //we have limited access of members of child
	
		// Down casting
//		Child c = new Parent(); cannot use implicitly(compile time error)
		Child c = (Child)p; // explicitly used
		c.showMessage();
		c.age = 18;
		c.name = "abc";		
	}

}
