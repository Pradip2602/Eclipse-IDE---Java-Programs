package snippet;

/*
 *  Recursive Method --> The method which calls itself continuously is called Recursive method.
 */
public class Recursive_Demo {

	 void run() {
			System.out.println("this is recursive method");
			run();
		}
		 int count = 0;
		 void limited() {
			count++;
			if(count<=5) {
				System.out.println("Hello"+count);
				limited();
			}
		 }
		 
	public static void main(String[] args) {

		Recursive_Demo d = new Recursive_Demo();
		//	d.run(); // this method run infinite till stack overflow.
			d.limited(); // this is the finite method
	}

}
