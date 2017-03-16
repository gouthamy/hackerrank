package Algorithms.sorting;

import java.util.Scanner;

public class InsertionSortPart2 {

	/**
	 * @param args
	 */
	
	//1 4 3 5 6 2 

	public static void insertionSortPart2(int[] arr) {
		// TODO Auto-generated method stub
		for(int index = 1; index < arr.length; index++){
		
			if(arr[index-1] > arr[index]){
				for(int j = index-1; j >=0 ; j--){
					if(arr[j] > arr[j+1]){
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			printArray(arr);
		}
	}

	 public static void insertionSort(int[] A){
	        for(int i = 1; i < A.length; i++){
	            int value = A[i];
	            int j = i - 1;
	            while(j > 0 && A[j] > value){
	                A[j + 1] = A[j];
	                j = j - 1;
	            }
	            A[j + 1] = value;
	        }

	        printArray(A);
	    }


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for(int i=0;i<s;i++){
			ar[i]=in.nextInt(); 
		}
		insertionSort(ar);    

	}    
	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}
}
