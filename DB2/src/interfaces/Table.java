package interfaces;

public interface Table {

	public void insertRow(Integer id, String name);
	public void updateRow(Integer id, String name);
	public void deleteRow(Integer id);
	public void displayAllRows();
	public void displayRow(Integer id);
	public void clearRows();
}
