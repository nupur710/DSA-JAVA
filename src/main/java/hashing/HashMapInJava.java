package hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapInJava {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hm= new HashMap<String, Integer>();
		hm.put("gfg", 10);
		hm.put("hello", 12);
		hm.put("dsa", 20);
		
		System.out.println(hm.size());
		
		for(Map.Entry<String, Integer> e : hm.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
		
		if(hm.containsKey("gfg"))
			System.out.println("yes");
		
		if(hm.containsValue(10))
			System.out.println("double yes");
		
		hm.remove("dsa");
		
		for(Map.Entry<String, Integer> e : hm.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
		
		System.out.println(hm.size());
		
	}

}
