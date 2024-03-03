package recursion;

public class DecimalToBinaryConversion {
	
	public static void decimalToBinary(int n) {
		int remainder= 0;
		String toRemainder= "";
		String finalValue= "";
		while(n > 0) {
			remainder= n % 2;
			toRemainder= Integer.toString(remainder);
			finalValue += toRemainder;
			n= n/2;
		}
		System.out.println(finalValue);
		int toInteger= Integer.parseInt(finalValue);
		int req= 0;
		while(toInteger > 0) {
			req = req * 10 + (toInteger % 2);
			toInteger= toInteger/10;
		}
		System.out.println("final value is " +req);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decimalToBinary(7);
	}

}
