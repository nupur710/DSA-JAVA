package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceParenthesis {

	public static boolean balanced(String str) {
		// TODO Auto-generated method stub
		
		Deque<Character> s= new ArrayDeque<Character>();
		for(int i= 0; i<str.length(); i++) {
			char x= str.charAt(i);
			if(x == '(' || x == '[' || x == '{')
				s.push(x);
			else {
				if(s.isEmpty()==true)
					return false;
				if(match(s.pop(), x) == false)
					return false;
				else
					return true;
			}
		}
		return (s.isEmpty() == true);

	}
	
	public static boolean match(char a, char b) {
		return ((a == '(' && b == ')') || (a== '{' && b == '}') || (a == '[' && b == ']'));
	}
	
	public static void main(String[] args) {
		System.out.println(balanced("(({}[]))"));
	}

}
