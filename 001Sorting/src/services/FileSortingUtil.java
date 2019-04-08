package services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * FileSortingUtil class contains 3 methods.
 * readFromFile(String pathToFile) reads text file and returns List<String>.
 * @param  pathToFile is a String representing absolute path to file to be read.
 * sort(List<String> someInput) takes List<String> and sorts alphabetically, returns List<String>.
 * saveToFile(List<String> someInput) instantiates PrintWriter and writes to file "out.txt".
 */

public class FileSortingUtil  {
	
	public static List<String> readFromFile(String pathToFile) {
		List<String> words = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File(pathToFile));) {
			while (scanner.hasNext()) {
				String sent = scanner.next();
				words.add(sent);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		return words;
	}

	public static List<String> sort(List<String> someInput) {
		Collections.sort(someInput, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Sorted input: " + someInput); //for demo - show output in console
		return someInput;
	}

	public static void saveToFile(List<String> someInput, String fileName) {
		Date now = new Date(); 
		try {
			PrintWriter outputStream = new PrintWriter(fileName);
			outputStream.println(someInput);
			outputStream.close();
			System.out.println("Writing to file completed at " + now); //for demo - show output in console
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
