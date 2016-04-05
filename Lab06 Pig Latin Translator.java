import java.util.Scanner;

public class Lab06 {

	public static void separateWord(StringBuilder word) {
		String separateWord;
		int wordStart = 0;
		int space;
		for (int i = 0; i < word.length(); i++) {

			space = word.indexOf(" ", wordStart);
			if (space < 0) {
				separateWord = (word.substring(wordStart, word.length()));
				if (checkWord(separateWord)) {
					printWord(separateWord);
				}
				break;
			}

			separateWord = (word.substring(wordStart, space));
			if (checkWord(separateWord)) {
				printWord(separateWord);
			}
			space = word.indexOf(" ", wordStart);
			wordStart = space + 1;
		}

	}

	public static boolean checkWord(String word) {
		for (char c : word.toCharArray()) {
			if ((Character.isDigit(c)) || c == 64) {
				System.out.println(word);
				return false;
			}
		}
		return true;
	}

	public static void printWord(String word) {
		StringBuilder modWord = new StringBuilder(word);
		if (checkVowel(modWord.charAt(0))) {

			System.out.print(modWord.append("way "));
		} else {

			for (int i = 1; i < modWord.length(); i++) {

				if (checkVowel(modWord.charAt(i))) {
					StringBuilder newWord = modWord.append(modWord.substring(0, i));
					newWord = modWord.delete(0, i);
					System.out.print(newWord + "ay ");
					break;

				}

			}
		}
	}

	public static boolean checkVowel(char letter) {
		if ( "AEIOUaeiou".indexOf(letter) != -1)
			return true;

		return false;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.print("\nEnter a line to be translated: ");
		StringBuilder word = new StringBuilder(input.nextLine());
		separateWord(word);
		input.close();
	}
}