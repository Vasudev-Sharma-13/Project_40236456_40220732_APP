package data_source;

import java.sql.ResultSet;

public interface TableDataGateway {

	String tableName = "";
	ResultSet setSQLReturned = null;

	public java.sql.ResultSet selectQuery(String columns, String whereClause);

}
