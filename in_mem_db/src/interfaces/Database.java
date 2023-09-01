package interfaces;

public interface Database {
    void createTable(String tableName);
    void deleteTable(String tableName);
    Table getTable(String tableName);
}
