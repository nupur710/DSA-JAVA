package arrays;

public class OperationsOnArrays2 {
	
	public static int delete(int arr[], int n, int x) {
		int i= 0;
		for(i= 0; i<n; i++) {
			if(arr[i] == x)
				break;
			
		    if(i == n)
			return n;
		for(int j= i; j<n - 1; j++)
			arr[j]= arr[j+1];

		}
		
		for(int a= 0; a<n; a++)
			System.out.println(arr[a]);
		return n - 1;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3, 8, 12, 5, 6};
		delete(nums, 5, 8);
	}

}
