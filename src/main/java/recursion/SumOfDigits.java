package recursion;

public class SumOfDigits {
	
	static int sum(int n) {
		if(n == 0)
			return 0;
		
		return sum(n/10)+ n % 10;
	}

	public static boolean  isIsogram(String str) {
		// ...
		for(int i= 0; i<str.length()-1; i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j))
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsogram("isIsogram"));
		System.out.println("a".length());
	}

}
