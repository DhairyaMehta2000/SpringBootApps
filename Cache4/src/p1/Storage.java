package p1;

import java.util.HashMap;
import java.util.Map;

public class Storage {

	int capacity;
	Evict evict;
	Map<Integer,String> store;
	
	public Storage(int capacity) {
		this.capacity = capacity;
		this.store = new HashMap<>();
		this.evict = new Evict();
	}

	public String getValue(Integer key) {
		// TODO Auto-generated method stub
		if(store.containsKey(key)) {
			evict.keyAccessed(key);
			return store.get(key);
		}else {
			return "Data not Found";
		}
		
	}

	public void putValue(Integer key, String value) {
		// TODO Auto-generated method stub
		if(store.size()>=capacity) {
			DLLNode LRUNode = evict.doEvict();
			store.remove(LRUNode.data);
		}
		store.put(key, value);
		evict.keyAccessed(key);
		
	}
	
}
