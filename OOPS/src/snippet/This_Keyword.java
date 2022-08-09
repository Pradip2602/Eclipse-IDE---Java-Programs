package snippet;
/*
 * 	This -->
 *	- This keyword refers the current class object.
 *	- we can use this keyword to call current class constructor. 
 *	- this must be at first line while constructor call.
 *
 * */

class Current{
	Current(int a){
		System.out.println("1st constructor");
	}
	Current(String a){
		this(10);
		System.out.println("2nd constructor");
	}
}
public class This_Keyword {

	public static void main(String[] args) {
		Current c = new Current("XY");
	}

}
