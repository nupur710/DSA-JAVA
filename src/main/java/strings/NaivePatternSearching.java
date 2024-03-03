package strings;

public class NaivePatternSearching {
	
	public static void pattern(String txt, String pat) {
		String b= "";
	    int m=pat.length();
	    int n=txt.length();
	    for(int i=0;i<=(n-m);i++){
	        int j;
	        for(j=0;j<m;j++)
	        if(pat.charAt(j)!=txt.charAt(i+j))
	        break;
	        
	       // if(j==m)
	        
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "ABCABCD";String pat="ABCD";
    //    System.out.print("All index numbers where pattern found: ");
        pattern(txt,pat);  
	}

}
