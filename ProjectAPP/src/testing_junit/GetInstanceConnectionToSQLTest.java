package testing_junit;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import connection.ConnectionToSQL;

public class GetInstanceConnectionToSQL {

	@Test
	public void test() {  // Unit testing for ConnectionToSQL class  and function name is instanceOfConnectionToSQL
		
		
		 String DATABASE_URL = "jdbc:mysql://localhost/WORLD";
		 String USERINFO = "root";
		 String PASSWORD = "Forky_123";	
		 Connection connectionInstance;
		 Statement statmentConnection=null;
		try {
			connectionInstance = DriverManager.getConnection(DATABASE_URL, USERINFO, PASSWORD);
			 statmentConnection = connectionInstance.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
			
		 ConnectionToSQL instanceOfConnectionToSQL = ConnectionToSQL.getInstanceConnectionToSQL();
			java.sql.Statement varOutput = instanceOfConnectionToSQL.getStatement();
		 try {
			assertEquals(statmentConnection.execute("select * from city"), varOutput.execute("select * from city"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
