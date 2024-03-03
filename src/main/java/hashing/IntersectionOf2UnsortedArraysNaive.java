package hashing;

import java.util.ArrayList;

public class IntersectionOf2UnsortedArraysNaive {
	
	static void unsort(int[] a, int[] b) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i= 0; i<a.length; i++) {
			for(int j= 0; j<b.length; j++) {
				if(a[i] == b[j])
					al.add(a[i]);
			}
		}
		System.out.println(al);
	}
	
	public static void main(String[] args) {
		int[] arr= {10,20,30};
		int[] arr2= {30,20,10};
		unsort(arr, arr2);
	}

}
