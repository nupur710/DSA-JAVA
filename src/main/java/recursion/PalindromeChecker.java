package recursion;

public class PalindromeChecker {
	
	static boolean palindrome(String str, int start, int end) {
		if(start >= end)
			return true;
		return(str.charAt(start) == str.charAt(end) && palindrome(str, start+1, end-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindrome("abba", 3, 1));
	}

}
