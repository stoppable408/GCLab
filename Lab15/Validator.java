import java.util.Scanner;

public class Validator {

	public static int getInt(Scanner input) {

		while (!input.hasNextInt()) {
			System.out.println("\nInvalid Entry. Please try again: ");
			input.next();
		}
		int number = input.nextInt();

		return number;

	}

	public static String getString(Scanner input) {

		String answer = input.next();

		return answer;
	}
}
