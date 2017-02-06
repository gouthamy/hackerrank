package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixLayerRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		int R = scan.nextInt();
		
		int[][] matrix =  populateMatrix(scan, new int[M][N]);

		int[][] rotatedMatrix = rotateMatrix(matrix,R);
		displayMatrix(rotatedMatrix);
	}

	private static void displayMatrix(int[][] matrix) {
		for(int row=0 ; row < matrix.length; row++){
			for(int col=0; col < matrix[0].length; col++){
				System.out.print(matrix[row][col]+" ");
			}
			System.out.println();
		}		
	}

	private static int[][] rotateMatrix(int[][] matrix, int r) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		int rw = 0;
		for(int row=0,col=0; row<matrix.length;col++,row++){
			list1.add(matrix[rw][col]);
		}
		int cl=3;
		for(int row=1,col=1; col<matrix[0].length;col++,row++){
			list1.add(matrix[row][cl]);
		}
		rw=3;
		for(int row=1,col=2;row<matrix.length;row++,col--){
			list1.add(matrix[rw][col]);
		}
		list1.add(matrix[2][0]);
		list1.add(matrix[1][0]);
		System.out.println(list1);
		return matrix;
	}

	private static int[][] populateMatrix(Scanner scan, int[][] matrix) {
		for(int row=0 ; row < matrix.length; row++){
			for(int col=0; col < matrix[0].length; col++){
				matrix[row][col] = scan.nextInt();
			}
		}
		return matrix;
	}

}
/**
 *  a[0,0] a[0,1] a[0,2] a[0,3]
 *  a[1,0] a[1,1] a[1,2] a[1,3]
 *  a[2,0] a[2,1] a[2,2] a[2,3]
 *  a[3,0] a[3,1] a[3,2] a[3,3]
 *  
 *  for one rotatiom
 *  temp = a[0,0]
 *  a[0,0] = a[0,1]
 *  a[0,1] = a[0,2]
 *  a[0,2] = a[0,3]
 *  
 *  a[0,3] = a[1,3]
 *  a[1,3] = a[2,3]
 *  a[2,3] = a[3,3]
 *  
 *  a[3,3] = a[3,2]
 */

