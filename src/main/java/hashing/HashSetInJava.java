package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJava {
	
	public static void main(String[] args) {
		HashSet<String> h= new HashSet<String>();
		h.add("gfg");
		h.add("java");
		h.add("dsa");
		System.out.println(h);
		System.out.println(h.contains("gfg"));
		Iterator<String> i= h.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println(h.size());
		h.remove("java");
		System.out.println(h.size());
		for(String s: h)
			System.out.println(s);
		System.out.println(h.isEmpty());
		h.clear();
		System.out.println(h.isEmpty());
	}

}
