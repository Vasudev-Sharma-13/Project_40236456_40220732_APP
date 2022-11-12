package object_relational_structure;

public class CityTable {

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

}
