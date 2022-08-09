

import java.util.ArrayList;
import java.util.Scanner;

public class TicketCounter {
	static Scanner scanner = new Scanner(System.in);

	static ArrayList<String> arrayList = new ArrayList<String>();
	static int[] price = new int[20];
	static int i;

	public static void main(String[] args) {

		int i = 1;
		for (;;) {
			int no = i;

			System.out.println(
					"For Bus ticket press : 1 / for Railway ticket press : 2 / for fight ticket press : 3 / for total amount press : 4");
			int n = scanner.nextInt();
			if (n == 1) {

				busTicket();

			} else if (n == 2) {

				railwayTicket();

			} else if (n == 3) {

				fightTicket();

			} else if (n == 4) {

				totalAmount();

			} else {
				System.out.println("Please enter valid input ");
			}
			i++;
		}
	}

	public static void totalAmount() {
		int sum = 0;
		for (int i = 0; i < price.length; i++) {
			sum = sum + price[i];
		}
		sum = sum + (sum*2)/100;
		System.out.println("Total Amount For Booking Tickets :::: "+sum +" RS");
	}

	public static void fightTicket() {
		System.out.println("Please enter from place: ");
		arrayList.add(scanner.next());
		System.out.println("Please enter to place: ");
		arrayList.add(scanner.next());
		System.out.println("Please enter seatNo: ");
		arrayList.add(scanner.next());
		System.out.println("Please enter no of ticket: ");
		int no = scanner.nextInt();
		System.out.println("Please enter price: ");
		 int yy =scanner.nextInt();
		int priceforticket = (yy * no)+((yy * no)*1)/100;
		System.out.println("Please enter weight of bag in Kg: ");
		int weightg = scanner.nextInt();
		if(weightg>15) {
			priceforticket = priceforticket+(priceforticket*3)/100;
		}
		price[i] = priceforticket;
		i++;

	}

	public static void railwayTicket() {
		System.out.println("Please enter from place: ");
		arrayList.add(scanner.next());
		System.out.println("Please enter to place: ");
		arrayList.add(scanner.next());
		System.out.println("Please enter seatNo: ");
		arrayList.add(scanner.next());
		System.out.println("Please enter seatType Second class / Second ac / Third Ac ");
		arrayList.add(scanner.next());
		System.out.println("Please enter no of ticket: ");
		int no = scanner.nextInt();
		System.out.println("Please enter price: ");
		price[i] = scanner.nextInt() * no;
		i++;

	}

	public static void busTicket() {
		System.out.println("Please enter from place: ");
		arrayList.add(scanner.next());
		System.out.println("Please enter to place: ");
		arrayList.add(scanner.next());
		System.out.println("Please enter seatNo: ");
		arrayList.add(scanner.next());
		System.out.println("Please enter no of ticket: ");
		int no = scanner.nextInt();
		System.out.println("Please enter price: ");
		price[i] = scanner.nextInt() * no;
		i++;

	}

}
