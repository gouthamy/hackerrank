package Algorithms.Search;

import java.util.Scanner;


/**
 * 
 * @author goutham
 *
 *
 We define the following:

A subarray of an -element array, , is a contiguous subset of 's elements in the inclusive range from some index  to some index  where .
The sum of an array is the sum of its elements.
Given an -element array of integers, , and an integer, , determine the maximum value of the sum of any of its subarrays modulo . This means that you must find the sum of each subarray modulo , then print the maximum result of this modulo operation for any of the  possible subarrays.

Input Format

The first line contains an integer, , denoting the number of queries to perform. Each query is described over two lines:

The first line contains two space-separated integers describing the respective  (the array length) and  (the right operand for the modulo operations) values for the query.
The second line contains  space-separated integers describing the respective elements of array  for that query.
Constraints

 the sum of  over all test cases 
Output Format

For each query, print the maximum value of  on a new line.

Sample Input

1
5 7
3 3 9 9 5
Sample Output

6
Explanation

The subarrays of array  and their respective sums modulo  are ranked in order of length and sum in the following list:

 and  
 and  
 
 
 
 
 
 
As you can see, the maximum value for  for any subarray is , so we print  on a new line.
 */
public class MaximumSubarraySum {
	
	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		  
		  Scanner scan = new Scanner(System.in);
		  int quries = scan.nextInt();
		  for(int q =0 ; q<quries; q++){
			  int n = scan.nextInt();
			  int m = scan.nextInt();
			  long[] arr = new long[n];
			  for(int i=0; i< n ; i++){
				  arr[i] = scan.nextInt()%7;
			  }
			  System.out.println(subarrySum(arr,n,m));
		  }
		  
	    }
	
	  //3 3 9 9 5
	private static long subarrySum(long[] arr, int n, int m) {
	
		if(arr.length==0)throw new IllegalArgumentException("given array is empty");
		long maxSubArrayDivisble = arr[0];
		long currentMaxDivisble = arr[0];
		
		for(int i=0; i<n; i++){
			currentMaxDivisble = Math.max((currentMaxDivisble+arr[0])%7, arr[0]%7);
			maxSubArrayDivisble = Math.max(currentMaxDivisble, maxSubArrayDivisble);
		}
		return maxSubArrayDivisble;
	}

	
}
