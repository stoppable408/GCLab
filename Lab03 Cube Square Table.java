import java.util.Scanner;

public class Lab03 {

	
public static void main(String[] args) {
	
	
			Scanner input = new Scanner(System.in);
			String answer;
			System.out.println("Learn your squares and cubes!");
			
			do{
			System.out.print("\nEnter Your number: ");
			int number = input.nextInt();
			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t=======\t=====");
			for(int i=1;i<number; i++){
				
				System.out.printf("%1d\t%-1d\t%-1d\n", i,((int)Math.pow(i, 2)), ((int)Math.pow(i, 3)));
				
			}
		System.out.print("\nContinue? (y/n): ");
		answer = input.next();
			}while(answer.equalsIgnoreCase("y"));
System.out.println("Thank you for using this program!");
	input.close();
	}
}

