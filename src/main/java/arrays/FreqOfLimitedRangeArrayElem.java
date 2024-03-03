package arrays;

import java.util.Arrays;

public class FreqOfLimitedRangeArrayElem {
	
	public static void frequencyCount(int arr[], int N, int P)
    {
		int k= 0;
       int[] temp= new int[N];
       int count= 0;
       for(int i= 1; i<=N; i++) {
    	   count= 0;
    	   for(int j= 0; j<arr.length; j++) {
    		   if(arr[j] == i)
    			   count++;
    	   }
    	   temp[k++]= count;
       }
       
       for(int a= 0; a<temp.length; a++) {
    	   arr[a]= temp[a];
       }
    }
	
	public static void main(String[] args) {
		int[] arr1= {2, 4, 5, 6, 8};
		frequencyCount(arr1, 5, 10);
	}

}
