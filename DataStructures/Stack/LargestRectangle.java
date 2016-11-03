package datastructures.stack;

import java.util.Scanner;


/**
 * 
 * @author goutham
 *
 *
There are  buildings in a certain two-dimensional landscape. Each building has a height given by . If you join  adjacent buildings, they will form a solid rectangle of area .

Given  buildings, find the greatest such solid area formed by consecutive buildings.

Input Format 
The first line contains , the number of buildings altogether. 
The second line contains  space-separated integers, each representing the height of a building.

Constraints 
 

Output Format 
One integer representing the maximum area of rectangle formed.

Sample Input

5
1 2 3 4 5
Sample Output

9
Explanation 
An illustration of the test case follows. drawing47.svg
 */
public class LargestRectangle {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for(int i=0;  i<N; i++){
			arr[i] = scan.nextInt();
		}
	}

}
