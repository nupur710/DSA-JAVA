package arrays;

public class InsertAtGivenIndex {
	
	   static void insertAtIndex(int arr[], int sizeOfArray, int index, int element)
	    {
		   
	      for(int l=sizeOfArray-2; l>=index; l--) {
	    	  System.out.println(l);
	    	  arr[l+1]= arr[l];
	      }
	       arr[index] = element;
	       
	       for(int i= 0; i<arr.length; i++) {
	    	   System.out.println(arr[i]);
	       }
	    }
	   
	   public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,0};
		insertAtIndex(arr, 6, 5, 90);
	}
	   

}
