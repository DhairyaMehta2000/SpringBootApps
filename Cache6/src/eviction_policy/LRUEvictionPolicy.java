package eviction_policy;

import java.util.HashMap;
import java.util.Map;

import services.DLL;
import services.DLLNode;

public class LRUEvictionPolicy implements EvictionPolicy{

	private DLL dll;
	private Map<Integer, DLLNode> map;
	
	public LRUEvictionPolicy(DLL dll) {
		this.dll= dll;
		map=new HashMap<>();
	}
	
	public Integer doEvict() {
		DLLNode node = dll.getFirst();
		dll.removeNode(node);
		map.remove(node.data);
		return node.data;
	}
	
	public void keyAccessed(Integer data) {
		if(map.containsKey(data)) {
			dll.removeNode(map.get(data));
			dll.insertNodeAtEnd(map.get(data));
		}
		else {
			 DLLNode node = dll.insertElementAtEnd(data);
			 map.put(data,node );
		}
	}

	
}
