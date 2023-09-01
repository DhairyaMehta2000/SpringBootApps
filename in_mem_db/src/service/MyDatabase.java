package service;

import java.util.HashMap;
import java.util.Map;

import interfaces.Database;
import interfaces.Table;

public class MyDatabase implements Database {
    private Map<String, Table> tables = new HashMap<>();

    @Override
    public void createTable(String tableName) {
        if (!tables.containsKey(tableName)) {
            tables.put(tableName, new MyTable(tableName));
        }
    }

    @Override
    public void deleteTable(String tableName) {
    	Table table = tables.get(tableName);
        tables.remove(tableName);
        table.deleteRecords();
        }

    @Override
    public Table getTable(String tableName) {
        return tables.get(tableName);
    }
}

