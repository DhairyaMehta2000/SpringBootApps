package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class MyCollection{
ArrayList<String> arr = new ArrayList<String>();
	
	public void addNames(){
	    arr.add("Dhairya");
	    arr.add("Rishi");
	    arr.add("Aka");
	    arr.add("Sri");
	}
	
	public boolean findName(String name) {
		for(String name1:arr) {
			if(name==name1) {
				return true;
			}
		}
		return false;
	}
	
}

public class EmployeeMain {
	 
	
	
	public static void main(String[] args) {
		
		MyCollection m1 = new MyCollection();
		m1.addNames();
//		System.out.println(m1.arr);
//		System.out.println(m1.findName("Srinath"));
		
		Map<Integer,String> m = new LinkedHashMap<Integer,String>();
		m.put(1,"Dhairya");
		m.put(2, "Akanksha");
		m.put(3,"Rishi");
		m.put(25, "Sri");
		
		Stream<Integer> keys = m.keySet().stream();
		Stream<String> values = m.values().stream().sorted(Comparator.reverseOrder()).limit(2);
		Stream<Integer> sorted_vals = keys;
//		m.forEach((k,v)->{
//			System.out.println(k + " " + v);
//		});
		values.forEach(k->System.out.println(k));
	}
		
}
