package bit.magic;

public class kThBitSetUsingRightShift {
	
	static void kThBitSet(int n, int k) {
		if(((n>>(k-1)) & 1) == 1)     //rightward shifting kth bit of n to lsb place and performing bitwise and with 1
			System.out.println("yes");
		else
			System.out.println("no");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kThBitSet(13, 3);

	}

}
