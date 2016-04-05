import java.util.Scanner;

public class Lab07 {
	static String firstName, lastName, timeOfRule, death;
	static Scanner input = new Scanner(System.in);
	static String answer;
	public static int getNum() {

		while (!input.hasNextInt()) {
			System.out.print("Invalid input. Please enter a valid number: ");
			input.nextLine();
		}
		int number = input.nextInt();
		if ((number < 0) || (number > 11)) {
			do {
				System.out.println("That emperor does not exist. Please try again. (enter a number 1-11): ");
				number = input.nextInt();
			} while ((number < 0) || (number > 11));
		}

		return number;

	}

	public static void timeOrDeath() {
		String answer;
		boolean isTime = false, isDeath = false;

		System.out.println("\nWhat would you like to know about " + firstName
				+ "? \n(Enter \"time\" for Time in Office, or \"death\" for Date of Death.): ");
		do {

			answer = input.next();

			if (answer.equalsIgnoreCase("time")) {
				System.out.println(firstName + " " + lastName + " spent " + timeOfRule + " in Office.");
				isTime = true;
			} else if (answer.equalsIgnoreCase("death")) {
				System.out.println(firstName + " " + lastName + " died on " + death);
				isDeath = true;
			} else {
				System.out.println("You entered an incorrect word. Please try again: ");
			}
		} while (!(isTime || isDeath));
	}

	public static void main(String[] args) {
		boolean isKnow = false, isChoose = false;
		Emperor[] emperorList = Emperor.populateArray();

		do {
			
			System.out.print(
					"Welcome to the Classical Roman Emperor Database!. \nWhich emperor would you like to learn more about?\n(Enter a number 1-11): ");

			int emperorNumber = getNum();

			firstName = emperorList[emperorNumber - 1].getFirstName();
			lastName = emperorList[emperorNumber - 1].getLastName();
			timeOfRule = emperorList[emperorNumber - 1].getTimeInOffice();
			death = emperorList[emperorNumber - 1].getDeath();

			System.out.print("Emperor Number " + emperorNumber + " is " + firstName + " " + lastName + ".");

			timeOrDeath();

			
			do {
				isChoose = false;
				System.out.println(
						"\nWould you like to know more?\nWould you like to choose another Emperor?\nor Would you like to quit?: ");
				System.out.println("\nType \"know\" to get more information about you current Emperor.");
				System.out.println("Type \"choose\" to choose another Emperor.");
				System.out.print("otherwise, type anything to quit: ");
				answer = input.next();
				if (answer.equalsIgnoreCase("know")) {
					timeOrDeath();
				} 
				else if (answer.equalsIgnoreCase("choose")) {
					isChoose = true;
					continue;
				}
				else if (answer.equalsIgnoreCase("quit")){
					break;
				}
				else{
					System.out.println("Invalid Entry.");
					isChoose = false;
				}
				
			} while (!isChoose);
		} while ((isKnow)||(isChoose));
		
System.out.println("\nThank you for accessing the Emperor Database!");
	}

}
