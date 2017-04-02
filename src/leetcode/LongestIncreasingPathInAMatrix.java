package leetcode;

import java.util.Arrays;

public class LongestIncreasingPathInAMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] temp = new int[9];
		System.out.println(Arrays.toString(temp));
	}


	public int longestIncreasingPath(int[][] matrix) {

		int longestPath = 0;
		
		int[][] memo = new int[matrix.length][matrix[0].length];
		
		for(int row = 0; row < matrix.length; row++){
			for(int col = 0; col < matrix[row].length; col++){
				memo[row][col] = longestPathIncremental(matrix, memo, row, col);
				longestPath = Math.max(longestPath, memo[row][col]);
			}
		}
		
		
		return longestPath;
	}


	private int longestPathIncremental(int[][] matrix, int[][] memo, int row, int col) {
		//Valiadtion to check boundarys
		if(inSideMatrix(matrix, row, col)){
			return 0;
		}
		if(memo[row][col] != -1){
			return memo[row][col];
		}
		int path = 1;
		int r = row - 1;
		int c = col - 1;
		for(; r <= row + 1; r++){
			for(; c <= col + 1;c++){
				if(r == row && c == col)
					continue;
				//check not a diagonal
				if(r == row - 1 && c == col - 1)
					continue;
				if(r == row + 1 && c == col + 1)
					continue;
				if(inSideMatrix(matrix, r ,c))
					return 0;
				if(matrix[row][col] < matrix[r][c]){
					memo[row][col] += longestPathIncremental(matrix, memo, r, c);
				}
			}
		}
		return memo[row][col];
	}


	private boolean inSideMatrix(int[][] matrix, int row, int col) {
		//Boundary checks
		if(row < 0 || col < 0)
			return false;
		if(row <= matrix.length || col <= matrix[row].length)
			return false;
		return true;
	}

}
