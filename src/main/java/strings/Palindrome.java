package strings;

public class Palindrome {
	
	public static boolean isPalindrome(String s) {
		StringBuilder rev= new StringBuilder(s);
		rev.reverse();
		return s.equals(rev.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("abcba"));
		
	}

}
