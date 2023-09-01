package services;

import java.util.HashMap;
import java.util.Map;

import interfaces.Database;

public class DatabaseService implements Database{
	private String name;
	private Map<String, TableService> tables;
	private static DatabaseService instance;

	private DatabaseService(String name) {
		this.name = name;
		this.tables = new HashMap<>();
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

	public void setTables(Map<String, TableService> tables) {
		this.tables = tables;
	}
	
	public TableService getTable(String name) {
		return tables.get(name);
	}
	
	public static DatabaseService getInstance(String name) {
        if (instance == null) {
            instance = new DatabaseService(name);
        }
        return instance;
    }
	
	
	public void createTable(String name) {
		if(!tables.containsKey(name)) {
			TableService table = new TableService(name);
			tables.put(name, table);
		}else {
			System.out.println("Table already exists "+name);
		}
	}
	
	public void displayTables() {
		tables.forEach((k,v)->System.out.println(k+"|"+v));
	}
	
	public void deleteTable(String name) {
		TableService table = tables.get(name);
		table.clearRows();
		tables.remove(name);
	}
}
