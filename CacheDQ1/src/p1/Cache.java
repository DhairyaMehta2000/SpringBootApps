package p1;

public class Cache {

	private int capacity;
	private Storage storage;
	public Cache(int capacity) {
		this.capacity=capacity;
		this.storage = new Storage(capacity);
	}
	public void put(Integer id , String name) {
		storage.put(id,name);
		
	}
	public void get(Integer id) {
		System.out.println(storage.get(id));
		
	}
}
