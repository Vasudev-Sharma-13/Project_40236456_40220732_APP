/**
 * Date 14/November/2022
 * 
 * integration testing  because output is true when multiple methods from DataTableSubject and DataMappper have to be True
 * and give the correct output back (Testing the observer design pattern)
 */

package testing_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import observer_pattern_subject.DataTableSubject;

public class DataTableSubjectTest {

	DataTableSubject object = DataTableSubject.getDataTableSubjectInstance();
	
	@Test
	public void test() {
		object.checkTableExists("city");  
		assertEquals(object.getNewState().equals("city"), true);	
	}

}
