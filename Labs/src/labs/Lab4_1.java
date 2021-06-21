package labs;

import java.util.Scanner;

public class Lab4_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = input.nextInt();
		System.out.print("Enter b: ");
		int b = input.nextInt();
		System.out.println("The sum limit of " + a + " and " + b + " is " + sumLimit(a, b));
		input.close();
	}
	
	public static int sumLimit(int a, int b) {
		
		int sum = a + b;
		String sumLength = Integer.toString(sum);
		String aLength = Integer.toString(a);
		
		if(sumLength.length() == aLength.length()) {
			return sum;
		}
		else
			return a;
		
	}
}
