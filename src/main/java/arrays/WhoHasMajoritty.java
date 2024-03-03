package arrays;

public class WhoHasMajoritty {
	 static public int majorityWins(int arr[], int n, int x, int y) {
	        int a= 0, b= 0;
	        for(int i= 0; i<n; i++) {
	            if(arr[i] == x) {
	                a++;
	            } else if(arr[i] == y) {
	                b++;
	            }
	        }
	        System.out.println(a);
	        System.out.println(b);
	        if((a == 0 && b == 0) || (a == b)) {
	        	return Math.min(x, y);
	        }
	       
	     else if(a>b)
	    	return x;
	    else
	    	return y;
}
		public static void main(String[] args) {
			int[] arrIp= {40, 85, 9, 14, 53};
			System.out.println(majorityWins(arrIp, 5, 13, 32));
		}

}