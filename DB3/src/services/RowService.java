package services;

import java.util.HashMap;
import java.util.Map;

import interfaces.Row;

public class RowService implements Row {

	private Integer id;
	private Map<Integer,String>column;
	private String name;

	public RowService(Integer id) {
		super();
		this.id = id;
		this.column=new HashMap<>();
	}

	public String getColumn(Integer id) {
		return column.get(id);
	}

	public void setColumn(Integer id, String name) {
		column.put(id, name);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
