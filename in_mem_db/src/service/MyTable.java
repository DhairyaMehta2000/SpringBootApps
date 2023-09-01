package service;

import java.util.ArrayList;
import java.util.List;
import interfaces.Record;
import interfaces.Table;

public class MyTable implements Table {
    private String name;
    private List<Record> records = new ArrayList<>();

    public MyTable(String name) {
        this.name = name;
    }

    @Override
    public void insertRecord(Record record) {
        records.add(record);
    }

    @Override
    public void printAllRecords() {
    	if(records.size()>0) {
    		for (Record record : records) {
                System.out.println(record);
            }
    	}else {
    		System.out.println("No records to display");
    	}
        
    }

    @Override
    public List<Record> filterRecords(String columnName, Object value) {
        List<Record> filteredRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getColumnValue(columnName).equals(value)) {
                filteredRecords.add(record);
            }
        }
        return filteredRecords;
    }
    
    public void deleteRecords() {
    	records.clear();
    }

	public List<Record> getRecords() {
		return records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

//	@Override
//	public void insertRecord(interfaces.Record record) {
//		// TODO Auto-generated method stub
//		
//	}
}
