package data_source;

import java.sql.ResultSet;

public interface TableDataGateway {

	String tableName = "";
	ResultSet setSQLReturned = null;

	public void select();

}
