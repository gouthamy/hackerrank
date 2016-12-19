package DataStructures.Arrays;

import java.util.Scanner;

/**
 * 
 * @author goutham
 *
 *
 *Given a  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.

Task 
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.

Input Format

There are  lines of input, where each line contains  space-separated integers describing 2D Array ; every value in  will be in the inclusive range of  to .

Constraints

Output Format

Print the largest (maximum) hourglass sum found in .

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
Explanation

 contains the following hourglasses:

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0
The hourglass with the maximum sum () is:

2 4 4
  2
1 2 4
 */
public class TwoDArrayDS {
	
	public static void main(String[] args){
		
		int[][] arr = new int[6][6];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<6;i++){
			for(int j=0;j<6;j++){
				arr[i][j] = scan.nextInt();
			}
		}
		int maxHourGlassSum = 0;
		for(int i=0; i <4;i++){
			for(int j=0;j<4;j++){
				int hourGlassSum = hourGlassSum(arr,i,j);
				if(maxHourGlassSum < hourGlassSum)
					maxHourGlassSum = hourGlassSum;
			}
		}
		System.out.println(maxHourGlassSum);
		
		
	}

	private static int hourGlassSum(int[][] arr,int i, int j) {
		// TODO Auto-generated method stub
		//System.out.printlnx("i" +i+" ,j"+j);
		int sum = 0;
		
		for(int y=j;y<(j+3);y++){
			sum += arr[i][y];
		}
		i++;
		sum+=arr[i][j+1];
		i++;
		for(int y=j;y<(j+3);y++){
			sum += arr[i][y];
		}
		/*for(int x=i;x<i+3;x++){
			for(int y=j;y<j+3;y++){
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}*/
		
		return sum;
	}

}
