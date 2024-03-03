package arrays;

import java.util.Date;

public class ReverseAnArray {
	
	//Method 1
	public static void reverse(int arr[]) {
		int[] reversed= new int[arr.length];
		int j= 0;
		for(int i= arr.length-1; i>=0; i--) {
				reversed[j++]= arr[i];
			
		}
		for(int k= 0; k<arr.length; k++)
			System.out.println(reversed[k]);
	}
	
	public static void reverse2(int arr[]) {
		int low= 0;
		int high= arr.length-1;
		while(low<high) {
			int temp= arr[low];
			arr[low]= arr[high];
			arr[high]= temp;
			low++;
			high--;
		}
		for(int i= 0; i<arr.length; i++)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {30, 7, 5, 6, 10};
		reverse2(nums);
	}
	

}
