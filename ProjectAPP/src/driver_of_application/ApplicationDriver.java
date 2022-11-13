package driver_of_application;

import java.sql.*;
import connection.ConnectionToSQL;
import data_source.*; // Package made by the us
import java.util.Scanner;

public class ApplicationDriver {

	public static void main(String[] args) {

		ConnectionToSQL instanceOfConnectionToSQL = ConnectionToSQL.getInstanceToSQL();
		Scanner objectScanner = new Scanner(System.in);

		while (true) { // infinite loop

			System.out.println("What do you want to do(Please choose the respective option number)?"); // main menu options																								
			System.out.println("\t1. View table data");
			System.out.println("\t2. Quit");
			System.out.println("Please enter your choice >");
			String inputUser = objectScanner.nextLine();
			
			if(inputUser.equals("1")==true) {
				System.out.println("Enter table Name");
				String inputTableName = objectScanner.nextLine().toLowerCase().trim();
				if(inputTableName.equals("city")==true||inputTableName.equals("country")==true||inputTableName.equals("countrylanguage")==true) {
					
				}
			}
			
				
			else if(inputUser.equals("2")==true){
				break;
			}
			else {
				System.out.println("Wrong input Please Try again!!!");
			}

		}
		objectScanner.close();
	}
}
