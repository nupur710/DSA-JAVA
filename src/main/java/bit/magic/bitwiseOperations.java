package bit.magic;

public class bitwiseOperations {
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int x= 3, y= 6;
		System.out.println("Bitwise AND " + (x&y));
		System.out.println("Bitwise OR " + (x|y));
		System.out.println("Bitwise XOR " + (x^y));
		System.out.println("Bitwise NOT " + (~5));
		System.out.println("Bitwise NOT of x " + (~x));
		System.out.println("Left shift " + (2<<2));
		System.out.println("Unsigned Right shift " + (-2>>>1));
		System.out.println("Signed Right shift " + (-2>>1));
		
	}
}
