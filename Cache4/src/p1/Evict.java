package p1;

import java.util.HashMap;
import java.util.Map;

public class Evict {

	Map<Integer,DLLNode> map;
	DLL dll;
	
	public Evict() {
		this.map = new HashMap<>();
		this.dll= new DLL();
		
	}

	public DLLNode doEvict() {
		// TODO Auto-generated method stub
		DLLNode node = dll.getFirst();
		dll.removeNode(node);
		map.remove(node.data);
		return node;
	}

	public void keyAccessed(Integer key) {
		// TODO Auto-generated method stub
		if(map.containsKey(key)) {
			dll.removeNode(map.get(key));
			dll.insertAtEnd(map.get(key));
		}else {
			DLLNode node = dll.insertElementAtEnd(key);
			map.put(key, node);
		}
	}
}
