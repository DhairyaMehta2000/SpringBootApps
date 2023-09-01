package main;

import java.util.HashMap;
import java.util.Map;

import interfaces.Database;
import interfaces.Table;
import services.DatabaseService;

public class Main {
	public static void main(String args[]) {
		
		Database employees = DatabaseService.getInstance("Employees");
		
		Database students  =DatabaseService.getInstance("Students");
		
		students.createTable("Student");

		employees.createTable("Employee");
		
		Table employeeTable = employees.getTable("Employee");
		
		Map<Integer,String>column=new HashMap<>();
		column.put(101,"Dhairya");
		employeeTable.insertRow(101, column);
//		employeeTable.insertRow(102, "Rishi");
//		employeeTable.updateRow(101, "Aka");
		employeeTable.displayRow(102);
		
		employeeTable.displayRow(101);
		
		
	}

}
