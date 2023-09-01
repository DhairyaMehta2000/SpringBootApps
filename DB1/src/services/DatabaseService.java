package services;

import java.util.HashMap;
import java.util.Map;

public class DatabaseService {
	private String name;
	private Map<String, TableService> tables;

	public DatabaseService(String name) {
		this.name = name;
		this.tables = new HashMap<>();
	}

	public void createTable(String tableName) {
		if (!tables.containsKey(name)) {
			TableService table = new TableService(tableName);
			tables.put(tableName, table);
		} else {
			System.out.println("Table already exists");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, TableService> getTables() {
		return tables;
	}
	
	public TableService getTable(String name) {
		return tables.get(name);
	}

	public void setTables(Map<String, TableService> tables) {
		this.tables = tables;
	}

	void updateTable(String name) {
		if (!tables.containsKey(name)) {
			TableService table = new TableService(name);
			tables.put(name, table);
		}
	}
	
	public void deleteTable(String name) {
		if(!tables.containsKey(name)) {
			System.out.println("Table not found");
		}else {
//			tables.get(name) table= tables.setRows(null);
//			System.out.println(getTable(name));
			TableService table = tables.get(name);
			table.clearRows(name);
//			tables.forEach((k,v)->(v.setRows(0)));
			tables.remove(name);
			
		}
	}
	
	public void displayAllTables() {
	    System.out.println("All Tables :");
	    for (Map.Entry<String, TableService> entry : tables.entrySet()) {
	        TableService table = entry.getValue();
	        System.out.println("Id: " + entry.getKey() + ", Name: " + table.getName() + ", Rows : " + table.getRows());
	    }
	}


}
