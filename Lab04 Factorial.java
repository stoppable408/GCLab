import java.util.Scanner;

public class Lab04 {
	public static long getNum(Scanner input) {
		while (!input.hasNextLong()) {
			System.out.print("Invalid input. Please enter a valid number: ");
			input.nextLine();
		}
		long number = input.nextLong();
		if (number < 0 || number > 17) {
			do {
				System.out.print("Invalid Entry. Please enter a value between 1 and 17: ");
				number = input.nextLong();
			} while (number < 0 || number > 17);
		}
		return number;
	}

	public static long factorial(long number) {
		long result;
		if (number == 0) {
			return 1;
		}
		result = factorial(number - 1) * number;
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer;

		do {
			System.out.print("\nPlease enter a number between 1 and 17: ");
			long number = getNum(input);
			System.out.println("!" + number + " = " + factorial(number) + "\nContinue? (y/n): ");
			answer = input.next();
		} while (answer.equalsIgnoreCase("y"));

		System.out.println("\nThank you for using this program!");
	}

}
