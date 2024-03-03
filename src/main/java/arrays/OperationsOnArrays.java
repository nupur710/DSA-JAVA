package arrays;

public class OperationsOnArrays {
	
	public static int[] insert(int arr[], int n, int cap, int x, int pos) {
		if(n == cap)
			return arr;
		int index= pos - 1;
	//	System.out.println(index + "is value of index");
		for(int i= n - 1; i>= index; i--)
			arr[i+1]= arr[i];
		arr[index]= pos;
		
		for(int i= 0; i<= cap; i++)
			System.out.println(arr[i]);
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= new int[6];
		array[0]= 5;
		array[1]= 7;
		array[2]= 10;
		array[3]= 20;
		int n= 4;
		int cap= 6;
		int x= 3;
		int pos= 2;
		insert(array, n, cap, x, pos);
	}

}
