package Algorithms.sorting;

import java.util.Scanner;

public class QuicksortSorting2 {

	static void quickSort(int[] ar) {


		sort(ar, 0, ar.length-1);
	}   

	private static void sort(int[] ar, int left, int right) {

		if(left < right){
			int pivot = ar[(right+left)/2];
			int index = parition(ar, left, right, pivot);
			
			sort(ar, left, index);
			printArray(ar, left, index-1);
			sort(ar, index+1, right);
			printArray(ar, index, right);
			
		}
	}

	private static int parition(int[] ar, int left, int right, int pivot) {
		/*int mid = (left + right)/2;
		int temp = ar[mid];
		ar[mid] = pivot;
		ar[left] = temp;*/
		
		
		while(left <= right){
			while(ar[left] < pivot){
				left++;
			}
			while(ar[right] > pivot){
				right--;
			}
			
			if(left <= right){
				int temp = ar[left];
				ar[left] = ar[right];
				ar[right] = temp;
				left++;
				right--;
			}
			
		}
		
		return left;
	}

	static void printArray(int[] ar, int start, int end) {
		for(int i = start; i<= end; i++){
			System.out.print(ar[i]+" ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++){
			ar[i]=in.nextInt(); 
		}
		quickSort(ar);
	}    
}