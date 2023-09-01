package main;

import services.DatabaseService;
import services.TableService;

public class Main{

	public static void main(String[] args) {
		DatabaseService db = DatabaseService.getInstance("Employees");
		DatabaseService db1 = DatabaseService.getInstance("Employees");
		db.createTable("Employee");
		
		TableService employeeTable = db.getTable("Employee");
		employeeTable.insertRow(101, "Dhairya");
		employeeTable.updateRow(101, "Rishi");
		employeeTable.insertRow(102, "Dhairya");
		employeeTable.deleteRow(101);
		employeeTable.displayAllRows();
		db.createTable("Students");
		
		db.displayTables();
		
		db.deleteTable("Students");
		System.out.println("After");
		db.displayTables();
	}

	

}
