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
import java.sql.SQLException;
import java.sql.Statement;

import connection.ConnectionToSQL;

public class SQLTableDataGateway implements TableDataGateway {

	private String tableName;
	private ResultSet resultSetSQLReturned;
	private Statement statementOfSQLDataBase;

	private static SQLTableDataGateway instanceSQLTableDataGateway = null;

	private SQLTableDataGateway() { // singleton pattern

	}

	public static SQLTableDataGateway getInstanceSQLTableDataGateway() { // singleton pattern

		if (instanceSQLTableDataGateway == null) {
			instanceSQLTableDataGateway = new SQLTableDataGateway();
		}
		return instanceSQLTableDataGateway;
	}

	@Override
	public java.sql.ResultSet selectQuery(String tableName) { // parameterized query is run
		setTableName(tableName);
		
		String selectQuery = "select * from " + this.tableName+"";
		
		try {
			this.resultSetSQLReturned = statementOfSQLDataBase.executeQuery(selectQuery);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return this.resultSetSQLReturned;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public void setStatementOfSQLDataBase(Statement statementOfSQLDataBase) {
		this.statementOfSQLDataBase = statementOfSQLDataBase;
	}

}
