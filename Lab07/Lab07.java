import java.util.Scanner;

public class Lab07 {

	public static int getNum(Scanner input) {

		while (!input.hasNextInt()) {
			System.out.print("Invalid input. Please enter a valid number: ");
			input.nextLine();
		}
		int number = input.nextInt();
		if ((number < 0) || (number > 20)) {
			do {
				System.out.println("That emperor does not exist. Please try again. (enter a number 1-20): ");
				number = input.nextInt();
			} while ((number < 0) || (number > 20));
		}

		return number;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName, lastName, timeOfRule, death;
		System.out.print(
				"Welcome to the Classical Roman Emperor Database!. \nWhich emperor would you like to learn more about?\n(Enter a number 1-20): ");
		Emperor[] emperorList = Emperor.populateArray();
		int emperorNumber = getNum(input);

		firstName = emperorList[emperorNumber].getFirstName();
		lastName = emperorList[emperorNumber].getLastName();
		timeOfRule = emperorList[emperorNumber].getTimeInOffice();
		death = emperorList[emperorNumber].getDeath();

		System.out.print("Emperor Number " + emperorNumber + " is " + firstName + " " + lastName
				+ ". \nWhat would you like to know about " + firstName
				+ "? \n(Enter \"time\" for Time in Office, or \"death\" for Date of Death.): ");

	}

}
