package p1;

public class Cache {

	int capacity;
	private final Storage store;
	
	public Cache(int capacity) {
		this.capacity=capacity;
		store = new Storage(capacity);
	}

	public void put(Integer key, String value) {
		// TODO Auto-generated method stub
		store.putValue(key,value);
		
	}

	public String get(Integer key) {
		return store.getValue(key);
	}
}
