package services;

import java.util.Timer;

/**
 * Main class instantiates CronService class and creates repetitive task for every 5 secs.
 * For demo purpose there is a loop and output to console, to see the interval of executed task.
 */

public class Main {

	public static void main(String[] args) {
		
		Timer time = new Timer(); 
		CronService sortAndSave = new CronService(); 
		time.schedule(sortAndSave, 0, 5000); 

		//for demo only
		for (int i = 0; i <= 1; i++) {
			System.out.println("Execution in Main Thread...." + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i == 1) {
				System.out.println("Application Terminates");
				System.exit(0);
			}
		}
	}
}
