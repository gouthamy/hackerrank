package Algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortPart1 {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int[] ar = new int[s];
	        for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	        }
	        insertIntoSorted(ar);
	    }
	    
	    
	    private static void printArray(int[] ar) {
	        for(int n: ar){
	            System.out.print(n+" ");
	        }
	        System.out.println("");
	    }

	/**
	 * @param args
	 */
	public static void insertIntoSorted(int[] arr) {
		// TODO Auto-generated method stub
		
		//insertion sort
		//2 4 6 8 3
		for(int i=1; i< arr.length; i++){
			
			if(arr[i-1] > arr[i]){
				int swap = arr[i];
				for(int j = i-1; j >= -1 ; j--){
					
					if(j>=0 && arr[j] > swap){
						arr[j+1] = arr[j];
						printArray(arr);
					}else{
						arr[j+1] = swap;
						printArray(arr);
						break;
					}
				}
				
			}
			
		}

	}

}
