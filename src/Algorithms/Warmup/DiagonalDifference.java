package Algorithms.Warmup;

import java.util.Scanner;

/**
 * 
 * @author goutham

Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is: 
11
      5
            -12

Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:
            4
      5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15
 */
public class DiagonalDifference {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int mat[][] = new int[size][size];
		for(int row=0;row<size;row++){
			for(int col=0;col<size;col++){
				mat[row][col]=scan.nextInt();
			}
		}
		int first_diagonal = 0;

		for(int r=0,c=0; r<size && c<size;){
			first_diagonal += mat[r][c];
			r++;
			c++;
		}
		int second_diagonal =0;
		for(int r=0,c=(size-1);r<size&&c<size;){
			second_diagonal +=mat[r][c];
			r++;
			c--;
		}
		int total = first_diagonal>second_diagonal?first_diagonal-second_diagonal:second_diagonal-first_diagonal;
		System.out.println(total);
		scan.close();

	}
}
