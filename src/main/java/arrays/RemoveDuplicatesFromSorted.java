package arrays;

public class RemoveDuplicatesFromSorted {
	
	public static void removeDuplicates(int[] arr) {
		int n= arr.length;
		for(int i= 1; i<n; i++) {
			if(arr[i] == arr[i-1]) {
				for(int j= i+1; j<n-1; j++) {
					arr[j]= arr[j+1];
				}
			}
		}
		for(int k= 0; k<arr.length; k++)
			System.out.println(arr[k]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {10, 20, 20, 30, 30, 30};
		removeDuplicates(nums);

	}

}
