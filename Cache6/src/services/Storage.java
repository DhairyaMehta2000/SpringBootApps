	package services;

import java.util.HashMap;
import java.util.Map;

import eviction_policy.EvictionPolicy;

public class Storage {

	private int capacity;
	private EvictionPolicy evictionPolicy;
	private Map<Integer, String> store;
	
	public Storage(int capacity, EvictionPolicy evictionPolicy){
		this.capacity=capacity;
		this.evictionPolicy=evictionPolicy;
		store=new HashMap<>();
		
	}
	
	public void get(Integer key) {
		if(store.containsKey(key)) {
			System.out.println(store.get(key));
			evictionPolicy.keyAccessed(key);
		}else {
			System.out.println("Data not found");
		}
	}
	
	public void set(Integer key, String value) {
		if(store.size()>=capacity) {
			Integer data = evictionPolicy.doEvict();
			store.remove(data);
		}
		store.put(key, value);
		evictionPolicy.keyAccessed(key);
	}
}
