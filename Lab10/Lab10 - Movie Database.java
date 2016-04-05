import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab10 {
	public static final int MAX = 100;

	public static void main(String[] args) {
		boolean answered = true;
		Scanner input = new Scanner(System.in);
		int scifiCounter = 0, animatedCounter = 0, horrorCounter = 0, dramaCounter = 0;
		String answer;
		boolean isScifi, isAnimated, isDrama, isHorror;
		System.out.println("Welcome to the Movie List Application!");
		ArrayList<Movie> array = new ArrayList<Movie>(MAX);
		ArrayList<Movie> scifi = new ArrayList<Movie>();
		ArrayList<Movie> animated = new ArrayList<Movie>();
		ArrayList<Movie> drama = new ArrayList<Movie>();
		ArrayList<Movie> horror = new ArrayList<Movie>();

		for (int i = 1; i < MAX; i++) {
			array.add(i - 1, Movie.getMovie(i));

			isScifi = array.get(i - 1).getCategory().equalsIgnoreCase("scifi");
			isAnimated = array.get(i - 1).getCategory().equalsIgnoreCase("animated");
			isDrama = array.get(i - 1).getCategory().equalsIgnoreCase("drama");
			isHorror = array.get(i - 1).getCategory().equalsIgnoreCase("horror");

			if (isScifi) {
				scifi.add(scifiCounter, Movie.getMovie(i));
				scifiCounter++;

			} else if (isAnimated) {
				animated.add(animatedCounter, Movie.getMovie(i));
				animatedCounter++;
			} else if (isDrama) {
				drama.add(dramaCounter, Movie.getMovie(i));
				dramaCounter++;
			} else if (isHorror) {
				horror.add(horrorCounter, Movie.getMovie(i));
				horrorCounter++;
			}

		}

		System.out.println("\nThere are 100 movies in this list.");
		do {
			System.out.println("What category are you interested in?");
			System.out.print("\t\t  '1' Animated\n\t\t  '2' Drama\n\t\t  '3' Horror\n\t\t  '4' Scifi");

			System.out.print("\nInput Answer Here: ");
			do {
				answered = true;
				answer = input.next();
				if (answer.equalsIgnoreCase("1")) {
					for (int i = 0; i < animated.size(); i++) {
						Collections.sort(animated, new Movie());
						System.out.println(animated.get(i).getTitle());
					}
				} else if (answer.equalsIgnoreCase("2")) {
					Collections.sort(drama, new Movie());
					for (int i = 0; i < drama.size(); i++) {
						System.out.println(drama.get(i).getTitle());
					}
				} else if (answer.equalsIgnoreCase("3")) {
					Collections.sort(horror, new Movie());
					for (int i = 0; i < horror.size(); i++) {
						System.out.println(horror.get(i).getTitle());
					}
				} else if (answer.equalsIgnoreCase("4")) {
					Collections.sort(scifi, new Movie());
					for (int i = 0; i < scifi.size(); i++) {
						System.out.println(scifi.get(i).getTitle());
					}
				} else {
					answered = false;
					System.out.print("Invalid Input. Input another number: ");
				}
			} while (answered == false);
			System.out.print("\n\nContinue?(y/n): ");
			answer = input.next();
		} while (answer.equalsIgnoreCase("Y"));

		input.close();
		System.out.println("\nThank you for using this program!");
	}
}
