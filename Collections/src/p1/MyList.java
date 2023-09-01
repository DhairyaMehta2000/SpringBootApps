package p1;

import java.util.ArrayList;

//Write a program that uses an ArrayList to store a list of names. Implement methods to add a name, remove a name, check if a name exists, and display the list of names.

public class MyList {
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
	
	public void removeName(String name){
	    if(findName(name)){
	        arr.remove(name);
	    }
	    else{
	        System.out.println("Could not find the name");
	    }
	}
	public void displayNames(){
	    for(String name:arr){
	        System.out.println(name);
	    } 
	}
}
