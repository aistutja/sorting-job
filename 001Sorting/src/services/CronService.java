package services;

import java.util.List;
import java.util.TimerTask;

/**
 * CronService class describes action to be performed at timed schedule.
 * The task is to read from file, sort alphabetically and write to output file.
 */

public class CronService extends TimerTask{
	
	public static final String PATH_TO_INPUT_FILE = "input.txt"; //provide your path
	
	@Override
	public void run() {
		List<String> myList = FileSortingUtil.readFromFile(PATH_TO_INPUT_FILE); //read input file
		FileSortingUtil.sort(myList);
		FileSortingUtil.saveToFile(myList, "out.txt"); //write sorted List to output file
	}
}
