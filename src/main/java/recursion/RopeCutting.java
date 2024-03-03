package recursion;

public class RopeCutting {
	
	public static int noOfPieces(int n, int a, int b, int c) {
		if(n == 0) return 0;
		if(n <= -1) return -1;
		
		int result= Math.max(noOfPieces(n-a, a, b, c), Math.max(noOfPieces(n-b, a, b, c), noOfPieces(n-c, a, b, c)));
		
		if(result == -1)
			return -1;

		return result+1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(noOfPieces(11, 11, 9, 12));
	}

}
