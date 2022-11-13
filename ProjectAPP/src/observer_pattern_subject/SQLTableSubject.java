package observer_pattern_subject;

public interface SQLTableSubject {
	public void checkTableExists(String inputTableName);

	public void notifyOberver();

	public String getNewState();
}
