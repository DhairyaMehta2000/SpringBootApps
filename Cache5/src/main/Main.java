package main;

import eviction_factory.EvictionFactory;
import eviction_policies.EvictionPolicy;
import eviction_policies.LRUEvictionPolicy;
import services.Cache;

public class Main {

	public static void main(String[] args) {
		EvictionFactory factory = new EvictionFactory();
		EvictionPolicy LRUEvictionPolicy = factory.createLRUEvictionPolicy();
//		EvictionPolicy LRUEvictionPolicy = new LRUEvictionPolicy();
		Cache cache = new Cache(2, LRUEvictionPolicy);
		cache.set(1, "Dhairya");
		cache.set(2, "Aka");
		System.out.println(cache.get(1));
		cache.set(3, "Rishi");
		System.out.println(cache.get(1));
		System.out.println(cache.get(2));
		System.out.println(cache.get(3));

	}

}
