/**
 * Class Name:- DataTableSubject (It implements Singleton Design Pattern and Observer Design Pattern (it is an subject))
 * 
 * Version information:- 1.8
 *
 * Date:- 13/November/2022
 * 
 * It acts as an controller 
 * 
 *
 *
 */


package observer_pattern_subject;

import java.util.Scanner;

import data_source.DataMapper;

public class DataTableSubject implements SQLTableSubject {

	private static DataMapper objectDataMapper = DataMapper.getInstanceDataMapper();
	private String inputTableName;
	private static DataTableSubject objectOfDataTableSubject=null;
	
	private DataTableSubject() {  //singleton pattern
		
	}
	
	public static DataTableSubject getDataTableSubjectInstance() {
		if (objectOfDataTableSubject == null) {
			objectOfDataTableSubject = new DataTableSubject();
		}
		return objectOfDataTableSubject;
	}

	@Override
	public void checkTableExists(String inputTableName) {
		this.inputTableName = inputTableName;

		if (this.inputTableName.equals("city") == true || this.inputTableName.equals("countrylanguage") == true
				|| this.inputTableName.equals("country") == true) {
			notifyOberver();
			
		} else {
			System.out.println("Table Does Not Exist");
		}
	 
	}

	@Override
	public void notifyOberver() {  // Observer Pattern || Observer ping sent of state change
		objectDataMapper.update();

	}

	public String getNewState() {
		return this.inputTableName;
	}

}
