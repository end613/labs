package labs;

import java.util.Scanner;

public class Lab4_2 {

	public static void main(String[] args) {

//		The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 
//		(inclusive). Unless it is summer, then the upper limit is 100 instead of 90. 
//		Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise. 
//			Test cases
//			squirrelPlay(70, false) > true
//			squirrelPlay(95, false) > false
//			squirrelPlay(95, true) > true		

		Scanner input = new Scanner(System.in);
		int temperature;
		String summerTime;
		boolean summer;
		System.out.print("Welcome to Palo Alto! What is the temperature (F) today?: ");
		temperature = input.nextInt();
		System.out.print("Thanks! Is it currently Summer? Please enter yes or no only: ");
		summerTime = input.next();
		input.close();

		if (summerTime.equalsIgnoreCase("yes")) {
			summer = true;
			squirrelPlay(temperature, summer);
		} else if (summerTime.equalsIgnoreCase("no")) {
			summer = false;
			squirrelPlay(temperature, summer);
		} else {
			System.out.println("INVALID INPUT");
		}

	}

	public static void squirrelPlay(int temperature, boolean summer) {

		if (summer == true && temperature <= 100 && temperature >= 60)
			System.out.println("The squirrels will be out playing today!");
		else if (summer == false && temperature <= 90 && temperature >= 60)
			System.out.println("The squirrels will be out playing today!");
		else
			System.out.println("The squirrels will not be out playing today.");

	}

}
