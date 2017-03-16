package Algorithms.sorting;

import java.util.Arrays;

public class MergeSort {

	private static int[] tempMergArr;


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{6,5,3,7,8,9};
		tempMergArr = new int[arr.length];
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void mergeSort(int arr[], int low, int high){
		if(low < high){
			
			int mid = (low + high)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			
			merge(arr,low, mid, high);
		}
	}


	private static void merge(int arr[], int lowerIndex, int middle, int higherIndex) {
		System.out.println("low : "+arr[lowerIndex]+" mid: "+arr[middle]+" high: "+arr[higherIndex]);
		 for (int i = lowerIndex; i <= higherIndex; i++) {
	            tempMergArr[i] = arr[i];
	        }
		 Arrays.sort(arr);
	        int i = lowerIndex;
	        int j = middle + 1;
	        int k = lowerIndex;
	        while (i <= middle && j <= higherIndex) {
	            if (tempMergArr[i] <= tempMergArr[j]) {
	                arr[k] = tempMergArr[i];
	                i++;
	            } else {
	                arr[k] = tempMergArr[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= middle) {
	            arr[k] = tempMergArr[i];
	            k++;
	            i++;
	        }
	 
	}

}
