import java.util.Scanner;

public class oddEvenChecker {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");

		int num = s.nextInt();

		switch (num % 2) {
		case 0:
			System.out.println(num + " is even number");
			break;

		case 1:
			System.out.println(num + " is odd number");

		}

	}

}
