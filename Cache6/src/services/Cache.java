package services;

import eviction_policy.EvictionPolicy;

public class Cache {

	private int capacity;
	private EvictionPolicy evictionPolicy;
	private Storage store;
	
	public Cache(int capacity, EvictionPolicy evictionPolicy) {
		this.capacity=capacity;
		this.evictionPolicy=evictionPolicy;
		this.store= new Storage(capacity, evictionPolicy);
	}
	
	public void get(Integer key) {
		store.get(key);
	}
	
	public void set(Integer key, String value) {
		store.set(key,value);
	}
}
