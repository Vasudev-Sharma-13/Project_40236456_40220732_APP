package connection;

import java.sql.*;

public class ConnectionToSQL {

	private static final String DATABASE_URL = "jdbc:mysql://localhost/WORLD";
	private static final String USERINFO = "root";
	private static final String PASSWORD = "Forky_123";
	private static ConnectionToSQL instanceConnectionToSQL = null;

	private ConnectionToSQL() { // Singleton Pattern. One Connection Existing to the database

	}

	public static ConnectionToSQL getInstanceToSQL() {

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
