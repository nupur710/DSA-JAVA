package recursion;

public class TowerOfHanoi {
	
    static void ToH(int n, String S, String H, String D) 
    { 
        if (n == 1) 
        { 
            System.out.println("Move 1 from " +  S + " to " + D);  
            return; 
        } 
        ToH(n-1, S, D, H); 
        System.out.println("Move " + n + " from " +  S + " to " + D); 
        ToH(n-1, H, S, D); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3; 
        ToH(n, "S", "H", "D");  

	}

}
