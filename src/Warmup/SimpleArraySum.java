package Algorithms.Warmup;

import java.util.Scanner;

/**
 * 
 * @author goutham
 *
 *
Given an array of  integers, can you find the sum of its elements?

Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers representing the array's elements.

Output Format

Print the sum of the array's elements as a single integer.

Sample Input

6
1 2 3 4 10 11
Sample Output

31
Explanation

We print the sum of the array's elements, which is: .
 */
public class SimpleArraySum {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int sum = 0;
        for(int arr_i = 0; arr_i < arr.length; arr_i++){
            sum += arr[arr_i];
        }
        System.out.println(sum);
        in.close();
    }
}
