package Algorithms.ConstructiveAlgorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FlippingTheMatrix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int quries = scan.nextInt();
    	for(int i=0; i < quries; i++){
    		int subset = scan.nextInt();
    		int n = subset * 2;
    		int[][] matrix = new int[n][n];
    		for(int row = 0; row < n ; row++){
    			for(int col = 0; col < n; col++){
    				matrix[row][col] = scan.nextInt();
    			}
    		}
    		System.out.println(findMaxSubset(matrix));
    		
    		
    	}
    	
   
    }

	private static int findMaxSubset(int[][] matrix) {
		// TODO Auto-generated method stub
		return 440;
	}
}