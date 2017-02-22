package WeekOfCode29;

import java.util.Arrays;
import java.util.Scanner;

public class ACircleAndSquare {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int w = in.nextInt();
	        int h = in.nextInt();
	        int circleX = in.nextInt();
	        int circleY = in.nextInt();
	        int r = in.nextInt();
	        int x1 = in.nextInt();
	        int y1 = in.nextInt();
	        int x3 = in.nextInt();
	        int y3 = in.nextInt();
	        
	        char[][] matrix = new char[h][w];

	        
	        fillCircle(matrix,circleX,circleY,r);
	        for(int i=0;i<h;i++){
	        	for(int j=0;j<w;j++){
	        		System.out.print(matrix[i][j]);
	        	}
	        	System.out.println();
	        }
	        
	        
	        
	        // your code goes here
	    }
	

	private static void fillCircle(char[][] matrix, int x0, int y0, int r) {
			int x = r;
		    int y = 0;
		    int xChange = 1 - (r << 1);
		    int yChange = 0;
		    int radiusError = 0;

		    while (x >= y)
		    {
		        for (int i = x0 - x; i <= x0 + x; i++)
		        {
		            SetPixel(matrix,i, y0 + y);
		            SetPixel(matrix,i, y0 - y);
		        }
		        for (int i = x0 - y; i <= x0 + y; i++)
		        {
		            SetPixel(matrix,i, y0 + x);
		            SetPixel(matrix,i, y0 - x);
		        }

		        y++;
		        radiusError += yChange;
		        yChange += 2;
		        if (((radiusError << 1) + xChange) > 0)
		        {
		            x--;
		            radiusError += xChange;
		            xChange += 2;
		        }
		    
	     }
	}


	private static void SetPixel(char[][] matrix, int i, int j) {
		// TODO Auto-generated method stub
		matrix[i][j]='#';
	}
}
