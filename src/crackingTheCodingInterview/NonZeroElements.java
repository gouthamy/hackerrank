package crackingTheCodingInterview;

import java.util.Arrays;


/**
 * 
 * @author gyenuganti
 *Write an algorithm that brings all nonzero elements to the left of the array, and returns the number of nonzero elements. 

The algorithm should operate in place, i.e. shouldn't create a new array. 

The order of the nonzero elements does not matter. The numbers that remain in the right portion of the array can be anything. 

Example: 
given the array [ 1, 0, 2, 0, 0, 3, 4 ], 
a possible answer is [ 4, 1, 3, 2, ?, ?, ? ], 4 non-zero elements, where "?" can be any number. 

Code should have good complexity and minimize the number of writes to the array.
 */
public class NonZeroElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{ 1, 0, 2, 0, 0, 3, 4};
		System.out.println(Arrays.toString(arr));
		//Using selection sort technique
		
		int lastIndex = arr.length - 1;
		for(int index = 0; index < arr.length;){
			if(index == lastIndex)break;
			if(arr[index] == 0){
				//swap to last index
				int temp = arr[lastIndex];
				arr[lastIndex] = arr[index];
				arr[index] = temp;
				lastIndex--;
			}else{
				index++;
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
