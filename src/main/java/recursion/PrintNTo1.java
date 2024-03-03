package recursion;

public class PrintNTo1 {
	
	public static int printNto1(int n) {
		if(n == 0)
			return -1;
		System.out.println(n);
		printNto1(n-1);
		return n;
	}
	
	public static void main(String[] args) {
		printNto1(4);
	}
}