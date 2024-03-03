package arrays;

public class LargestElementInArray {
	
	static int largest(int arr[]) {
		int greatest = arr[0];
		int secondGreatest= 0;
		for(int i= 1; i<arr.length; i++) {
			if(arr[i] > greatest)
				greatest= arr[i];
		}
//to next set greatest
		for(int i= 0; i<arr.length; i++) {
		if(arr[i] == greatest)
			continue;
	       secondGreatest= arr[i];
	}
		for(int j= 0; j<arr.length; j++) {
			if(arr[j] == greatest) {
				//System.out.println("skip");
				continue;
			}
			if(arr[j] > secondGreatest)
				secondGreatest= arr[j];
		}
		
		return greatest;
	}
	
	public static int secondLargest(int[] arr) {
		int firstLargest= largest(arr);
		int secondLargest= 0;
		for(int i= 0; i<arr.length; i++) {
			if(arr[i] == firstLargest)
				continue;
			secondLargest= arr[i];
		}
		for(int j= 0; j<arr.length; j++) {
			if(arr[j] == firstLargest)
				continue;
			if(arr[j] > secondLargest)
				secondLargest= arr[j];
		}
		return secondLargest;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {20, 10, 20, 8, 7, 12};
		System.out.println(largest(arr));
		System.out.println(secondLargest(arr));

	}

}
