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
		
		
		double xdiff = (x3-x1)/2.0;
		double ydiff = (y3-y1)/2.0;
		double xmid = (x3+x1)/2.0;
		double ymid = (y3+y1)/2.0;
		double x2 = xmid+ydiff;
		double y2 = ymid-xdiff;
		double x4 = xmid-ydiff;
		double y4 = ymid+xdiff;
		StringBuilder ans = new StringBuilder();
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if ((circleY-i)*(circleY-i)+(circleX-j)*(circleX-j) <= r*r) {
					ans.append("#");
				} else {
					double or1 = (y2-y1)*(j-x2)-(i-y2)*(x2-x1);
					double or2 = (y3-y2)*(j-x3)-(i-y3)*(x3-x2);
					double or3 = (y4-y3)*(j-x4)-(i-y4)*(x4-x3);
					double or4 = (y1-y4)*(j-x1)-(i-y1)*(x1-x4);
					if ((or1>=0&&or2>=0&&or3>=0&&or4>=0)||(or1<=0&&or2<=0&&or3<=0&&or4<=0))
						ans.append("#");
					else
						ans.append(".");
				}
			}
			ans.append("\n");
		}
		System.out.println(ans);
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
