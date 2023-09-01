package p1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cache cache = new Cache(3);
		
		cache.put(1,"Value1");
		cache.put(2,"Value2");
		cache.put(3,"Value3");
		
		cache.put(4,"Value4");
		
		cache.put(5, "Value 5");
		cache.put(6, "Valur 6");
		
		System.out.println(cache.get(6));
		System.out.println(cache.get(5));
		System.out.println(cache.get(4));
		System.out.println(cache.get(3));
		System.out.println(cache.get(2));
		System.out.println(cache.get(1));
		
		
		
	}

}
