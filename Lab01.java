import java.util.Scanner;

public class Lab01 {

	public static double getNum(Scanner input) {
		
		while (!input.hasNextDouble()){
			System.out.print("Invalid Entry. Must be a number: ");
			input.nextLine();
		}
		double number = input.nextDouble();
		if (number < 0){
			do {
				System.out.print("Invalid Entry. Must be a positive number: ");
				number = input.nextDouble();
			}while(number < 0);
		}
		return number;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Grand Circus' Room Detail Generator!\n");
		String answer;

		do {
			System.out.print("Enter Length: ");
			double length = getNum(input);

			System.out.print("Enter Width: ");
			double width = getNum(input);

			System.out.println("Area: " + (length * width));
			System.out.println("Perimeter: " + (2 * (length + width)));
			System.out.println("Volume: " + (2 * (length * width)) + "\n");

			System.out.print("Continue? (y/n):");
			answer = input.next();
			System.out.println();
		} while (answer.equalsIgnoreCase("Y"));
		System.out.println("Finished!");
		input.close();
	}

}
