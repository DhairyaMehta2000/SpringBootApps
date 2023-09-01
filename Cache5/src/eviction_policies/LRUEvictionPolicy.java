package eviction_policies;

import java.util.HashMap;
import java.util.Map;

import services.DLL;
import services.DLLNode;

public class LRUEvictionPolicy implements EvictionPolicy{
	private Map<Integer, DLLNode> map;
	private DLL dll;
	
	public LRUEvictionPolicy(){
		map=new HashMap<>();
		dll= new DLL();
	}
	
	@Override
	public void keyAccessed(Integer key) {
		
		if(map.containsKey(key)) {
			dll.removeNode(map.get(key));
			dll.insertNodeAtEnd(map.get(key));
		}else {
			DLLNode node = dll.insertElementAtEnd(key);
			map.put(key, node);
		}
	}

	@Override
	public Integer doEvict(Integer key) {
		// TODO Auto-generated method stub
		DLLNode node = dll.getFirst();
		dll.removeNode(node);
		map.remove(node.data);
		return node.data;
				
	}

}
