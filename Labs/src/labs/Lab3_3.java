package labs;

public class Lab3_3 {

	public static void main(String[] args) {

		String str = "Carnivore";
		System.out.println(str);
		vowelConsonant(str);

	}

	public static String vowelConsonant(String str) {

		str = str.toLowerCase();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		int v = 0;
		int c = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == vowels[0] || ch == vowels[1] || ch == vowels[2] || ch == vowels[3] || ch == vowels[4])
				v += 1;
			else
				c += 1;

		}
		System.out.println("Vowels: " + v);
		System.out.println("Consonants: " + c);

		return str;

	}
}
