package arrays;

public class ReversalAlgorithm {
	  static void rotateArr(int arr[], int d, int n)
	    {
	        reverse(arr, 0, d-1);
	        reverse(arr, d, n-1);
	        reverse(arr, 0, n-1);
	        
	        for(int i= 0; i<n; i++)
	        	System.out.println(arr[i]);
	    }
	    
	    static void reverse(int arr1[], int low, int high) {
	        while(low<high) {
	        	int temp= arr1[low];
	        	arr1[low]= arr1[high];
		        arr1[high]= temp;
	            low++;
	            high--;
	        }
	    }
	    
	    static void swap(int x, int y) {

	        int temp= x;
	        x= y;
	        y= temp;
	     
	    }
	    
	    public static void main(String[] args) {
			int[] a= {40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 53, 57, 2, 81, 87, 42, 66, 90, 45, 20, 41, 30, 32, 18, 98, 72, 82, 76, 10, 28, 68, 57, 98, 54, 87, 66, 7, 84, 20, 25, 29, 72, 33, 30, 4, 20, 71, 69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65, 25};
			rotateArr(a, 69, 77);
			
//			int c= 2;
//			int b= 3;
//			swap(c, b);
			
		}

}
