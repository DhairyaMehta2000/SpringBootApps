package services;

import java.util.HashMap;
import java.util.Map;

public class TableService {
	private Map<String, RowService> rows;
	private String name;

	public TableService(String name) {
		this.name = name;
		rows = new HashMap<>();
	}

	public Map<String, RowService> getRows() {
		return rows;
	}

	public void setRows(Map<String, RowService> rows) {
		this.rows = rows;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public void insertRow( String name, Integer marks) {
		if (!rows.containsKey(name)) {
			RowService newRow = new RowService(name, marks);
			rows.put(name, newRow);
		} else {
			System.out.println("Row with id " + name + " already exists");
		}
	}

	public void updateRow( String newName, Integer newMarks) {
		RowService row = rows.get(newName);
		row.setMarks(newMarks);
		rows.put(newName, row);
	}

	public void deleteRow(String name) {
		if (rows.containsKey(name)) {
			rows.remove(name);
		} else {
			System.out.println("Row with name " + name + " not found");
		}
	}

	public void displayAllRows() {
		System.out.println("All rows:");
		for (Map.Entry<String, RowService> entry : rows.entrySet()) {
			RowService row = entry.getValue();
			System.out.println("Id: " + entry.getKey() + ", Name: " + row.getName() + ", Marks: " + row.getMarks());
		}
	}
	
	public void clearRows(String name) {
		rows.clear();
	}

	public void displayRow(String name) {
		RowService row = rows.get(name);
		if (row != null) {
			row.displayRow();
		} else {
			System.out.println("Row with id " + name + " not found");
		}
	}
}