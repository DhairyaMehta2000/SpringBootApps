package services;

import java.util.HashMap;
import java.util.Map;

import eviction_policies.EvictionPolicy;
import eviction_policies.LRUEvictionPolicy;

public class Storage {
	private int capacity;
	Map<Integer, String> store;
	EvictionPolicy evictionPolicy;

	public Storage(int capacity,EvictionPolicy evictionPolicy) {
		this.capacity = capacity;
		store = new HashMap<>();
//		LRU = new LRUEvictionPolicy();
		this.evictionPolicy=evictionPolicy;
	}

	public String get(Integer key) {
		if(store.containsKey(key)) {
			evictionPolicy.keyAccessed(key);
			return store.get(key);
		}else {
			return "Data not found";
		}
		
	}

	public void set(Integer key, String value) {
		if (store.size() >= capacity) {
			Integer lruNode = evictionPolicy.doEvict(key);
			store.remove(lruNode);
		}
		store.put(key, value);
		evictionPolicy.keyAccessed(key);

	}
}
