package labs;

import java.util.Scanner;

public class Lab2_2 {

	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the base of the triangle: ");
		double b = in.nextDouble();
		System.out.print("Enter the height of the triangle: ");
		double h = in.nextDouble();
		in.close();
		double a = b * h * 0.5;
		
		System.out.println("Thank you. The area of your triangle is " + a + ".");
		
		
	}

}
