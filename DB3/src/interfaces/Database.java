package interfaces;

import java.util.Map;

import services.TableService;

public interface Database {

	void createTable(String string);

	void setName(String name);

	Map<String, TableService> getTables();

	void setTables(Map<String, TableService> tables);

	Table getTable(String name);

	void deleteTable(String name);

}
