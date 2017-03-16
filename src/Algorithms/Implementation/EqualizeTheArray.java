package Algorithms.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class EqualizeTheArray {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] table = new int[101];
	        for(int i = 0; i < n; i++){
	            table[sc.nextInt()]++;
	        }
	        Arrays.sort(table);
	        System.out.print(n-table[100]);
		 
	 }

}
