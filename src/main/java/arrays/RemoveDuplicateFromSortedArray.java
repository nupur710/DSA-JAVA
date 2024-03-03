package arrays;

public class RemoveDuplicateFromSortedArray {
	
	static int[] remDuplicate(int arr[], int n) {
		int[] temp= new int[n];
		temp[0]= arr[0];
		int res= 1;
		for(int i= 1; i<n; i++) {
			if(temp[res-1] != arr[i]) {
				temp[res]= arr[i];
				res++;
			}
		}
	for(int j=0; j<res; j++) {
		arr[j]= temp[j];
	    System.out.println(arr[j]);
	}
	return arr;
	}
	
	static int[] remDuplicateEff(int arr[], int n) {
		int res= 1;
		for(int i= 1; i<n; i++) {
			if(arr[i] != arr[res-1]) {
				arr[res]= arr[i];
				res++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr1= {10, 20, 20, 30, 30, 30};
		remDuplicate(arr1, 6);
	}
}
