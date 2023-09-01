package interfaces;

import java.util.List;

public interface Table {
	void insertRecord(Record record);

	void printAllRecords();

	List<Record> filterRecords(String columnName, Object value);

	void deleteRecords();

//	void insertRecord(java.lang.Record record);
}
