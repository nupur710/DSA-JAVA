package hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFreqEff {
	
	static void countFreq(int arr[]) {
		HashMap<Integer, Integer> m= new HashMap<Integer,Integer>();
		for(int x : arr) {
			m.put(x, m.getOrDefault(x, 0)+1);
		for(Map.Entry<Integer, Integer> e : m.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {12,12,13,10,10,20,13,12,10,5};
		countFreq(arr);
	}

}
