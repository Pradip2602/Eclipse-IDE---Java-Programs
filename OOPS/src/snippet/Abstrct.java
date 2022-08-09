package snippet;

abstract class Vehicle
{
	double price ;
	String color ;
	abstract void run() ;   // abstract method does not have body
							// if we declare any method abstract then class also declare abstract.
}
class Car extends Vehicle
{
	void run() 
	{
		
			System.out.println("Car starts with key");
	}
}
class Bike extends Vehicle
{
	void run() // if any class extends abstract class the it should contain abstract method and its body.
		{
		
			System.out.println("Bike starts with kick");
		}
}
public class Abstrct 
{

	public static void main(String[] args) 
	{
	//we cannot create object of abstract class 
	// but we can create object of its child classes
		
		Car c = new Car();
		c.run();
		Bike b = new Bike();
		b.run();
	}

}
