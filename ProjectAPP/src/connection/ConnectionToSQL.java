/**
 * Class Name:- ConnectionToSQL (Deploys Singleton Design Pattern and creates connection to MYSQL database)
 * 
 * Version information:- 1.5
 *
 * Date:- 12/November/2022
 * 
 * The class is used for creating an connection which is passes to the Data Mapper 
 *
 *
 *
 */

package connection;

import java.sql.*;

public class ConnectionToSQL {

	private static final String DATABASE_URL = "jdbc:mysql://localhost/WORLD";
	private static final String USERINFO = "root";
	private static final String PASSWORD = "Forky_123";
	private static ConnectionToSQL instanceConnectionToSQL = null;

	private ConnectionToSQL() { // Singleton Pattern. Only one connection should exist to the MYSQL database.

	}

	public static ConnectionToSQL getInstanceConnectionToSQL() {

		if (instanceConnectionToSQL == null) {
			instanceConnectionToSQL = new ConnectionToSQL();
		}
		return instanceConnectionToSQL;
	}

	public java.sql.Statement getStatement() {
		try {

			Connection connectionInstance = DriverManager.getConnection(DATABASE_URL, USERINFO, PASSWORD);
			Statement statmentConnection = connectionInstance.createStatement();
			return statmentConnection;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
