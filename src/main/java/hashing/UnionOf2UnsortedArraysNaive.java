package hashing;

import java.util.ArrayList;

public class UnionOf2UnsortedArraysNaive {
	
	static int union(int[] a, int[] b) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		int count= 0;
		for(int i= 0; i<a.length; i++) {
			if(!(al.contains(a[i])))
				al.add(a[i]);
		}
		
		for(int j= 0; j<b.length; j++)
			if(!(al.contains(b[j])))
				al.add(b[j]);
	return al.size();	
	}
	
	public static void main(String[] args) {
		int[] a1= {15,20,5,15};
		int[] b1= {15,15,15,20,10};
		System.out.println(	union(a1, b1));
	
	}
	
	

}
