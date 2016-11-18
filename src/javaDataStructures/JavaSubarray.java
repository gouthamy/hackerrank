package javaDataStructures;

import java.util.Scanner;

/**
 * 
 * @author gyenuganti
 *
 *
 We define the following:

A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, , denoting the length of array . 
The second line contains  space-separated integers describing each respective element, , in array .

Constraints

Output Format

Print the number of subarrays of  having negative sums.

Sample Input

5
1 -2 4 -5 1
Sample Output

9
Explanation

There are nine negative subarrays of :

Thus, we print  on a new line.

// {3,-4,3,5,-9,9,-8}
 */
public class JavaSubarray {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = scan.nextInt();
		}
		
		//Kaden's algorithm
		int noOfNegative = arr[0]<0?1:0;
		int subArr = arr[0];
		int maxSubArr = arr[0];
		for(int i=1;i<N;i++){
			subArr = min(arr[i],subArr+arr[i]);
			if(subArr < 0 ){
				noOfNegative++;
			}
		}
		System.out.println(noOfNegative);
		
	}
	
	public static int min(int i, int j){
		return i>j?j:i;
	}

}
