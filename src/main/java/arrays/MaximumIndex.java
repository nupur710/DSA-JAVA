package arrays;

public class MaximumIndex {
	
	static int maxIndexDiff(int A[], int N) { 
        int max= 0;
        int diff= 0;
        int pos= 0;
        for(int i= 0; i<N-1; i++) {
            for(int j= N-1; j>i; j--) {
                diff= j-i;
                pos= A[j]-A[i];
                if(pos>=0 && diff>max) {
                    max= diff;
                    System.out.println("Max diff " + max + " is b/w j " + j + " and i " + i + " A[j] " + A[j] + " > A[i] " + A[i]);
                }
            }
        }
        
        return max;
        
    }
	
	public static void main(String[] args) {
		int[] arr= {82, 63, 44, 74, 82, 99, 82};
		maxIndexDiff(arr, 7);
	}
	
	

}
