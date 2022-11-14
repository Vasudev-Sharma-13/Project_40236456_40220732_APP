/**
 * 
 * Unit Testing the CountryTable class method
 * 
 */



package testing_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import object_relational_structure.CountryTable;

public class CountryTableTest {

	CountryTable object = new CountryTable();
	
	@Test
	public void test1() {
		object.setCapital(100);
		assertEquals(100,object.getCapital());
	}

	@Test
	public void test2() {
		object.setCode2("AB".toCharArray());
		assertEquals("AB".equals(new String(object.getCode2())),true);
	
	}
	
	@Test
	public void test3() {
		object.setContinent("Asia".toCharArray());
		assertEquals("Asia".equals(new String(object.getContinent())),true);
	}
	
	@Test
	public void test4() {
		object.setCountryCode("IND".toCharArray());
		assertEquals("IND".equals(new String(object.getCountryCode())),true);
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void test5() {
		object.setGNP(0.01f);
		junit.framework.Assert.assertEquals((double)0.01f, (double)object.getGNP());
	}
	
	@Test
	public void test6() {
		object.setName("India".toCharArray());
		assertEquals("India".equals(new String(object.getName())),true);
	}
	
	@Test
	public void test7() {
		object.setPopulation(200);
		assertEquals(200,object.getPopulation());
	}
	
	@Test
	public void test8() {
		object.setRegion("Delta".toCharArray());
		assertEquals("Delta".equals(new String(object.getRegion())),true);
	}
	
	@Test
	public void test9() {
		object.setSurfaceArea(100.54f);
		junit.framework.Assert.assertEquals(100.54f, object.getSurfaceArea());
	}
}
