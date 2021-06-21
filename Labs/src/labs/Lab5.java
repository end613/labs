package labs;

public class Lab5 {

	public static void main(String[] args) {

		System.out.println("LAB 5\n\n");

//		Create string and pass into a character array

		String str = "De Bree";
		char[] charArray = str.toCharArray();

		for (char i : charArray) {
			System.out.println(i);
		}

//		Pass character array through methods

		countE(charArray);
		System.out.println("*****************\n\n");
		removeSpaces(charArray);
		System.out.println("*****************\n\n");
		findDuplicates(charArray);
		System.out.println("*****************\n\n");
		reverseOrder(charArray);
	}

	public static int countE(char[] charArray) {

// Count the occurrences of a single character in character array

		char e = 'e';
		int occ = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == e)
				occ += 1;
		}

		System.out.println("\nThe letter e" + " occurs " + occ + " times.\n\n");
		return occ;

	}

	public static String removeSpaces(char[] charArray) {

		// Create an empty String variable

		String newstr = "";

		// Run a for loop through the array

		for (int i = 0; i < charArray.length; i++)

			// Conditional logic: If the current index is not a space, add to the new String
			// variable

			if (charArray[i] != ' ')
				newstr += charArray[i];

		System.out.println("\n\nNew string without spaces: " + newstr + "\n\n");
		return newstr;

	}

	public static String findDuplicates(char[] charArray) {

		String duplicates = "";

		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == (charArray[j])) {
					duplicates += charArray[i];
				}
			}
		}
		System.out.println("\n\nDuplicates found: " + duplicates + "\n\n");
		return duplicates;
	}

	public static String reverseOrder(char[] charArray) {

		String string = new String(charArray);
		String words[] = string.split("\\s");

		String reverse = "";
		for (int i = words.length - 1; i >= 0; i--) {
				reverse += words[i] + " ";
			}
			System.out.println("String in reverse: " + reverse);
		
		return reverse;

	}
}