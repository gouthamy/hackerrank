package datastructures.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author goutham
 * 
 * 
 You have an empty sequence, and you will be given  queries. Each query is one of these three types:

1 x  -Push the element x into the stack.
2    -Delete the element present at the top of the stack.
3    -Print the maximum element in the stack.
Input Format

The first line of input contains an integer, . The next  lines each contain an above mentioned query. (It is guaranteed that each query is valid.)

Constraints 



Output Format

For each type  query, print the maximum element in the stack on a new line.

Sample Input

10
1 97
2
1 20
2
1 26
1 20
2
3
1 91
3
Sample Output

26
91
 */
public class MaximumElement {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> track = new Stack<>();
		int value,max;
		for(int i=0 ; i< N ; i++){
			int query = scan.nextInt();
			if(query == 1){
				value = scan.nextInt();
				if(stack.empty()){
					stack.push(value);
					track.push(value);
				}else{
					stack.push(value);
					max = track.peek();
					if(max > value)
						track.push(max);
					else
						track.push(value);
				}
			}else if(query == 2){
				stack.pop();
				track.pop();
			}else if(query == 3){
				System.out.println(track.peek());
			}
		}
		scan.close();
	}

}
