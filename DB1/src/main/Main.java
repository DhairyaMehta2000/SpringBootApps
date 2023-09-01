package main;

import interfaces.Row;
import services.DatabaseService;
import services.RowService;
import services.TableService;
//import services.table; 

public class Main {

	public static void main(String[] args) {
		DatabaseService db = new DatabaseService("Students");
		db.createTable("Student");
		TableService table = db.getTable("Student");
//		table.insertRow(null, null, null);

		table.insertRow( "John", 85);
		table.insertRow( "Alice", 92);
		table.insertRow( "Bob", 78);

//		table.displayAllRows();

		table.updateRow("Bob", 95);
		table.deleteRow("Alice");

//		table.displayAllRows();
		
//		table.displayRow("Alice");
		
//		db.deleteTable("Student");
//		table.displayAllRows();
		
		db.createTable("Employees");
		TableService table1 = db.getTable("Employees");
		table1.insertRow("Dhairya", 23);
//		table1.insertRow("Dhairya", 50);
		db.displayAllTables();

		table.displayAllRows();
	}

}
