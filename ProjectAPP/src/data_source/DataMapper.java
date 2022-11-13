package data_source;

import observer_pattern_subject.DataTableSubject;
import object_relational_structure.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import connection.ConnectionToSQL;

public class DataMapper implements DataMapperOberserver { // This is the observer in the Observer Design Pattern

	private static DataMapper instanceDataMapper = null;
	// private static DataTableSubject instanceDataTableSubject =
	// DataTableSubject.getDataTableSubjectInstance();
	private static SQLTableDataGateway instanceOfSQLTableDataGateway = SQLTableDataGateway
			.getInstanceSQLTableDataGateway();
	private static ConnectionToSQL instanceOfConnectionToSQL = ConnectionToSQL.getInstanceConnectionToSQL();
	private ResultSet resultSetSQLObtained = null;
	private ResultSet tempResultSetSQLObtained = null;

	private DataMapper() {

	}

	public static DataMapper getInstanceDataMapper() {

		if (instanceDataMapper == null) {
			instanceDataMapper = new DataMapper();
		}
		return instanceDataMapper;

	}

	@Override
	public void update(String newState) {
		System.out.println("Ping recieved from subject(Application Driver)");
		instanceOfSQLTableDataGateway.setStatementOfSQLDataBase(instanceOfConnectionToSQL.getStatement());
		this.resultSetSQLObtained = instanceOfSQLTableDataGateway.selectQuery(newState);
		this.tempResultSetSQLObtained = this.resultSetSQLObtained;
		if (newState.equals("city") == true) {
			mapCity();
		} else if (newState.equals("country") == true) {
			mapCountry();
		} else {
			mapCountryLanguage();
		}

	}

	private void mapCity() {
		int count = 0;
		try {
			//tempResultSetSQLObtained.last();
			//object_relational_structure.CityTable objectRelationalPatternCityTable[] = new object_relational_structure.CityTable[tempResultSetSQLObtained
				//	.getRow()];

			while (this.resultSetSQLObtained.next()) {
			//	objectRelationalPatternCityTable[count] = new CityTable();
				//objectRelationalPatternCityTable[count]
				//		.setCountryCode(this.resultSetSQLObtained.getString("CountryCode").toCharArray());
				//objectRelationalPatternCityTable[count]
				//		.setDistrict(this.resultSetSQLObtained.getString("District").toCharArray());
				//objectRelationalPatternCityTable[count]
				//		.setName(this.resultSetSQLObtained.getString("Name").toCharArray());
				//objectRelationalPatternCityTable[count].setPopulation(this.resultSetSQLObtained.getInt("Population"));
				//objectRelationalPatternCityTable[count].setID(this.resultSetSQLObtained.getInt("ID"));

				System.out.println("Country Code: " + this.resultSetSQLObtained.getString("CountryCode") + " District "
						+ this.resultSetSQLObtained.getString("District") + " Name: "
						+ this.resultSetSQLObtained.getString("Name")+ " Population: "
						+this.resultSetSQLObtained.getInt("Population")+ " ID: "
						+this.resultSetSQLObtained.getInt("ID"));
				++count;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	private void mapCountry() {
		int count = 0;
		try {
			tempResultSetSQLObtained.last();
			object_relational_structure.CountryTable objectRelationalPatternCountryTable[] = new object_relational_structure.CountryTable[tempResultSetSQLObtained
					.getRow()];

			while (this.resultSetSQLObtained.next()) {

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private void mapCountryLanguage() {
		int count = 0;
		try {
			tempResultSetSQLObtained.last();
			object_relational_structure.CountryLanguageTable objectRelationalPatternCountryLanguageTable[] = new object_relational_structure.CountryLanguageTable[tempResultSetSQLObtained
					.getRow()];

			while (this.resultSetSQLObtained.next()) {

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
