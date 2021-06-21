package labs;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] defg) {
		
		// max3 min3 median3
		
		int maxResult = max3(10, 14, 7);
		int minResult = min3(10, 14, 7);
		int medResult = median3(10, 14, 7);
		
		System.out.println("The results of max3 is " + maxResult);
		System.out.println("The results of min3 is " + minResult);
		System.out.println("The results of median3 is " + medResult);
		
		// xor
		boolean first = false;
		boolean second = true;
		System.out.println("The first value is " + first + ".");
		System.out.println("The second value is " + second + ".");
		System.out.println("The xor function is " + xor(first, second) + ".");
		
		// isFactor
		Scanner input = new Scanner(System.in);
		System.out.print("Enter for n: ");
		int n = input.nextInt();
		System.out.print("Enter for k: ");
		int k = input.nextInt();
		System.out.println(k + " is a factor of " + n + ": " + isFactor(n, k) + ".");
		
		// isPerfect
		System.out.println(n + " is a perfect number: " + isPerfect(n));
		
		// isPrime
		System.out.println(n + " is a prime number: " + isPrime(n));
		input.close();
	}
	

	
	// Modifier - Public, Private, Protected, <default>
	// Return Type
	// Method Name/Identifiers
	// Parameters/Args
	// Open the Scope
	
	
	// max3
	
	public static int max3(int v1, int v2, int v3) {
		int maxV = v1;
		
		if(v2 > maxV) { // T or F
			maxV = v2;
		}
		if(v3 > maxV) {
			maxV = v3;
		}
		return maxV;
		
	}
	
	// min3
	
	
	public static int min3(int v1, int v2, int v3) {

		if (v1 <= v2 && v1 <= v3);

		else if (v2 <= v1 && v2 <= v3);
		
		return v3;

	}
	
	// median3
	
	
	public static int median3(int v1, int v2, int v3) {

	    return (v1 + v2 + v3 - max3(v1, v2, v3) - min3(v1, v2, v3));

	}
	
	// xor
	
	public static boolean xor(boolean first, boolean second) {

		if (first == true && second == true) {
			return false;
		}
		if (first == false && second == false) {
			return false;
		} else {
			return true;
		}
	}
	
	// isFactor
	
	public static boolean isFactor(int n, int k) {
		return n % k == 0;
	}

	// isPerfect
	
	public static boolean isPerfect(int n) {
		
		int sum = 0;
		int k;
	
		for (k = 1; k < n; k ++)
		{
			if(isFactor(n, k))
				sum = sum + k;
		}
		if(n==sum)
		return true;
		return false;
	}
	
	// isPrime
	
	public static boolean isPrime(int n) {
		int counter;
		if (n < 2)
			return false;
		for (counter = 2; counter < n; counter++) {
			if (isFactor(n, counter))
				return false;
		}
		return true;
	}
	
}

