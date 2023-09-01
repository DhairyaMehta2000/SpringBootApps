package p1;

import java.util.HashMap;
import java.util.Map;

public class Storage {
	private int capacity;
	private Evict evict;
	private Map<Integer, String>store ;
	public Storage(int capacity) {
		this.capacity = capacity;
		this.evict = new Evict();
		this.store=new HashMap<>();
	}
	public void put(Integer id, String name) {
		if(store.size()>=capacity) {
			Object lru= evict.doEvict();
			System.out.println("removed " +store.remove(lru));
			
		}
		store.put(id, name);
		evict.keyAccessed(id);
		
	}
	public String get(Integer id) {
		if(store.containsKey(id)) {
			evict.keyAccessed(id);
			return store.get(id);
			
		}
		return "Not found";
		
	}
}
