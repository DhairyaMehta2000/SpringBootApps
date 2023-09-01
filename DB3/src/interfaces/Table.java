package interfaces;

import java.util.Map;

import services.RowService;

public interface Table {
	String getName();

	void setName(String name);

	Map<Integer, RowService> getRows();

	void setRows(Map<Integer, RowService> rows);
	void insertRow(Integer id,Map<Integer,String>column);
	void updateRow(Integer id,String name);
	void deleteRow(Integer id);
	void displayRow(Integer id);
	void clearRows();
}
