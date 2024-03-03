package arrays;

import java.util.Arrays;

public class MaxAndSecondMax {
	
	public static void maxandsecondmax(int[] arr, int n) {
		Arrays.sort(arr);
		java.util.ArrayList<Integer> itr= new java.util.ArrayList<Integer>();
        itr.add(arr[n-1]);
        int k= n-2;
        while(arr[k] == arr[n-1]) {
        	k--;
        	if(k == -1)
        		break;
        }
        
        if(k == -1) {
    		itr.add(-1);
    		
    	} else {
    		itr.add(arr[k]);
    	}

        System.out.println(itr);
	}
	
	public static void main(String[] args) {
		int[] arr= {2,1,2};
		maxandsecondmax(arr, 3);
	}

}
