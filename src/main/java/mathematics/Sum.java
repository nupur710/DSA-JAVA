package mathematics;

public class Sum {
	
	public static int findSum(int n) {
		int remainder= n % 9;
		if(remainder == 0) {
			return 9;
		}
		//System.out.println(remainder);
		switch(remainder) {
		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			return 3;
		case 4:
			return 4;
		case 5:
			return 5;
		case 6:
			return 6;
		case 7:
			return 7;
		case 8:
			return 8;
			default:
				return 0;
		}
			
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findSum(9));
	}

}
