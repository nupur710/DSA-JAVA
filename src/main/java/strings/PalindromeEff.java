package strings;

public class PalindromeEff {
	
	public static boolean isPalindrome(String s) {
		int n= s.length();
		int start= 0;
		int end= n-1;
		while(start < end) {
			if(!(s.charAt(start) == s.charAt(end))) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("abccba"));
	}

}
