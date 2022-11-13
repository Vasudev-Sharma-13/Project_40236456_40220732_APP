/**
 * Class Name:- CountryTable (Implements Object Relation Mapping to Country Table in MYSQL database)
 * 
 * Version information:- 1.3
 *
 * Date:- 12/November/2022
 * 
 * The class attributes map's to our Country table in the MYSQL Database. The class also consists of getter's and setter's for these attributes.
 *
 *
 *
 */

package object_relational_structure;

public class CountryTable {

	private char countryCode[] = new char[3];
	private char name[] = new char[52];
	private char continent[] = new char[13];
	private char region[] = new char[26];
	private char code2[] = new char[2];
	private float surfaceArea = 0f;
	private int population = 0;
	private int capital = 0;
	private float GNP = 0f;

	public char[] getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(char countryCode[]) {
		this.countryCode = countryCode;
	}

	public char[] getCode2() {
		return code2;
	}

	public void setCode2(char code2[]) {
		this.code2 = code2;
	}

	public float getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public float getGNP() {
		return GNP;
	}

	public void setGNP(float gNP) {
		GNP = gNP;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public char[] getName() {
		return name;
	}

	public void setName(char name[]) {
		this.name = name;
	}

	public char[] getRegion() {
		return region;
	}

	public void setRegion(char region[]) {
		this.region = region;
	}

	public char[] getContinent() {
		return continent;
	}

	public void setContinent(char continent[]) {
		this.continent = continent;
	}

}
