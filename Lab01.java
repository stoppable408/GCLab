import java.util.Scanner;

public class Lab01 {

	public static double validate(double number, Scanner input){
		
		if (number < 0) {
			do {
				System.out.print("Invalid Entry. Please input a positive number: ");
				number = input.nextDouble();
			} while (number < 0);
		}
		return number;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Grand Circus' Room Detail Generator!\n");
		String answer;

		do {
			System.out.print("Enter Length: ");
			double length = input.nextDouble();
			length = validate(length, input);
			
			System.out.print("Enter Width: ");
			double width = input.nextDouble();
		    width = validate(width, input);

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
