/*	Constructor Chaining -->
 * -Constructor chaining is the sequence of invoking constructors.
 * - it is used when we want to invoke no. of constructors one after another while creating
 * 	 only one instance.
 * 
 * Rules -->
 * 1) this keyword must be first line of constructor.
 * 2) there must be at least one constructor without this keyword.
 * 
 *  
 * 
 */
class Chain {
	Chain() 
	{
		System.out.println("This is default constructor");
	}

	Chain(int a, String b) 
	{
		this('a');
		System.out.println("This is 1st constructor");
	}

	Chain(char c) 
	{
		this();
		System.out.println("This is 2nd constructor");
	}
}
public class Constructor_Chaining {

	public static void main(String[] args) {

		Chain ch = new Chain('a');

	}

}
