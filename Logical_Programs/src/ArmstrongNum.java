import java.util.Scanner;

public class ArmstrongNum {

	static Scanner s = new Scanner(System.in);

	public static void armsNum(int n) {
		int num = n;
		int len = 0;
		// finding length of number.
		while (num != 0) {
			len = len + 1;
			num = num / 10;
		}
		// checking the number armstrong or not
		int num2 = n;
		int r, arm = 0;

		while (num2 != 0) {
			int mult = 1;
			r = num2 % 10;
			for (int i = 1; i <= len; i++) {
				mult = mult * r;
			}
			arm = arm + mult;
			num2 = num2 / 10;
		}
		if (arm == n) {
			System.out.println(n + " " + "is armstrong number");
//			System.out.println(n);
		} else {
			System.out.println(n + " " + "is not armstrong number");
		}
	}

	public static void main(String[] args) {
		System.out.println("please enter the number");
		int givenNum = s.nextInt();
		armsNum(givenNum);

		/*
		 * print multiple armstrong number.
		 * 
		 * for(int j=1; j<=1000; j++) { armsNum(j); }
		 */
	}

}
