package p1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Questions {
	ArrayList<String> names = new ArrayList<String>();
	HashSet<Integer> h = new HashSet<>();
	
	
	
	Map<String,Integer> emp = new LinkedHashMap<String,Integer>();
	public void addEmployees() {
		emp.put("Dhairya", 10000);
		emp.put("Rishi", 33000);
		emp.put("Sri", 50000);
		emp.put("Aka", 33000);
		
		Stream<Map.Entry<String, Integer>>empStream = emp.entrySet().stream();
		Map<Object,List<Map.Entry<String,Integer>>>empSal = empStream.collect(Collectors.groupingBy(e->e.getValue()));
		empSal.forEach((k,v)->{
			System.out.println(k+"|"+v);
		});
	}
	
	public void maxSalary() {
	
		Stream<Map.Entry<String, Integer>> sortedEmp = emp.entrySet().stream();
		sortedEmp.forEach(e->System.out.println(e.getKey()+e.getValue()));
		
	}
    public void addNames(){
    	
    	names.add("Dhairya");
    	names.add("Rishi");
    	names.add("Akanksha");
    	names.add("Srinath");
    	names.add("Mehnaz");
    	names.add("Rahul");
    	
	}
    
    public void groupByNamesLen() {
    	Map<Object, List<String>>groupedNames = names.stream().collect(Collectors.groupingBy(e->e.length()));
    	
    	groupedNames.forEach((k,v)->{
    		System.out.println(k + " " + v);
    	});
    }
	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public void addIntegers() {
		arr.add(12);
		arr.add(75);
		arr.add(82);
		arr.add(20);
		arr.add(100);
		arr.add(98);
		arr.add(100);
		arr.add(82);
		arr.add(12);
		
	}
	
	public void printList() {
		for(Map.Entry<String, Integer> entry:emp.entrySet()) {
			System.out.println(entry.getKey() + "|" + entry.getValue());
			
		}
	}
	
	public void maxInteger() {
		Stream<Integer> max = arr.stream().sorted(Comparator.reverseOrder()).limit(1);
		max.forEach(e->System.out.println(e));
		
		Optional<Integer> max1 = arr.stream().max(Comparator.naturalOrder());
//		System.out.println(max1);
	}
	
	public void listAvg() {
		long avg = arr.stream().reduce(0,(acc,curr)->acc+curr)/arr.stream().count();
//		long avg = sum/arr.stream().count();
		System.out.println(avg);
	}
	
	public void evenSquareSum() {
		long sum = arr.stream().filter(e->e%2==0).map(e->e*e).reduce(0,(acc,curr)->acc+curr);
		System.out.println(sum);
	}
	
	public void removeDuplicate() {
		List<Integer> filteredList = arr.stream().distinct().collect(Collectors.toList());
		System.out.println(filteredList);
	}
	
	public void maxLenString() {
		Optional<String> longestString = names.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println(longestString);
	}
	
	public void concatName() {
		String allNames = names.stream().reduce("",(s1,s2)->s1+s2);
		System.out.println(allNames);
	}
	
	public void empSal() {
		Stream<Integer> maxSal = emp.values().stream().sorted(Comparator.reverseOrder()).limit(2);
//		Stream<String>maxTwo = emp.keySet().stream().sorted(Comparator.reverseOrder()).limit(2);
		int secondMaxSal = maxSal.skip(1).findFirst().orElse(null);
//		if(secondMaxSal.isPresent()) {
//			System.out.println(secondMaxSal.get());
//		}
		
		emp.forEach((k,v)->{
			if(v>=secondMaxSal) {
				System.out.println(k);
			}
			
		});
	}
}