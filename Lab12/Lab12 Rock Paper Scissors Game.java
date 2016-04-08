import java.util.Scanner;

public class Lab12 {
static int wins = 0;
static int losses = 0;
	public static void determineWin(int decision, String name, String adversary) {
		switch (decision) {
		case 1:
			System.out.println(adversary + " Wins!");
			losses++;
			break;
		case -3:
			System.out.println(adversary + " Wins!");
			losses++;
			break;
		case 2:
			System.out.println(adversary + " Wins!");
			losses++;
			break;
		case -1:
			wins++;
			System.out.println(name + " Wins!");
			break;
		case -2:
			wins++;
			System.out.println(name + " Wins!");
			break;
		case 3:
			wins++;
			System.out.println(name + " Wins!");
			break;
		case 0:
		default:
			System.out.println("Draw!");
			break;

		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RockPlayer brock = new RockPlayer();
		RandomPlayer randy = new RandomPlayer();
		String adversary = null, compChoice = null, answer;
		PlayerChoice player = new PlayerChoice();
		String playerChoice;
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println("\nEnter your name: ");
		String name = input.nextLine();

		adversary = getAdversary(input);

		do {

			if (adversary.equalsIgnoreCase("brock")) {
				compChoice = brock.generateRoshambo().toString().toLowerCase();
			} else {
				compChoice = randy.generateRoshambo().toString().toLowerCase();
			}
			playerChoice = player.generateRoshambo().toString().toLowerCase();
			System.out.println("\n" + name + ": " + playerChoice);
			System.out.println(adversary + ": " + compChoice);
			int decision = playerChoice.compareToIgnoreCase(compChoice);

			determineWin(decision, name, adversary);
			System.out.println("Play again? (y/n): ");
			answer = input.next();
		} while (answer.equalsIgnoreCase("y"));
		
		
		System.out.println(name + " has a total of " + wins + "wins. and a total of " + losses + " losses" );
		System.out.println("Thank you for playing!");
	}

	public static String getAdversary(Scanner input) {
		String playerChoice;

		System.out.println("Would you like to play against Brock or Randy?");
		playerChoice = input.next();
		if (playerChoice.equalsIgnoreCase("brock")) {
			return "Brock";
		} else if (playerChoice.equalsIgnoreCase("randy")) {
			return "Randy";

		} else {
			System.out.println("Invalid Entry.");
			return getAdversary(input);
		}

	}

}
