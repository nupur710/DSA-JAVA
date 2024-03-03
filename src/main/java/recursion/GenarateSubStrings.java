package recursion;

public class GenarateSubStrings {
	
	public static void subString(String s, String curr, int i) {
		if(i == s.length()) {
			System.out.println(curr);
		    return;
		}
		subString(s, curr, i+1);
		subString(s, curr+s.charAt(i), i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subString("hi", "", 0);
		String a= "hi";
		System.out.println(a.length() + " is ");
	}

}
