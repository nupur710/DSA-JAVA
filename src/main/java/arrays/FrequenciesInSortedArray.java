package arrays;

public class FrequenciesInSortedArray {
	
	static void freq(int[] arr, int n) {
		int count= 1;
		for(int i= 1; i<n; i++) {
			if(arr[i-1] == arr[i]) {
				count++;
				System.out.println("count of " + arr[i] + " is " + count);
			}
			
			else {
				count = 1;
				System.out.println("count of " + arr[i] + " is " + count);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {10,10,10,25,30,30};
		freq(arr,6);
	}

}
