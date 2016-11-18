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
			  int[] arr = new int[n];
			  for(int i=0; i< n ; i++){
				  arr[i] = scan.nextInt();
			  }
			  System.out.println(subarrySum(arr,n,m));
		  }
		  
	    }

	private static int subarrySum(int[] arr,int n, int m) {
		int maxSum = 0;
		for(int subArrayCount = 1; subArrayCount<= n ; subArrayCount++){
			int sum = maxSum(arr,subArrayCount,m);
			if(sum > maxSum)
				maxSum = sum;
		}
		
		return maxSum;
	}

	private static int maxSum(int[] arr, int subArrayCount, int m) {
		int max = 0;
		for(int i=0; i< arr.length; i++){
			int value = 0;
			
			//add check point here
			for(int s=0,j=i,c=0; s < subArrayCount && (c <= (arr.length/subArrayCount)); s++,j++,c++){
				if(j < arr.length)
					value = value + arr[j];
				else
					break;
			}
			
			int sum = value % m;
			if(max < sum)
				max = sum;
		}
		return max;
	}

}
