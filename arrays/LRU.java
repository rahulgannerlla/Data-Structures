package arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU{
	
	
	private static LinkedHashMap<Integer, Integer> m;

	public static void m1(){
		  m=new LinkedHashMap<Integer, Integer>(3){
			protected boolean removeEldestEntry(@SuppressWarnings("rawtypes") Map.Entry eldest) {
			       return m.size() > 3;
			    }
		};
		
		
		
		m.put(1, 1);
		m.put(2, 2);
		m.put(3, 3);
		
		System.out.println(m);
		m.put(1, 100);
		System.out.println(m);
		m.put(4, 4);
		System.out.println(m);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}
