/**
 * Unit testing the SQLTableDataGateway class 
 */

package testing_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import data_source.SQLTableDataGateway;

public class SQLTableDataGatewayTest {

	@Test
	public void test() {
		SQLTableDataGateway instanceOfSQLTableDataGateway = SQLTableDataGateway.getInstanceSQLTableDataGateway();
		instanceOfSQLTableDataGateway.setTableName("city");
		assertEquals("city", instanceOfSQLTableDataGateway.getTableName());
	
	}
	


}
