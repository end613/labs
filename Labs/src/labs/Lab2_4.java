package labs;

import java.util.Scanner;

public class Lab2_4 {

	public static void main(String[] args) {

		int n;
		System.out.print("Enter a number: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		double d = (double) n;
		System.out.println("The number you entered is " + d);
		in.close();

	}

}
