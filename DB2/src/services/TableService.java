package services;

import java.util.HashMap;
import java.util.Map;

import interfaces.Table;

public class TableService implements Table {
	private String name;
	private Map<Integer, RowService> rows;

	public TableService(String name) {
		this.name = name;
		this.rows = new HashMap<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Integer, RowService> getRows() {
		return rows;
	}

	public void setRows(Map<Integer, RowService> rows) {
		this.rows = rows;
	}

	public void insertRow(Integer id, String name) {
		if(rows.containsKey(id)) {
			System.out.println("Row with id "+id+" already exists");
		}else {
			RowService newRow = new RowService(id, name);
			rows.put(id , newRow);
		}
		
	}
	
	public void updateRow(Integer id, String name) {
		RowService newRow = rows.get(id);
		newRow.setId(id);
		newRow.setName(name);
	}
	
	public void deleteRow(Integer id) {
		if(rows.containsKey(id)) {
			rows.remove(id);
		}else {
			System.out.println("Row with id "+id+" not found");
		}
		
	}
	
	public void displayAllRows() {
		for(Map.Entry<Integer, RowService> entry:this.rows.entrySet()) {
			RowService row = rows.get(entry.getKey());
			System.out.println(entry.getKey()+"|"+row.getId()+"|"+row.getName());
		}
	}
	
	public void displayRow(Integer id) {
		if(rows.containsKey(id)) {
			RowService row = rows.get(id);
			System.out.println(row.getId()+"|"+row.getName());
		}
	}
	
	public void clearRows() {
		rows.clear();
	}

}
