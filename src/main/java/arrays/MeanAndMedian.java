package arrays;

import java.util.Arrays;

public class MeanAndMedian {
	
	static int median(int A[], int n) {
		
		Arrays.sort(A);
		int med = 0;
		int median= 0;
		if(n%2 != 0) {
			med= (n+1)/2;
			median= A[med-1];
			return median;
		} else if(n%2 == 0) {
			med= A[(n/2)-1] + A[((n/2)+1)-1];
			median= (int) Math.floor(med/2);
			return median;
		}
		return 0;
	}
	
	static int mean(int A[], int n) {
		float sum= 0;
		float mean=0;
		for(int i= 0; i<n; i++) {
			sum+= A[i];
		}
		mean= sum/n;
		return (int) mean;
	}
	
//	static int[] sort(int arr[]) {

	//}

	public static void main(String[] args) {
		int[] arr1= {2, 6, 3, 8, 4, 9};
	//	median(arr1, 6);
		System.out.println(mean(arr1, 6));
	}
}
