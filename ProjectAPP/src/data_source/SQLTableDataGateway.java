/**
 * Class Name:- SQLTableDataGateway (Implements Data Source Pattern(TDG) and has Singleton Design Pattern)
 * 
 * Version information:- 1.5
 *
 * Date:- 12/November/2022
 * 
 * 
 */

package data_source;

import java.sql.ResultSet;

public class SQLTableDataGateway implements TableDataGateway {

	private String tableName;
	private ResultSet setSQLReturned;
	private static SQLTableDataGateway instanceSQLTableDataGateway;

	private SQLTableDataGateway() { // singleton

	}

	@Override
	public void select() {

		 String selectQuery = "select * from " + tableName;

	}

	public void setSetSQLReturned(ResultSet setSQLReturned) {
		this.setSQLReturned = setSQLReturned;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}
