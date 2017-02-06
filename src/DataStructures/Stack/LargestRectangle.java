package DataStructures.Stack;

import java.util.Scanner;
import java.util.Stack;


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
		/*Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for(int i=0;  i<N; i++){
			arr[i] = scan.nextInt();
		}*/
		int[] arr = {2,4,5,6,7};
		System.out.println(getLargestRectangle(arr));
	}

	private static int getLargestRectangle(int[] height) {
		// TODO Auto-generated method stub
		if (height == null || height.length == 0) {
			return 0;
		}
	 
		Stack<Integer> stack = new Stack<Integer>();
	 
		int max = 0;
		int i = 0;
	 //1,2,3,2,1
		while (i < height.length) {
			//push index to stack when the current height is larger than the previous one
			if (stack.isEmpty() || height[i] >= height[stack.peek()]) {
				stack.push(i);
				i++;
			} else {
			//calculate max value when the current height is less than the previous one
				int p = stack.pop();
				int h = height[p];
				int w = stack.isEmpty() ? i : i - stack.peek() - 1;
				max = Math.max(h * w, max);
			}
	 
		}
	 
		while (!stack.isEmpty()) {
			int p = stack.pop();
			int h = height[p];
			int w = stack.isEmpty() ? i : i - stack.peek() - 1;
			max = Math.max(h * w, max);
		}
	 
		return max;
		
	}

}
