import java.util.Scanner;

public class Palindrome_Number {

	static Scanner s = new Scanner(System.in);

	public static void isPalindrome(int n) {
		int num = n;
		int r, sum = 0;

		while (n != 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (num == sum) {
			System.out.println(num + " " + "is the palindrome number.");
		} else {
			System.out.println(num + " " + "is not the palindrome number.");
		}
	}

	public static void main(String[] args) {
		System.out.println("Please enter the number");
		int givenNum = s.nextInt();
		isPalindrome(givenNum);
		/*
		 * if you want to print multiple palindrome number then use for loop. for(int
		 * j=100; j<=1000;j++) { isPalindrome(j); }
		 */

	}

}
