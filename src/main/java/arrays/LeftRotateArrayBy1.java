package arrays;

public class LeftRotateArrayBy1 {
	
	static void leftRotate(int[] arr, int n) {
		int temp= arr[0];
		
		for(int i=1; i<n; i++) {
			arr[i-1]= arr[i];
		}
		arr[n-1]= temp;
		
		for(int j= 0; j<n; j++)
			System.out.println(arr[j]);
	}
	
	public static void main(String[] args) {
          int[] arr= {1,2,3,4,5};
          leftRotate(arr, 5);
	}

}
