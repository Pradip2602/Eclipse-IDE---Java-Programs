package snippet;
/*	Super -->
 * 	-Super keyword is used to call immediate parent class constructor by the base class.
 * 	- super keyword must at first line.
 * 
 */

class Super{
	Super(int a){
		System.out.println("Super class constructor is called");
	}
}
class Base extends Super{
	Base(){
		super(10);
		System.out.println("Base class constructor is called");
	}
}
public class Super_Keyword {

	public static void main(String[] args) {

		Base b = new Base();
	}

}
