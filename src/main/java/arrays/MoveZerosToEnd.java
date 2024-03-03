package arrays;

public class MoveZerosToEnd {
	
	static void moveZeros(int arr[], int n) {
		int c= 0;
		int[] temp= new int[n];
		for(int i= 0; i<n; i++) {
			if(arr[i] != 0) {
				temp[c++]= arr[i];
			}
		}
		for(int j= 0; j<n; j++)
			System.out.println(temp[j]);
	}
	
	static void moveZerosEff(int arr[], int n) {
		int count= 0;
		for(int i= 0; i<n; i++) {
			if(arr[i] != 0) {
				swap(arr[i], arr[count]);
				count++;
			}
		}
	}
	
	static void swap(int arr, int arr2) {
		int temp= 0;
		temp= arr;
		arr= arr2;
		arr2= temp;
	}
	
	public static void main(String[] args) {
		int[] arr1= {8, 5, 10, 0, 10, 0, 20};
		moveZeros(arr1, 7);
	}

}
