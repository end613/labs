package labs;

public class Lab3_2 {

	public static void main(String[] args) {

		String name = "Everett";

		System.out.println(name);
		System.out.println(removeDuplicates(name));

	}

	public static String removeDuplicates(String name) {

		String noDupe = "";

		for (int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);
			if (noDupe.indexOf(ch) == -1) {
				noDupe += ch;
			}
		}

		return noDupe;
	}

}