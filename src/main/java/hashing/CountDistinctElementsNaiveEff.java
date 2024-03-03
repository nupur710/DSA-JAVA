package hashing;

import java.util.HashSet;

public class CountDistinctElementsNaiveEff {
	
	public static int countDistinceElements(int[] arr) {
		HashSet<Integer> hs= new HashSet<Integer>();
		for(int i= 0; i<arr.length; i++)
			hs.add(arr[i]);
		
		return hs.size();
	}
	
	public static void main(String[] args) {
		int[] k= {12, 13, 13, 18, 10, 12, 13};
		System.out.println(countDistinceElements(k));
	}

}
