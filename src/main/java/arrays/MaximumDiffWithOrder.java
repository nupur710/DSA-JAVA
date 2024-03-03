package arrays;

public class MaximumDiffWithOrder {
	
	static int maxDiff(int[] arr, int n) {
		int maxDiff= 0;
		int diff= 0;
		for(int i= 0; i<n; i++) {
			for(int j= n-1; j>i; j--) {
				diff= arr[j]-arr[i];
				System.out.println(" diff is " + diff + " for arr[i] " + arr[i] + " and arr[j] " + arr[j]);
				if(diff>maxDiff) {
					maxDiff= diff;
					System.out.println(" MAX DIFF BECOMES " + maxDiff);
					
				}
			}
			
		}
		return maxDiff;
	}
	
	static int maxDiffEff(int[] arr, int n) {
		int res= arr[1] - arr[0];
		int minVal= arr[0];
		for(int j= 1; j<n; j++) {
			res= Math.max(res, arr[j]-minVal);
			minVal= Math.min(minVal, arr[j]);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] a= {10,20,30};
		System.out.println(maxDiffEff(a,3));
	}

}
