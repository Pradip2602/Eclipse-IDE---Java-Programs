
import java.util.Scanner;

public class Reverse_Number {

	static Scanner s = new Scanner(System.in);
	
	public static void Reverse(int n) {
		int num = n;
		int rev=0 , r;
		
		while(num!=0) {
			r = num%10;
			rev = (rev*10)+r;
			num = num/10;
		}
		System.out.println("The reverse is:"+rev);
	}
	public static void main(String[] args) {
		
		System.out.println("Please enter the number");
		int givenNum = s.nextInt();
		
		Reverse(givenNum);
	}

}
