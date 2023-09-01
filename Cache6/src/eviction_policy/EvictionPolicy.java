package eviction_policy;

public interface EvictionPolicy {

	public Integer doEvict();
	
	public void keyAccessed(Integer key);
}
