package main;

import java.util.List;

import interfaces.Database;
import interfaces.Table;
import service.MyDatabase;
import service.MyRecord;
import interfaces.Record;

public class Main {

	public static void main(String[] args) {
		Database database = new MyDatabase();
        database.createTable("employees");

        Table employeesTable = database.getTable("employees");

        Record record1 = new MyRecord();
        record1.setColumnValue("name", "John");
        record1.setColumnValue("age", 30);
        employeesTable.insertRecord(record1);

        Record record2 = new MyRecord();
        record2.setColumnValue("name", "Jane");
        record2.setColumnValue("age", 25);
        employeesTable.insertRecord(record2);
        
        Record record3 = new MyRecord();
        record3.setColumnValue("name", "Dhairya");
        record3.setColumnValue("age", 23);
        employeesTable.insertRecord(record3);

        System.out.println("All records in employees table:");
        employeesTable.printAllRecords();

        List<Record> filteredRecords = employeesTable.filterRecords("age", 30);
        System.out.println("Filtered records (age = 30):");
        for (Record record : filteredRecords) {
            System.out.println(record);
        }

        database.deleteTable("employees");
        System.out.println("After deleting");
        employeesTable.printAllRecords();
        
        database.createTable("Students");
         Table studentTable = database.getTable("Students");
         Record record4 = new MyRecord();
         record4.setColumnValue("name","Dhairya");
         record4.setColumnValue("marks", 35);

         studentTable.insertRecord(record4);
         studentTable.printAllRecords();
         
         List<Record> filteredMarks = studentTable.filterRecords("marks", 35);
         filteredMarks.forEach(marks->System.out.println(marks.getColumnValue("marks")));
	}

}
