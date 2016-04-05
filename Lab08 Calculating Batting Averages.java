import java.util.Scanner;

public class Lab08 {

		public static void main(String[] args){
			
			Scanner input = new Scanner(System.in);
			double count = 0;
			double total = 0;
			String anotherOne = "";
			
			do{
				
				System.out.println("Enter number of at-bats: ");
				int index = input.nextInt();
				int[] atBats = new int[index];
				
				System.out.println("Enter the number of bases for each at bat: "
						+ "\n \t '0' for no bases."
						+ "\n \t '1' for a single."
						+ "\n \t '2' for a double."
						+ "\n \t '3' for a triple."
						+ "\n \t '4' for home run.");
				
				for (int i = 0; i < atBats.length; i++) {
					
					System.out.println("Bases for at bat " +(i+1) +": ");
					atBats[i] = input.nextInt();
					total += atBats[i];
					
					if(atBats[i] > 0)
						count++;	
				}
				
				System.out.println("The batting average is: " + (count/atBats.length));
				System.out.println("The slugging average is: " + (total/atBats.length));
				
				System.out.println("Another batter? Enter (Y/N): ");
				anotherOne = input.next().toLowerCase();
			
			}while(anotherOne.equalsIgnoreCase("y"));
			
			System.out.println("Goodbye.");
			
			input.close();
		
	}

}
