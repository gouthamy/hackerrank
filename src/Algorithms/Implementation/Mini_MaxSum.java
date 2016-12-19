package Algorithms.Implementation;

import java.util.Scanner;


/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format

A single line of five space-separated integers.

Constraints

Each integer is in the inclusive range .
Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

Our initial numbers are , , , , and . We can calculate the following sums using four of the five integers:

If we sum everything except , our sum is .
If we sum everything except , our sum is .
If we sum everything except , our sum is .
If we sum everything except , our sum is .
If we sum everything except , our sum is .
As you can see, the minimal sum is  and the maximal sum is . Thus, we print these minimal and maximal sums as two space-separated integers on a new line.

Hints: Beware of integer overflow! Use 64-bit Integer.

Need help to get started? Try the Solve Me First problem
 * @author gyenuganti
 *
 */
public class Mini_MaxSum {
	public static void main(String[] args){
		long[] arr = new long[5];
		Scanner scan = new Scanner(System.in);
		long minElement = Long.MAX_VALUE;
		long maxElement = Long.MIN_VALUE;
		long sum = 0;
		for(int index=0; index < 5; index++){
			long element = scan.nextLong();
			sum += element;
			minElement = Math.min(element,minElement);
			minElement = Math.max(element,maxElement);
		}
		System.out.println((sum - maxElement)+" "+(sum - minElement));
	}

}
