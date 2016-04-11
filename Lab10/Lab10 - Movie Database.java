import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab10 {
	public static final int MAX = 100;

	public static void main(String[] args) {
		boolean answered = true;
		Scanner input = new Scanner(System.in);
		int scifiCounter = 0, animatedCounter = 0, horrorCounter = 0, dramaCounter = 0, musicalCounter = 0, comedyCounter = 0;
		String answer;
		boolean isScifi, isAnimated, isDrama, isHorror, isMusical, isComedy;
		System.out.println("Welcome to the Movie List Application!");
		ArrayList<Movie> array = new ArrayList<Movie>(MAX);
		ArrayList<Movie> scifi = new ArrayList<Movie>();
		ArrayList<Movie> animated = new ArrayList<Movie>();
		ArrayList<Movie> drama = new ArrayList<Movie>();
		ArrayList<Movie> horror = new ArrayList<Movie>();
		ArrayList<Movie> musical = new ArrayList<Movie>();
		ArrayList<Movie> comedy = new ArrayList<Movie>();
		
		for (int i = 1; i < MAX; i++) {
			array.add(i - 1, Movie.getMovie(i));

			isScifi = array.get(i - 1).getCategory().equalsIgnoreCase("scifi");
			isAnimated = array.get(i - 1).getCategory().equalsIgnoreCase("animated");
			isDrama = array.get(i - 1).getCategory().equalsIgnoreCase("drama");
			isHorror = array.get(i - 1).getCategory().equalsIgnoreCase("horror");
			isMusical = array.get(i - 1).getCategory().equalsIgnoreCase("musical");
			isComedy = array.get(i - 1).getCategory().equalsIgnoreCase("comedy");

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
			else if(isMusical){
				musical.add(musicalCounter, Movie.getMovie(i));
				musicalCounter++;
			}
			else if(isComedy){
				comedy.add(comedyCounter, Movie.getMovie(i));
				comedyCounter++;
			}

		}

		System.out.println("\nThere are 100 movies in this list.");
		do {
			System.out.println("What category are you interested in?");
			System.out.print("\t\t  '1' Animated\n\t\t  '2' Drama\n\t\t  '3' Horror\n\t\t  '4' Scifi\n\t\t  '5' Musical\n\t\t  '6'Comedy");

			System.out.print("\nInput Answer Here: ");
			do {
				answered = true;
				answer = input.next();
				switch(answer){
				case "1":
					sortList(animated);
					break;
				case "2":
					sortList(drama);
					break;
				case "3":
					sortList(horror);
					break;
				case "4":
					sortList(scifi);
					break;
				case "5":
					sortList(musical);
					break;
				case "6":
					sortList(comedy);
					break;
				default:
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

	public static void sortList(ArrayList<Movie> movieList) {
		for (int i = 0; i < movieList.size(); i++) {
			Collections.sort(movieList, new Movie());
			System.out.println(movieList.get(i).getTitle());
		}
	}
}
