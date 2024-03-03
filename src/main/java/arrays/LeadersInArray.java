package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
	
	static ArrayList<Integer> leaders(int arr[], int n) {
		ArrayList<Integer> arr1= new ArrayList<Integer>();
		int count= 0;
		for(int i= 0; i<arr.length; i++) {
			int var= (n-1)-i;
			count= 0;
			for(int j= i+1; j<arr.length; j++) {
				if(arr[j]<arr[i]) {
					count++;
				}
			}
			if(count == var) {
				arr1.add(arr[i]);
			}
		}
		System.out.println(arr1);
		
		return arr1;
	}
	
	static ArrayList<Integer> leadersEff(int arr[], int n) {
		 ArrayList<Integer> arr1= new ArrayList<Integer>();
			int currleader= arr[n-1];
			for(int i= n-2; i>0; i--) {
			    if(currleader < arr[i]) {
			        currleader= arr[i];
			        arr1.add(arr[i]);
			    }
			}
			Collections.reverse(arr1);
			System.out.println(arr1);
			return arr1;
	}
	
	public static void main(String[] args) {
		int[] narr= {30,20,10,10};
		leadersEff(narr,4);
	}

}
