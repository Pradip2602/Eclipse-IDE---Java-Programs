package snippet;

// compile-time or static polymorphism 
// method overloading(methods with same name within same class) but diff. arguments
class Chair
{
	void seat(int price , String color)   //
	{
		System.out.println(price);
		System.out.println(color);
	}
	void seat(double height , String brand )
	{
		System.out.println(height);
		System.out.println(brand);
	}
	
}

// run time  or dynamic polymorphism
// method overidding (methods with same name in diff. class) but same arguments
// and have inheritance
class Cellphone
{
	void run() 
	{
		System.out.println("runs on symbian");
	}
}

class Smartphone extends Cellphone
{
	void run() 
	{
		System.out.println("runs on android");
	}
}

public class Polymorph 
{

	public static void main(String[] args) 
	{

		Chair c = new Chair();
		c.seat(1000,"black");
		c.seat(12.5,"kamal");
		
		Cellphone cl = new Cellphone();
		cl.run();
		Smartphone s = new Smartphone();
		s.run();
	}

}
