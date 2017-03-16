package HourRank18;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MaxMinDifferenceInanInterval {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int q = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        
	        LinkedList<Integer> listMaxMin = new LinkedList<>();
	        for(int i=0 ; i< n; i++){
	        	int min = a[i];
	        	int max = a[i];
	        	for(int j=i; j<n; j++){
	        		min = a[j] < min ? min : a[j];
	        		max = a[j] > max ? max : a[j];
	        		listMaxMin.add(max >= min ? max-min: min-max);
	        	}
	        	
	        }
	        System.out.println(listMaxMin);
	        
	        for(int a0 = 0; a0 < q; a0++){
	        	int count = 0;
	            int low = in.nextInt();
	            int high = in.nextInt();
	            // your code goes here
	            for(int i = low ; i <=high ; i++){
	            	count = Collections.frequency(listMaxMin, i);
	            }
	            System.out.println(count);
	        }
	    }

}
