package strings;

public class StringIsSubsequence {
	
	public static boolean isSubsequence(String s1, String s2) {
		char[] c1= s1.toCharArray();
		char[] c2= s2.toCharArray();
		int count= c2.length;
		if(count == 0) {
			return true;
		}
		
		int j= 0;
		for(int i= 0; i<c1.length; i++) {
			if(c1[i] == c2[j]) {
				System.out.println("comparing " + c1[i] + " and " + c2[j]);
				System.out.println("value of j is " + j);
				System.out.println("value of i is " + i);
				j++;
				if(j == count) {
					return true;
				}
			}
		}
		
			return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isSubsequence("ahbgdc", ""));
	}

}
