package arrays;

public class CheckIfSorted {
	
	public static boolean sorted(int arr[]) {
		boolean check= true;
		for(int i= 1; i<arr.length; i++) {
			if(arr[i] < arr[i-1])
				check= false;
		}		return check;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {100, 20, 200};
		System.out.println(sorted(nums));
	}

}
