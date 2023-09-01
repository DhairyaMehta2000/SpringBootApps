package interfaces;

public interface Table {

	
	void displayRow(String name);
	
	void updateRow();
	
	void deleteRow();

	void insertRow( String name, Integer marks);
	
	
}
