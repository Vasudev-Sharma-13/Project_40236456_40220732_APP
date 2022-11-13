package driver_of_application;


import data_source.*; // Package made by the us
import java.util.Scanner;

public class ApplicationDriver {

	private static Scanner objectScanner = new Scanner(System.in);
	private static DataMapper objectDataMapper = DataMapper.getInstanceDataMapper();
	private static String inputTableName;
	
	public static boolean checkTableExists() {

		System.out.println("Enter table Name");
		inputTableName = objectScanner.nextLine().toLowerCase().trim();
		if (inputTableName.equals("city") == true || inputTableName.equals("countrylanguage") == true
				|| inputTableName.equals("country") == true) {
			return true;
		} else {
			return false;
		}

	}

	public static void notifyObserver() { // Observer Pattern || Observer ping sent of state change

		objectDataMapper.update();
	}

	public void getNewState() {

	}

	public static void main(String[] args) {


		boolean tableExists;
		try {
			while (true) { // infinite loop
				tableExists = false;
				System.out.println("What do you want to do(Please choose the respective option number)?"); // main menu
				System.out.println("\t1. View table data");
				System.out.println("\t2. Quit");
				System.out.println("Please enter your choice >");
				String inputUser = objectScanner.nextLine();

				if (inputUser.equals("1") == true) {

					tableExists = checkTableExists();

					if (tableExists == true) {
						notifyObserver();
					} else {
						System.out.println("Wrong Table Name");
					}

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
