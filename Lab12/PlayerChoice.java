import java.util.Scanner;

public class PlayerChoice extends Player {

	@Override
	Roshambo generateRoshambo() {
		Scanner input = new Scanner(System.in);
		String choice;
		boolean answer = false;
		System.out.println("Rock, paper or scissors?");
		do{
		
		System.out.print("Please enter \"rock\", \"paper\" or \"scissors\": ");
		choice = input.next();
		
		if(choice.equalsIgnoreCase("rock")){
			answer = true;
			return Roshambo.ROCK;
		}
		else if(choice.equalsIgnoreCase("paper")){
			answer = true;
			return Roshambo.PAPER;
		}
		else if(choice.equalsIgnoreCase("scissors")){
			answer = true;
			return Roshambo.SCISSORS;
		}
		else{
			System.out.println("Invalid Entry.");
		}
		}while(!answer);
		return null;
	}

}
