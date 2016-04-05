import java.util.Scanner;

public class Lab09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer;
		
		System.out.println("Welcome to the Circle Tester");

		do {

			System.out.print("Enter radius: ");
			double radius = input.nextDouble();
			Circle circle = new Circle(radius);
			circle.getArea();
			circle.getCircumference();
			String circumference = circle.getFormattedCircumference();
			String area = circle.getFormattedArea();
			System.out.println("Circumference: " + circumference);
			System.out.println("Area: " + area);
			System.out.print("Continue? (y/n): ");
			answer = input.next();
		
				
		} while (answer.equalsIgnoreCase("y"));
		
		int count = Circle.getObjectCount();
	
		System.out.println("\nGoodbye. You created "+ count+ " Circle object(s).");
		
		input.close();

	}

}
