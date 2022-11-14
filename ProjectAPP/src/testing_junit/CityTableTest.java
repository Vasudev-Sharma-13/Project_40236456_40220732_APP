package testing_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import object_relational_structure.CityTable;

public class CityTableTest {

	CityTable object  = new CityTable();
	
	@Test
	public void test1() {
		
		object.setCountryCode("ABC".toCharArray());
		assertEquals("ABC".equals(new String(object.getCountryCode())),true);
	}

	@Test
	public void test2() {
		
		object.setDistrict("District".toCharArray());
		assertEquals("District".equals(new String(object.getDistrict())),true);
	}
	
	
	@Test
	public void test3() {
		
		object.setName("Name".toCharArray());
		assertEquals("Name".equals(new String(object.getName())),true);
		
	}
	
	@Test
	public void test4() {
		
		object.setPopulation(100);
		assertEquals(100,object.getPopulation());
		
	}
	
}
