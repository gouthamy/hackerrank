package Matrix;

import java.util.Arrays;

public class MatrixRotation {

	public static void main(String[] args){
		int[][] mat = {};
		System.out.println(mat[0][0]);

		int[][] matrix = new int[4][4];
		
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[0][3] = 4;

		matrix[1][0] = 5;
		matrix[1][1] = 6;
		matrix[1][2] = 7;
		matrix[1][3] = 8;
		
		matrix[2][0] = 9;
		matrix[2][1] = 10;
		matrix[2][2] = 11;
		matrix[2][3] = 12;
		
		matrix[3][0] = 13;
		matrix[3][1] = 14;
		matrix[3][2] = 15;
		matrix[3][3] = 16;
		
		System.out.println(Arrays.deepToString(matrix));

	}
}
