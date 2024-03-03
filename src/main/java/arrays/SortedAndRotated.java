package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortedAndRotated {
	
	public static boolean checkRotatedAndSorted(int arr[], int num) {
		
		int[] temp= arr.clone();
		int count= 0;
		int count2=0;
		Arrays.sort(arr);
		int[] rev= arr.clone();
		int[] temp2= arr.clone();
		
		//temp: 3214; arr:1234
		
		int start= arr[0];
		int end= arr[num-1];
		
		while(temp[0] != start && temp[num-1] != end) {
			temp= leftRotate(temp);
			count2++;
		}
		
		for(int k=0; k<num; k++) {
			if(arr[k] == temp[k])
				count++;
		}
		
		for(int j= 0; j<temp.length; j++)
			System.out.println(temp[j]);
		
		if(count == num && count2>0)
			return true;
		else
			return false;
		}
		

	
	
	static int[] leftRotate(int[] arr) {
		int temp= arr[0];
		
		for(int i=1; i<arr.length; i++) {
			arr[i-1]= arr[i];
		}
		arr[arr.length-1]= temp;
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] a= {10,20,14};
		System.out.println(checkRotatedAndSorted(a, 3));
	}

}
