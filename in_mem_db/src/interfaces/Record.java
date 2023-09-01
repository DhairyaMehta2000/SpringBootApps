package interfaces;

public interface Record {
	void setColumnValue(String columnName, Object value);

	Object getColumnValue(String columnName);
}
