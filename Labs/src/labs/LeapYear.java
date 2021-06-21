package labs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int year;

		System.out.print("Enter a 4-digit year: ");
		year = in.nextInt();
		in.close();

		if (leapYear(year) == true) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}

	}

	public static boolean leapYear(int year) {
		
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					return true;
			}
		}
		else {
			return false;
		}
		return true;
			
		
		

	}
}