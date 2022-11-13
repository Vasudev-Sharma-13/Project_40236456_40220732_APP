package observer_pattern_subject;

public interface SQLTableSubject {//Interface for Subject in Observer design pattern
	public void checkTableExists(String inputTableName);

	public void notifyOberver();

	
}
