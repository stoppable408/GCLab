import java.util.Scanner;

public class Lab15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Boolean isFinished = false;
		System.out.println("Welcome to the Countries Maintenance Application!\n");
		System.out.println("\t\t  '1' See the list of countries");
		System.out.println("\t\t  '2' Add a country");
		System.out.println("\t\t  '3' Delete a country");
		System.out.println("\t\t  '4' Exit");
	
		do{
		System.out.print("\nInput option here: ");
		
		int answer = Validator.getInt(input);
		switch(answer){
		case 1: 
			CountriesTextFile.printCountriesFromFile();
			break;
		case 2:
			System.out.print("\nPlease Enter the country that you would like to add: ");
			String countryToAdd = Validator.getString(input);
			CountriesTextFile.addCountriesToFile(countryToAdd);
			break;
		case 3:
			System.out.print("\nPlease Enter the country that you would like to delete: ");
			String countryToDelete = Validator.getString(input);
			CountriesTextFile.deleteCountryFromFile(countryToDelete);
			break;
		case 4:
			isFinished = true;
			System.out.println("\nThank you for using this Application!");
			break;
		default:
			System.out.println("\nInvalid Entry. Please try again.");
		}
		}while(!isFinished);
		}
		
	
		
	}

