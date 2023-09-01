package eviction_factory;

import eviction_policies.EvictionPolicy;
import eviction_policies.LRUEvictionPolicy;

public class EvictionFactory {
	public EvictionPolicy createLRUEvictionPolicy() {
		return new LRUEvictionPolicy();
	}

	
}
