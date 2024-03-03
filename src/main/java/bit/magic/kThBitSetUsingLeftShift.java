package bit.magic;

public class kThBitSetUsingLeftShift {
	
	static void kThBit(int n, int k) {
		
		if((n & (1<<(k-1))) != 0)
			System.out.println("yes");
		else
			System.out.println("no");
			

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kThBit(7, 3);
	}

}
