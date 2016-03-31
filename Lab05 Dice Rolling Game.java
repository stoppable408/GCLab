import java.util.Random;
import java.util.Scanner;

public class Lab05 {
	public static int getNum(Scanner input) {

		while (!input.hasNextInt()) {
			System.out.print("Invalid input. Please enter a valid number: ");
			input.nextLine();
		}
		int number = input.nextInt();
		return number;

	}

	public static int roll(int number) {
		Random random = new Random();
		int result = random.nextInt(number);
		if (result == 0) {
			return roll(number);
		}
		return result;

	}

	public static void message(int firstRoll, int secondRoll, int sides) {
		System.out.println("Roll 1: \n" + firstRoll + "\n" + secondRoll);

		if ((firstRoll == 1) && (secondRoll == 1) && (sides == 6)) {
			System.out.println("\nSnake eyes!");
		}
		if ((firstRoll == 6) && (secondRoll == 6) && (sides == 6)) {
			System.out.println("\nBox Cars!");
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer;
		do {
			System.out.print("Please enter the numer of sides the two dice have: ");
			int number = getNum(input);
			message(roll(number), roll(number), number);
			System.out.print("\nRoll again? (y/n): ");
			answer = input.next();

		} while (answer.equalsIgnoreCase("y"));

		System.out.println("thank you for using this program!");

	}

}
