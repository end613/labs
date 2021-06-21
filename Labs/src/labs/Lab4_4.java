package labs;

import java.util.Scanner;

public class Lab4_4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter string: ");
		String str = in.next();
	System.out.println(countRepeats(str));
	in.close();
}
	
	public static int countRepeats(String str) {

		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("xx")) 
				count++;
		}
		
		return count;
		

	}
	
}