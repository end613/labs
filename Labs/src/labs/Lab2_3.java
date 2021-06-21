package labs;

import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		
		// 3. Write a method to prompt the user for a number then display check if the number is Even or Odd.
		
		int n, r;
		System.out.println("Enter number");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		in.close();
		
		r = n % 2;
		
		if(r == 0)
			System.out.println(n + " is an even number.");
		else
			System.out.println(n + " is an odd number.");

	}
	

}
