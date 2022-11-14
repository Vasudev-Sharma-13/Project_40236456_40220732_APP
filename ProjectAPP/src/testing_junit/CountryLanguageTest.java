/**
 * 
 * Unit Testing the CountryLanguageTable class method
 * 
 */


package testing_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import object_relational_structure.CountryLanguageTable;

public class CountryLanguageTest {
	
	CountryLanguageTable object = new CountryLanguageTable();
	
	@Test
	public void test1() {
		object.setCountryCode("CAN".toCharArray());
		assertEquals("CAN".equals(new String(object.getCountryCode())),true);
	
	}

	@Test
	public void test2() {
		object.setLanguage("French".toCharArray());
		assertEquals("French".equals(new String(object.getLanguage())),true);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test3() {
		object.setPercentage(10.01f);
		junit.framework.Assert.assertEquals(10.01f, object.getPercentage());
	}
}
