package hashing;

import java.util.HashSet;

public class IntersectionOf2UnsortedArraysEff {
	
	static void intersect(int a[] , int b[]) {
		
		HashSet<Integer> h= new HashSet<Integer>();
		for(int i= 0; i<b.length; i++) {
			h.add(b[i]);
		}
		for(int j= 0; j<a.length; j++) {
			if(h.contains(a[j]))
				
				System.out.println(a[j]);
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] arr= {10,20,30};
		int[] arr2= {30,20,10};
		intersect(arr, arr2);
	}

}
