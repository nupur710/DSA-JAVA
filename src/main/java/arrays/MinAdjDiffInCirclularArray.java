package arrays;

public class MinAdjDiffInCirclularArray {
	
public static int minAdjDiff(int arr[], int n) {
        
        // Your code here
	int min= Math.abs(arr[1] - arr[0]);
	int circDiff= Math.abs(arr[n-1]-arr[0]);
	int finMin= Math.min(min, circDiff);
	int diff= 0;
	for(int i= 1; i<arr.length; i++) {
		diff= Math.abs(arr[i] - arr[i-1]);
		if(diff < finMin) {
			finMin= diff;
		}
	}
	return finMin;    
    }

public static void main(String[] args) {
int[] arr1= {10,-3,-4,7,6,5,-4,-1};
System.out.println(minAdjDiff(arr1, 8));
}

}
