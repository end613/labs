package labs;

public class Lab3_4 {

	public static void main(String[] args) {

		String str = "morning";
		System.out.println(str);
		charPos(str);
		

	}

	public static String charPos(String str) {
		
		String newStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			if(newStr.indexOf(ch) == -1)
				newStr += ch;
			else {
				
			}
			
			
		}
		System.out.println(newStr);
		return newStr;
		
		
	}
	
}
