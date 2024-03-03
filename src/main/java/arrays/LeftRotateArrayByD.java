package arrays;

public class LeftRotateArrayByD {
	
	static void leftRotate(int[] arr, int n, int d) {
		int var= 0;
		int[] temp= new int[d];
		for(int i= 0; i<d; i++) {
			temp[i]= arr[i];
			//System.out.println(temp[i]);
		}
		for(int j= d; j<n; j++) {
			arr[j-d]= arr[j];
		}
		
		
		for(int i= 0; i<d; i++) {
			arr[n-d+i]= temp[i];
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		leftRotate(arr1, 5, 2);
	}

}
