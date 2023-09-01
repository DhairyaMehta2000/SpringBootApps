package main;

import eviction_policy.EvictionPolicy;
import eviction_policy.LRUEvictionPolicy;
import policy_factory.PolicyFactory;
import services.Cache;
import services.DLL;

public class Main {

	public static void main(String args[]) {
		PolicyFactory factory = new PolicyFactory();
		DLL dll = new DLL();
		EvictionPolicy policy = factory.createLRUPolicy(dll);
		Cache cache = new Cache(2,policy);
		cache.set(1,"Dhairya");
		cache.set(2, "RIshi");
		cache.get(1);
		cache.set(3, "Sri");
		cache.get(2);
		cache.get(3);
	}
}
