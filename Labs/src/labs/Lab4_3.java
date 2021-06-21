package labs;

import java.util.Scanner;

public class Lab4_3 {

	public static void main(String[] args) {

//		You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. 
//		If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.
//		Test cases
//		greenTicket(1, 2, 3) > 0
//		greenTicket(2, 2, 2) > 20
//		greenTicket(1, 1, 2) > 10

		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.println("Please enter the numbers from your green lottery ticket");
		System.out.print("a: ");
		a = input.nextInt();
		System.out.print("b: ");
		b = input.nextInt();
		System.out.print("c: ");
		c = input.nextInt();
		System.out.println("Your numbers \n a: " + a + "\n b: " + b + "\n c: " + c);
		input.close();

		System.out.println("Your prize is " + greenTicket(a, b, c) + " points.");

	}

	public static int greenTicket(int a, int b, int c) {
		if (a == b && b == c)
			return 20;
		if (a == b || b == c || a == c)
			return 10;
		else
			return 0;

	}

}
