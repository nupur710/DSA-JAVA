package mathematics;

public class FloodFill {
	
	public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
		
		int checkColor= image[sr][sc];
		image[sr][sc]= color;
		
		if(image[sr-1][sc] == checkColor)
			image[sr-1][sc]= color;
		if(image[sr][sc-1] == checkColor)
			image[sr][sc-1] = color;
		if(image[sr+1][sc] == checkColor)
			image[sr+1][sc]= color;
		if(image[sr][sc+1] == checkColor)
			image[sr][sc+1] = color;
		
		
		
		
		
//		if(image[sr-1][sc]== checkColor || image[sr][sc-1]== checkColor || image[sr+1][sc]== checkColor || image[sr][sc+1] == checkColor)
//		int[][] ans= floodFill(image, sr, sc, checkColor);
		
		
		image[sr][sc]= image[sr-1][sc]; 
		
		if(image[sr-1][sc]== checkColor || image[sr][sc-1]== checkColor || image[sr+1][sc]== checkColor || image[sr][sc+1] == checkColor)
		{
			System.out.println("entering recursive function");
			image= floodFill(image, sr, sc, checkColor);
		}
		
			
		for(int i= 0; i<image.length; i++) {
			for(int j= 0; j<image[i].length; j++) {
				System.out.println(image[i][j] + " ");
			}
			System.out.println();
		}
		return image;
		
		//return ans;
		
		
			

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
		floodFill(array, 1, 1, 2);
//		for(int i= 0; i<array.length; i++) {
//			for(int j= 0; j<array[i].length; j++) {
//				System.out.println(array[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

}
