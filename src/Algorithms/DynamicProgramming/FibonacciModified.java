package Algorithms.DynamicProgramming;

import java.math.BigInteger;
import java.util.Scanner;



/**
 * 
 * @author goutham
 *
 *
 We define a modified Fibonacci sequence using the following definition:

Given terms  and  where , term  is computed using the following relation:
For example, if term  and , term , term , term , and so on.

Given three integers, , , and , compute and print term  of a modified Fibonacci sequence.

Note: The value of  may far exceed the range of a -bit integer. Many submission languages have libraries that can handle such large results but, for those that don't (e.g., C++), you will need to be more creative in your solution to compensate for the limitations of your chosen submission language.

Input Format

A single line of three space-separated integers describing the respective values of , , and .

Constraints

 may far exceed the range of a -bit integer.
Output Format

Print a single integer denoting the value of term  in the modified Fibonacci sequence where the first two terms are  and .

Sample Input

0 1 5
Sample Output

5
Explanation

The first two terms of the sequence are  and , which gives us a modified Fibonacci sequence of . Because , we print term , which is .
 */
public class FibonacciModified {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		BigInteger t1 = scan.nextBigInteger();
		BigInteger t2 = scan.nextBigInteger();
		int n = scan.nextInt();
		BigInteger tn = new BigInteger(0+"");
		
		for(int i=2;i<=n-1;i++){
			tn = t1.add(t2.pow(2));
			t1 = t2;
			t2 = tn;
		}
		System.out.println(tn.toString());
		
	}
}
