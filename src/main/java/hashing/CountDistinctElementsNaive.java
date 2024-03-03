package hashing;

public class CountDistinctElementsNaive {
	
	public static void countDistinctElements(int[] arr) {
		int count= 0;
		for(int i= 0; i<arr.length; i++) {
			boolean flag= false;
			for(int j= 0; j<i; j++) {
				if(arr[i] == arr[j]) {
					flag= true;
					
				    break;
				}
			}
			if(flag == false)
				count++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		int[] arr= {15,12,13,13,13,18};
		countDistinctElements(arr);
	}

}
