package data_source;
import driver_of_application.*;
import observer_pattern_subject.DataTableSubject;
import connection.ConnectionToSQL;

public class DataMapper implements DataMapperOberserver{

	
	private static DataMapper instanceDataMapper=null;
	private static DataTableSubject instanceDataTableSubject = DataTableSubject.getDataTableSubjectInstance();
	private static SQLTableDataGateway instanceOfSQLTableDataGateway = SQLTableDataGateway.getInstanceSQLTableDataGateway();
	private DataMapper() {
		
	}
	
	public static DataMapper getInstanceDataMapper() {
		
		if (instanceDataMapper == null) {
			instanceDataMapper = new DataMapper();
		}
		return instanceDataMapper;
		
		
	}
	
	@Override
	public void update () {
		System.out.println("Ping recieved from subject(Application Driver)");
		instanceDataTableSubject.getNewState();
		
	}
	
	
	
}
