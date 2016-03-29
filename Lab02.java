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
			return ((int) (Math.random() * 10) + 200);
		} else if ((number > 3) && (number < 6)) {
			return ((int) ((Math.random() * 50 + 400)));
		} else {
			return ((int) ((Math.random() * 20) + 100));
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

					int bowDamage = (int) ((Math.random() * 7) + 40);
					health -= bowDamage;
					System.out.println("\nthe " + monsterName
							+ " lunges at you, scratching you with his large claws. You fall down, grasp your bow and arrow,\nand launch an arrow at the "
							+ monsterName + " hitting it for " + bowDamage + " damage, and leaving it with " + health
							+ " health.");
					if (death(monsterName, health)) {
						break;
					}
					if (flee(monsterName, health, input)) {
						System.out.println("Your attempt to flee has succeeded");
						break;
					} else {
						int critDamage = bowDamage * 2;
						health -= critDamage;
						System.out.println("\nThe " + monsterName
								+ " glares at you menacingly and swipes at you with a crippling blow. You know that you don't have much time left to defeat it. \nyou grasp your bow, slowly draw the bowstring back, and fire a bow straight into the "
								+ monsterName + "'s eye! it's a critical hit. dealing " + critDamage
								+ " damage, and leaving it with " + health + " health.");
					}
					if (death(monsterName, health)) {
						break;
					}
					if (flee(monsterName, health, input)) {
						System.out.println("Your attempt to flee has succeeded");
						break;
					} else {
						System.out.println("The " + monsterName
								+ " musters all of it's strength, and swings at your head, instantly crushing your skull. You've died, and subsequently failed your people.");
						break;
					}

				} else if (weapon.equalsIgnoreCase("sword")) {
					int swordDamage = (int) (((Math.random() * 10) + 70));
					health -= swordDamage;
					System.out.println("\nYou quickly leap toward the sword, grasp it with you hand, and swing at the "
							+ monsterName + " with maximum force! hitting it for " + swordDamage
							+ " damage, and leaving it with " + health + " health");

					if (death(monsterName, health)) {
						break;
					}

					if (flee(monsterName, health, input)) {
						System.out.println("Your attempt to flee has succeeded");
						break;
					} else {
						int critDamage = swordDamage * 2;
						health -= critDamage;
						System.out.println("\nThe " + monsterName
								+ " swings at you with it's claws, dealing a crippling blow. You stand up, muster your strength, and swing your sword at the "
								+ monsterName + "'s chest. dealing a critical blow of " + critDamage
								+ " damage. Leaving it with " + health + " health.");
					}
					if (death(monsterName, health)) {
						break;
					}
					if (flee(monsterName, health, input)) {
						System.out.println("Your attempt to flee has succeeded");
						break;
					} else {
						System.out.println("The " + monsterName
								+ " musters all of it's strength, and swings at your head, instantly crushing your skull. You've died, and subsequently failed your people.");
						break;
					}

				} else {
					System.out.println("You did not type \"bow\" or \"sword\" correctly. Please try again: ");
				}
			} while (!(isSwordTrue || isBowTrue));
			System.out.println("Thanks for Playing!");
		}

	}
}
