package policy_factory;

import eviction_policy.EvictionPolicy;
import services.DLL;
import eviction_policy.LRUEvictionPolicy;

public class PolicyFactory {

	public EvictionPolicy createLRUPolicy(DLL dll) {
		return new LRUEvictionPolicy(dll);
	}
}
