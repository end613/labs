package labs;

import java.util.Scanner;

public class Lab2_1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the radius of the circle?: ");
		double r = in.nextInt();
		in.close();
		double a = r * r * 3.14159;
		double c = 2 * r * 3.14159;
		System.out.println("The area of the circle is " + a + ".");
		System.out.println("The circumference of the circle is " + c + ".");
		
	}
	
	

}
