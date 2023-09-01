package services;

import java.util.HashMap;
import java.util.Map;

import interfaces.Row;
import interfaces.Table;

public class TableService implements Table{

	private String name;
	private Map<Integer, RowService> rows;
	
	public TableService(String name) {
		this.name=name;
		this.rows=new HashMap<>();
	}

	
	public void insertRow(Integer id,Map<Integer,String>column) {
		if(!rows.containsKey(id)) {
//			Map<Integer,String>column = new HashMap<>();
			
			RowService row = new RowService(id);
			for (Map.Entry<Integer, String> entry : column.entrySet()) {
                row.setColumn(entry.getKey(), entry.getValue());
            }
			rows.put(id, row);
		}else {
			System.out.println("Row with id "+id+" already present");
		}
	}
	
	public void updateRow(Integer id,String name) {
		if(!rows.containsKey(id)) {
			System.out.println("No row to update...");
		}else {
			RowService row = rows.get(id);
			row.setId(id);
			row.setName(name);
		}
	}
	
	public void deleteRow(Integer id) {
		if(rows.containsKey(id)) {
			rows.remove(id);
		}else {
			System.out.println("No row to delete");
		}
	}
	
	public void displayRow(Integer id) {
		if(rows.containsKey(id)) {
			rows.get(id).getColumn(id);
		}else {
			System.out.println("Row does not exist...");
		}
	}
	
	public void clearRows() {
		rows.clear();
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

	public TableService(String name, Map<Integer, RowService> rows) {
		super();
		this.name = name;
		this.rows = rows;
	}

}
