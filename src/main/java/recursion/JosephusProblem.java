package recursion;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JosephusProblem {
	
	public static int josephus(int n, int k) {
		if(n == 1) {
			return 0;
		}
        return (josephus(n-1, k) + k) % n;
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(josephus(5, 3));
	}

}
