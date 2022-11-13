package data_source;

import java.sql.ResultSet;

public interface TableDataGateway {  //Interface for TDG

	
	ResultSet setSQLReturned = null;

	public java.sql.ResultSet selectQuery( String tableName);

}
