/**
 * Class Name:- CountryLanguageTable
 * 
 * Version information:- 1.3
 *
 * Date:- 12/November/2022
 * 
 * The class attributes map's to our CountryLanguage table in the MYSQL Database. The class also consists of getter's and setter's 
 * for these attributes.
 *
 *
 */

package object_relational_structure;

public class CountryLanguageTable {

	private char countryCode[] = new char[3];
	private char language[] = new char[30];
	private float percentage = 0f;

	public char[] getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(char countryCode[]) {
		this.countryCode = countryCode;
	}

	public char[] getLanguage() {
		return language;
	}

	public void setLanguage(char language[]) {
		this.language = language;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

}
