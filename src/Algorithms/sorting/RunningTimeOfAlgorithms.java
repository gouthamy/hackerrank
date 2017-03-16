package Algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class RunningTimeOfAlgorithms {

	/**
	 * @param args
	 */
	private static int swap_count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		
		for(int index = 0; index < N; index++){
			arr[index] =  scan.nextInt();
		}
		
		insertionSort(arr);

		System.out.println(swap_count);
	}

	
	//5 3 6 1 2

	private static void insertionSort(int[] arr) {

		for(int index=1; index < arr.length; index++){
			if(arr[index-1] > arr[index]){
				int j = index-1;
				while(j>=0 && arr[j] > arr[j+1]){
					swap(arr, j, j+1);
					j--;
				}
			}
		}
		
		return;
	}
	
	private static void swap(int arr[], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		swap_count++;
	}
	

}
