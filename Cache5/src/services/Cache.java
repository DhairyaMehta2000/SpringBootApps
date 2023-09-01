package services;

import eviction_policies.EvictionPolicy;

public class Cache {
	
	private int capacity;
	private Storage store ;
	private EvictionPolicy evictionPolicy;
	
	public Cache(int capacity,EvictionPolicy evictionPolicy) {
		this.capacity=capacity;
		store=new Storage(capacity,evictionPolicy);
		this.evictionPolicy=evictionPolicy;
	}
	
	
	public String get(Integer key) {
		return store.get(key);
	}
	
	public void set(Integer key, String value) {
		store.set(key,value);
	}
}
