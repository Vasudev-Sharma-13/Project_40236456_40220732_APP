/**
 * Class Name:- DataMapper (It implements Singleton Pattern and Observer Pattern (it is an observer))
 * 
 * Version information:- 1.8
 *
 * Date:- 13/November/2022
 * 
 * It manages flow of data between from sqldatabase, TDG and Domain Classes(Object relational classes).
 *It implements an interface for DataMappers
 *
 *
 */

package data_source;

import object_relational_structure.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import connection.ConnectionToSQL;

public class DataMapper implements DataMapperOberserver { // This is the observer in the Observer Design Pattern

	private static DataMapper instanceDataMapper = null;

	private static SQLTableDataGateway instanceOfSQLTableDataGateway = SQLTableDataGateway
			.getInstanceSQLTableDataGateway();
	private static ConnectionToSQL instanceOfConnectionToSQL = ConnectionToSQL.getInstanceConnectionToSQL();
	private ResultSet resultSetSQLObtained = null;
	private static ArrayList<object_relational_structure.CityTable> objectRelationalPatternCityTable = new ArrayList<>();
	private static ArrayList<object_relational_structure.CountryTable> objectRelationalPatternCountryTable = new ArrayList<>();
	private static ArrayList<object_relational_structure.CountryLanguageTable> objectRelationalPatternCountryLanguageTable = new ArrayList<>();
	private DataMapper() {  //singleton pattern

	}

	public static DataMapper getInstanceDataMapper() {

		if (instanceDataMapper == null) {
			instanceDataMapper = new DataMapper();
		}
		return instanceDataMapper;

	}

	@Override
	public void update() { // subject notifies the observer here
		System.out.println("Ping recieved from subject(Data Table Subject)");
		instanceOfSQLTableDataGateway.setStatementOfSQLDataBase(instanceOfConnectionToSQL.getStatement());
		String newState = observer_pattern_subject.DataTableSubject.getDataTableSubjectInstance().getNewState();// observer
																												// asks
																												// for
																												// new
																												// state
		this.resultSetSQLObtained = instanceOfSQLTableDataGateway.selectQuery(newState);

		if (newState.equals("city") == true) {   //after refactor 
			mapCity();
		} else if (newState.equals("country") == true) {
			mapCountry();
		} else {
			mapCountryLanguage();
		}

	}

	/* Mapping of data from database to classes below */
	private void mapCity() {
		int count = 0;
		System.out.println("The contents of the Table are");
		try {

			

			while (this.resultSetSQLObtained.next()) {
				objectRelationalPatternCityTable.add(new CityTable());
				objectRelationalPatternCityTable.get(count)
						.setCountryCode(this.resultSetSQLObtained.getString("CountryCode").toCharArray());
				objectRelationalPatternCityTable.get(count)
						.setDistrict(this.resultSetSQLObtained.getString("District").toCharArray());
				objectRelationalPatternCityTable.get(count)
						.setName(this.resultSetSQLObtained.getString("Name").toCharArray());
				objectRelationalPatternCityTable.get(count)
						.setPopulation(this.resultSetSQLObtained.getInt("Population"));
				objectRelationalPatternCityTable.get(count).setID(this.resultSetSQLObtained.getInt("ID"));

				System.out.println("Country Code: " + this.resultSetSQLObtained.getString("CountryCode") + " District: "
						+ this.resultSetSQLObtained.getString("District") + " Name: "
						+ this.resultSetSQLObtained.getString("Name") + " Population: "
						+ this.resultSetSQLObtained.getInt("Population") + " ID: "
						+ this.resultSetSQLObtained.getInt("ID"));
				++count;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("\nThe number of rows mapped are: " + count + "\n");
	}

	private void mapCountry() {
		int count = 0;
		System.out.println("The contents of the Table are");
		try {

			
			while (this.resultSetSQLObtained.next()) {
				objectRelationalPatternCountryTable.add(new CountryTable());

				objectRelationalPatternCountryTable.get(count).setCapital(this.resultSetSQLObtained.getInt("Capital"));
				objectRelationalPatternCountryTable.get(count)
						.setCode2(this.resultSetSQLObtained.getString("Code2").toCharArray());
				objectRelationalPatternCountryTable.get(count)
						.setContinent(this.resultSetSQLObtained.getString("Continent").toCharArray());
				objectRelationalPatternCountryTable.get(count)
						.setCountryCode(this.resultSetSQLObtained.getString("CountryCode").toCharArray());
				objectRelationalPatternCountryTable.get(count).setGNP(this.resultSetSQLObtained.getFloat("GNP"));
				objectRelationalPatternCountryTable.get(count)
						.setName(this.resultSetSQLObtained.getString("Name").toCharArray());
				objectRelationalPatternCountryTable.get(count)
						.setPopulation(this.resultSetSQLObtained.getInt("Population"));
				objectRelationalPatternCountryTable.get(count)
						.setRegion(this.resultSetSQLObtained.getString("Region").toCharArray());
				objectRelationalPatternCountryTable.get(count)
						.setSurfaceArea(this.resultSetSQLObtained.getFloat("SurfaceArea"));

				System.out.println("Capital: " + this.resultSetSQLObtained.getInt("Capital") + " Code2: "
						+ this.resultSetSQLObtained.getString("Code2") + " Continent: "
						+ this.resultSetSQLObtained.getString("Continent") + " Country Code: "
						+ this.resultSetSQLObtained.getString("CountryCode") + " GNP: "
						+ this.resultSetSQLObtained.getFloat("GNP") + " Name: "
						+ this.resultSetSQLObtained.getString("Name") + " Population: "
						+ this.resultSetSQLObtained.getInt("Population") + " Region: "
						+ this.resultSetSQLObtained.getString("Region") + " Surface Area: "
						+ this.resultSetSQLObtained.getFloat("SurfaceArea"));

				++count;

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("\nThe number of rows mapped are: " + count + "\n");
	}

	private void mapCountryLanguage() {
		int count = 0;
		System.out.println("The contents of the Table are");
		try {

			

			while (this.resultSetSQLObtained.next()) {
				objectRelationalPatternCountryLanguageTable.add(new CountryLanguageTable());
				objectRelationalPatternCountryLanguageTable.get(count)
						.setCountryCode(this.resultSetSQLObtained.getString("CountryCode").toCharArray());
				objectRelationalPatternCountryLanguageTable.get(count)
						.setLanguage(this.resultSetSQLObtained.getString("Language").toCharArray());
				objectRelationalPatternCountryLanguageTable.get(count)
						.setPercentage(this.resultSetSQLObtained.getFloat("Percentage"));

				System.out.println("Country Code: " + this.resultSetSQLObtained.getString("CountryCode") + " Language: "
						+ this.resultSetSQLObtained.getString("Language") + " Percentage: "
						+ this.resultSetSQLObtained.getFloat("Percentage"));
				++count;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("\nThe number of rows mapped are: " + count + "\n");
	}

}
