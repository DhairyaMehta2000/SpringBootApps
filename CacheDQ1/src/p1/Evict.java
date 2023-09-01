package p1;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Evict {

	private Deque deque;
//	private Map<Integer,Deque> map;
	public Evict() {
//		this.map=new HashMap<>();
		this.deque = new LinkedList<>();
	}
	
	public Object doEvict() {
		// TODO Auto-generated method stub
		return deque.removeFirst();
	}

	public void keyAccessed(Integer id) {
		if(deque.contains(id)) {
			deque.remove(id);
			deque.addLast(id);
		}else {
			deque.addLast(id);
		}
		
		
	}

	
}
