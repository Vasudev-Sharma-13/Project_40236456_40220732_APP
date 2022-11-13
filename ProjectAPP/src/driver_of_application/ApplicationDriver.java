package driver_of_application;

import java.util.Scanner;
import observer_pattern_subject.*;

public class ApplicationDriver {

	public static void main(String[] args) {

		Scanner objectScanner = new Scanner(System.in);
		String inputUser;
		String inputTableName;
		DataTableSubject objectDataTableSubject = DataTableSubject.getDataTableSubjectInstance();
		try {
			while (true) { // infinite loop

				System.out.println("What do you want to do(Please choose the respective option number)?"); // main menu
				System.out.println("\t1. View table data");
				System.out.println("\t2. Quit");
				System.out.println("Please enter your choice >");
				inputUser = objectScanner.nextLine();

				if (inputUser.equals("1") == true) {
					System.out.println("Enter Table Name (For example city , country , countrylanguage)");
					inputTableName = objectScanner.nextLine();
					objectDataTableSubject.checkTableExists(inputTableName);

				}

				else if (inputUser.equals("2") == true) {
					break;
				} else {
					System.out.println("Wrong input Please Try again!!!");
				}

			}
			objectScanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
