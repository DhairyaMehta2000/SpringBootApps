package eviction_policies;

public interface EvictionPolicy {

	void keyAccessed(Integer key);
	
	Integer doEvict(Integer key);
}
