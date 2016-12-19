package Algorithms.DynamicProgramming;

import java.util.Scanner;


/**
 * 
 * @author goutham
 * 
 * 
Given an array  of  elements, find the maximum possible sum of a

Contiguous subarray
Non-contiguous (not necessarily contiguous) subarray.
Empty subarrays/subsequences should not be considered.

Input Format

First line of the input has an integer .  cases follow. 
Each test case begins with an integer . In the next line,  integers follow representing the elements of array .

Constraints

The subarray and subsequences you consider should have at least one element.

Output Format

Two, space separated, integers denoting the maximum contiguous and non-contiguous subarray. At least one integer should be selected and put into the subarrays (this may be required in cases where all elements are negative).

Sample Input

2 
4 
1 2 3 4
6
2 -1 2 3 4 -5
Sample Output

10 10
10 11
Explanation

In the first case: 
The max sum for both contiguous and non-contiguous elements is the sum of ALL the elements (as they are all positive).

In the second case: 
[2 -1 2 3 4] --> This forms the contiguous sub-array with the maximum sum. 
For the max sum of a not-necessarily-contiguous group of elements, simply add all the positive elements.
 *
 */
public class TheMaximumSubarray {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for(int i=0; i <q ;i++){
			int N = scan.nextInt();
			int[] arr = new int[N];
			for(int index = 0 ; index < N ; index++){
				arr[index] = scan.nextInt();
			}
			printSubMaxArray(arr,N);
		}
	}

	//{2,-1,2,3,4,-5}
	//{-10,10}
	//Kaden's Algorithm
	private static void printSubMaxArray(int[] arr, int n) {
		int contiguousSum = arr[0];
		int maxSum = arr[0];
		int NonContiguousSum = arr[0];
		int NonMaxSum =  arr[0];
		for(int i=1 ; i<n ;i++){
			NonContiguousSum = max(NonContiguousSum,NonContiguousSum+arr[i]);
			NonMaxSum = max(NonMaxSum,NonContiguousSum);
			contiguousSum = max(arr[i],contiguousSum+arr[i]);
			maxSum = max(maxSum,contiguousSum);
		}
		System.out.println(maxSum+" "+NonMaxSum);
		
	}
	
	private static int max(int m, int n){
		return m>n?m:n;
	}

}
