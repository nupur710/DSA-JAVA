package strings;

public class ReverseString {
	
	public static void reverse(String s) {
		String x= "";
		for(int i= s.length()-1; i>=0; i--) {
			x += s.charAt(i);
		}
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		reverse("abcdef");
		
	}

}
