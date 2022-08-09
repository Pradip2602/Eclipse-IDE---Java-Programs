package snippet;

public class LearnConstructor {

	/* 1. Constructors are used to initializing the object.
		2. constructor does not have any return type and is not even void.
		3. public, protected, default, private only these access modifiers are used
		
	** Types of Constructor -->1.Default constructor 2.No Argument constructor(user defined)
	*							3. Parameterized constructor
	*1.Default constructor -->1. the compiler will create a default constructor if the user-defined constructor
	*							is not available.
	*2.No argument constructor --> it is a user-defined constructor without any parameter.
	*3. Parameterized constructor --> it is a user-defined constructor with a parameter.
	*
	*/
	
	
	// using this keyword for fields
	String name;
	int age;
	void setValues(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	void show() 
	{
		System.out.println(name+" "+age);
	}
	
	LearnConstructor()
	{
		System.out.println("this is no argument constructor");
	}
	
	LearnConstructor(int a)
	{
	System.out.println("this is parameterized constructor");	
	}
	
	public static void main(String[] args) 
	{
		LearnConstructor test = new LearnConstructor();
		LearnConstructor test1 = new LearnConstructor(10);
		test.setValues("Pradip",25);
		test.show();
		
	}
	
	
}

	
	

