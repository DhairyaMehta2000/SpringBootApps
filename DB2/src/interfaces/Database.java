package interfaces;

import services.TableService;

public interface Database {

	public TableService getTable(String name);
	public void createTable(String name);
	public void displayTables();
	public void deleteTable(String name);
}
