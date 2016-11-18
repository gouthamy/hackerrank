package Algorithms.Warmup;

import java.util.Scanner;

/**
 * 
 * @author goutham
 *
 *
Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array.
A decimal representing of the fraction of negative numbers in the array.
A decimal representing of the fraction of zeroes in the array.
Sample Input

6
-4 3 -9 0 4 1         
Sample Output

0.500000
0.333333
0.166667
Explanation

There are  positive numbers,  negative numbers, and  zero in the array. 
The respective fractions of positive numbers, negative numbers and zeroes are ,  and , respectively.
 */
public class PlusMinus {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] ls = new int[size];
		for(int i=0;i<size;i++){
			ls[i]= scan.nextInt();
		}
		double p=0;
		double n=0;
		double z=0;
		int value;
		for(int i=0;i<size;i++){
			value = ls[i];
			z += value == 0 ? 1.0 : 0.0;
			p += value > 0 ? 1.0 : 0.0;
			n += value < 0 ? 1.0 : 0.0;
		} 

		System.out.println(p/size);
		System.out.println(n/size);
		System.out.println(z/size);
		scan.close();
	}

}
