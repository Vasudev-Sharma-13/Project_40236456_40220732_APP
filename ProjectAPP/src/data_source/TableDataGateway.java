package data_source;

import java.sql.ResultSet;

public interface TableDataGateway {

	
	ResultSet setSQLReturned = null;

	public java.sql.ResultSet selectQuery( String tableName);

}
