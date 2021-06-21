package labs;

import java.util.Scanner;

public class Lab2_6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double d = in.nextDouble();
		int n = (int) (d + 0.5);
		System.out.println("You entered " + d + ". The new value is " + n + ".");
		in.close();
		
		
	}

}
