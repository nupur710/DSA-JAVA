package arrays;

public class SecondLargestEff {
	public static int secondLargestEfficient(int arr[]) {
		int firstLargest= arr[0];
		int secondLargest= arr[1];
		for(int i= 1; i<arr.length; i++) {
			if(arr[i] > firstLargest) {
				secondLargest= firstLargest;
				firstLargest= arr[i];
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 5, 20, 8, 7};
		System.out.println(secondLargestEfficient(arr));
	}

}
