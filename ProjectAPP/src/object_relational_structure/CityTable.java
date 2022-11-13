/**
 * Class Name:- CityTable (Implements Object Relation Mapping to City Table in MYSQL database)
 * 
 * Version information:- 1.3
 *
 * Date:- 12/November/2022
 * 
 * The class attributes map's to our City table in the MYSQL Database. The class also consists of getter's and setter's for these attributes.
 *
 *
 *
 */

package object_relational_structure;

public class CityTable {
	private int ID;
	private char name[] = new char[35];
	private char countryCode[] = new char[3];
	private char district[] = new char[20];
	private int population = 0;

	public char[] getName() {
		return name;
	}

	public void setName(char name[]) {
		this.name = name;
	}

	public char[] getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(char countryCode[]) {
		this.countryCode = countryCode;
	}

	public char[] getDistrict() {
		return district;
	}

	public void setDistrict(char district[]) {
		this.district = district;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

}
