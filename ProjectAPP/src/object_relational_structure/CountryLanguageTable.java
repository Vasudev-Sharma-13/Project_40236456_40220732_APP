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
