package crackingTheCodingInterview;

import java.util.Scanner;

public class SortingBubbleSort {

	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in);){
			int n = in.nextInt();
			int a[] = new int[n];
			for(int a_i=0; a_i < n; a_i++){
				a[a_i] = in.nextInt();
			}
			boolean isSorted = false;
			int swap_count = 0;
			for(int outer_index = 0; outer_index < n && !isSorted; outer_index++){
				isSorted = true;
				for(int inner_index = 1; inner_index < n - outer_index ; inner_index++){
					if(a[inner_index - 1] > a[inner_index]){
						a[inner_index] = a[inner_index] + a[inner_index - 1];
						a[inner_index - 1] = a[inner_index] - a[inner_index - 1];
						a[inner_index] = a[inner_index] - a[inner_index - 1];
						swap_count++;
						isSorted = false;
					}
				}
			}
			System.out.println("Array is sorted in "+swap_count +" swaps.");
			System.out.println("First Element: "+a[0]);
			System.out.println("Last Element: "+a[n-1]);
		}
	}

}
