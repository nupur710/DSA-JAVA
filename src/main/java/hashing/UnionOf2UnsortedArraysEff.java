package hashing;

import java.util.HashSet;

public class UnionOf2UnsortedArraysEff {
	
	static int union(int[] a, int[] b) {
		HashSet<Integer> h= new HashSet<Integer>();
		for(int x : a)
			h.add(x);
		for(int y : b)
			h.add(y);
		
		return h.size();
	}
	
	public static void main(String[] args) {
		int[] a1= {15,20,5,15};
		int[] b1= {15,15,15,20,10};
		System.out.println(	union(a1, b1));
	}

}
