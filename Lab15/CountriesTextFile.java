import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CountriesTextFile {

	public static void addCountriesToFile(String country) {
		Writer output;
		try {
			output = new BufferedWriter(new FileWriter("C:\\Users\\Solomon\\Documents\\GitHub\\Miscellaneous\\Directory\\countries.txt", true));
			output.append("\n" + country);
			output.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void deleteCountryFromFile(String country) {
		String lineToBeRead = null;
		FileReader reader = null;
		BufferedReader bufferedReader = null;
		Writer output = null;
		File originalFile = new File("C:\\Users\\Solomon\\Documents\\GitHub\\Miscellaneous\\Directory\\countries.txt");
		File newFile = new File("C:\\Users\\Solomon\\Documents\\GitHub\\Miscellaneous\\Directory\\countries2.txt");

		try {
			
			newFile.createNewFile();

			output = new BufferedWriter(new FileWriter("C:\\Users\\Solomon\\Documents\\GitHub\\Miscellaneous\\Directory\\countries2.txt", true));
		
			reader = new FileReader("C:\\Users\\Solomon\\Documents\\GitHub\\Miscellaneous\\Directory\\countries.txt");
			bufferedReader = new BufferedReader(reader);

			while ((lineToBeRead = bufferedReader.readLine()) != null) {
				if (!lineToBeRead.equalsIgnoreCase(country)) {
					output.append(lineToBeRead + "\n");
				}
			}
			reader.close();
			output.close();
			originalFile.delete();
			newFile.renameTo(originalFile);
		

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
	
	
	public static void printCountriesFromFile(){
		String country = null;
		FileReader reader = null;
		BufferedReader bufferedreader = null;
			
			try{
			reader = new FileReader("C:\\Users\\Solomon\\Documents\\GitHub\\Miscellaneous\\Directory\\countries.txt");
			bufferedreader = new BufferedReader(reader);
			System.out.println("\n");
			while ((country = bufferedreader.readLine()) != null) {
						System.out.println(country);
			}
			
			
			bufferedreader.close();
			}catch (IOException e){
				e.printStackTrace();
			}


		
	}
}
