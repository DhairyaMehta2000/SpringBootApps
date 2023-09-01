package service;

import java.util.HashMap;
import java.util.Map;
import interfaces.Record;

public class MyRecord implements Record {
    private Map<String, Object> columns = new HashMap<>();

    @Override
    public void setColumnValue(String columnName, Object value) {
        columns.put(columnName, value);
    }

    @Override
    public Object getColumnValue(String columnName) {
        return columns.get(columnName);
    }

    @Override
    public String toString() {
        return columns.toString();
    }
}


   
