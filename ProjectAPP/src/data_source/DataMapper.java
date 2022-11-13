package data_source;
import driver_of_application.*;

import connection.ConnectionToSQL;

public class DataMapper implements DataMapperOberserver{

	
	private static DataMapper instanceDataMapper=null;
	private static ApplicationDriver instanceDriverApplication = new ApplicationDriver();
	
	private DataMapper() {
		
	}
	
	public static DataMapper getInstanceDataMapper() {
		
		if (instanceDataMapper == null) {
			instanceDataMapper = new DataMapper();
		}
		return instanceDataMapper;
		
		
	}
	

	public void update () {
		System.out.println("Ping recieved from subject(Application Driver)");
	}
	
	
	
}
