  import java.util.Scanner;

public class Lab02 {

	public static String monster(double number) {
		if (number < 3) {
			return "Demon";
		} else if ((number > 3) && (number < 6)) {
			return "Dragon";
		} else {
			return "HellHound";
		}

	}

	public static int health(double number) {
		if (number < 3) {
			return ((int) (Math.random() * 10) + 110);
		} else if ((number > 3) && (number < 6)) {
			return ((int) ((Math.random() * 50 + 220)));
		} else {
			return ((int) ((Math.random() * 20) + 75));
		}
	}

	public static boolean flee(String monsterName, int health, Scanner input) {

		boolean isStrike, isFlee;
		System.out.print("\nThe " + monsterName + " has " + health
				+ " health left. Will you strike again? or attempt to flee? Please type \"strike\" or \"flee\": ");
		do {
			String response = input.next();
			isStrike = response.equalsIgnoreCase("strike");
			isFlee = response.equalsIgnoreCase("flee");
			if (response.equalsIgnoreCase("flee")) {
				int attempt = (int) (Math.random() * 100);
				if (attempt > 50) {
					System.out.println("Your attempt to flee has succeeded");
					return true;
				} else {
					System.out.println("You fail at your attempt to flee, and the " + monsterName + " brings you back into battle and forces you to strike again!");
					return false;
				}
			} else if (response.equalsIgnoreCase("strike")) {
				return false;
			} else {
				System.out.println("You did not type \"strike\" or \"flee\" correctly. Please try again: ");
			}
		} while (!(isStrike || isFlee));
		return false;
	}

	public static boolean death(String monsterName, int health) {
		if (health <= 0) {
			System.out.println("\nYou've killed the " + monsterName + "! and saved the people!");
			return true;
		} else {
			return false;
		}
	}

	
	public static void bow(String monsterName, int health, Scanner input){
		health = bowAttack(monsterName, health, input);
		if (death(monsterName, health)) {
			return;
		}
		if (flee(monsterName, health, input)) {
			return;
		} else {
			health = bowAttack(monsterName, health, input);
		}
		if (death(monsterName, health)) {
			return;
		}
		if (flee(monsterName, health, input)) {
			return;
		} else {
			System.out.println("The " + monsterName
					+ " musters all of it's strength, and swings at your head, instantly crushing your skull. You've died, and subsequently failed your people.");
			return;
		}
	}
	
	public static void sword(String monsterName, int health, Scanner input){
		health = swordAttack(monsterName, health, input);
		if (death(monsterName, health)) {
			return;
		}
		if (flee(monsterName, health, input)) {
			return;
		} 
		else {
		health = swordAttack(monsterName, health, input);	
		}
		if (death(monsterName, health)) {
			return;
		}
		if (flee(monsterName, health, input)) {
			return;
		} else {
			System.out.println("The " + monsterName
					+ " musters all of it's strength, and swings at your head, instantly crushing your skull. You've died, and subsequently failed your people.");
			return;
		}
	}
	
	public static int bowAttack(String monsterName, int health, Scanner input){
		int accuracy = (int) ((Math.random()) * 10);
		int damage = 0;
		switch (accuracy){
		case 1:
		case 2:
		case 3:
		case 4:
			default:
			damage = (int) (Math.random() * 10) + 40;
		    health -= damage;
			System.out.println("\nYou fire your bow at the " + monsterName + "'s chest, dealing " + damage + " damage to the beast. It has " + health + " health remaining");
			return health;
		case 5:
		case 6:
			damage = (int) (Math.random() * 20);
			health -= damage;
			System.out.println("\nYou fire your bow at the " + monsterName + "'s foot, dealing " + damage + " damage to the beast. it has " + health + " health remaining");
			return health;
		case 7:
		case 8:
		case 9:
			damage = (int) (Math.random() * 10) + 60;
			health -= damage;
			System.out.println("\nYou fire your bow at the " + monsterName + "'s head, dealing " + damage + " damage to the beast. it has " + health + " health remaining");
			return health;
		case 10:
			damage = (int) (Math.random() * 20) + 100;
			health -= damage;
			System.out.println("\nYou fire your bow at the " + monsterName + "'s eye, dealing a critical hit of " + damage + " damage to the beast. it has " + health + " health remaining");
			return health;
		}
		
	}
	
	public static int swordAttack(String monsterName, int health, Scanner input){
		int accuracy = (int) ((Math.random()) * 10);
		int damage = 0;
		switch (accuracy){
		case 1:
		case 2:
		case 3:
		case 4:
			default:
			damage = (int) (Math.random() * 10) + 60;
		    health -= damage;
			System.out.println("\nYou swing at the " + monsterName + "'s chest, dealing " + damage + " damage to the beast. It has " + health + " health remaining");
			return health;
		case 5:
		case 6:
			damage = (int) (Math.random() * 10);
			health -= damage;
			System.out.println("\nYou swing at the " + monsterName + "'s foot, dealing " + damage + " damage to the beast. it has " + health + " health remaining");
			return health;
		case 7:
		case 8:
		case 9:
			damage = (int) (Math.random() * 10) + 85;
			health -= damage;
			System.out.println("\nYou swing at the " + monsterName + "'s head, dealing " + damage + " damage to the beast. it has " + health + " health remaining");
			return health;
		case 10:
			damage = (int) (Math.random() * 20) + 200;
			health -= damage;
			System.out.println("\nYou swing at the " + monsterName + "'s eye, dealing a critical hit of " + damage + " damage to the beast. it has " + health + " health remaining");
			return health;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isSwordTrue, isBowTrue;
		System.out.print("Greetings User! Press \"Enter\" to start the game: ");
		String response = input.nextLine();
		double randomizer = Math.random() * 10;
		String monsterName = monster(randomizer);
		int health = health(randomizer);
		if (response.isEmpty()) {
			System.out.print("\nGreat! the story continues. You walk into a dark room and see a large ");
			System.out.println(monsterName + " with " + health + " health.");
			System.out.print(
					"You see a bow to the left of you, and a sword to the right of you, which will you choose?: ");

			do {
				String weapon = input.next();
				isSwordTrue = weapon.equalsIgnoreCase("sword");
				isBowTrue = weapon.equalsIgnoreCase("bow");
				
				if (weapon.equalsIgnoreCase("bow")) {
					bow(monsterName,health,input);
				} else if (weapon.equalsIgnoreCase("sword")) {
					sword(monsterName, health, input);
				} else {
					System.out.println("You did not type \"bow\" or \"sword\" correctly. Please try again: ");
				}
			} while (!(isSwordTrue || isBowTrue));
			System.out.println("Thanks for Playing!");
		}

	}
}
