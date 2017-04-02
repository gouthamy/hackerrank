package crackingTheCodingInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindPos { 

	public static List<Integer> findPositions(int[] arr, int m) { 
		if (arr == null || arr.length == 0 || m == 0) { 
			return Collections.emptyList(); 
		} 
		int l = 0; 
		int r = findInitInterval(arr, m); 

		int bestL = 0; 
		int bestR = r; 
		while (r < arr.length) { 
			l = findNextZero(arr, l) + 1; 
			r = findNextZero(arr, r + 1); 
			if ((r - l) > (bestR - bestL)) { 
				bestL = l; 
				bestR = r; 
			} 
		} 

		return findZeros(arr, bestL, bestR); 
	} 

	private static int findInitInterval(int[] arr, int m) { 
		int remained = m; 
		for (int i = 0; i < arr.length; i++) { 
			if (arr[i] == 0) { 
				remained--; 
				if (remained < 0) { 
					return i; 
				} 
			} 
		} 

		return arr.length; 
	} 

	private static int findNextZero(int[] arr, int l) { 
		for (int i = l; i < arr.length; i++) { 
			if (arr[i] == 0) { 
				return i; 
			} 
		} 
		return arr.length; 
	} 

	private static List<Integer> findZeros(int[] arr, int l, int r) { 
		List<Integer> found = new ArrayList<Integer>(); 
		for (int i = l; i < r; i++) { 
			if (arr[i] == 0) { 
				found.add(i); 
			} 
		} 
		return found; 
	} 
	static void findZeroes(int arr[], int n, int m)
	{
	    // Left and right indexes of current window
	    int wL = 0, wR = 0; 
	 
	    // Left index and size of the widest window 
	    int bestL = 0, bestWindow = 0; 
	 
	    // Count of zeroes in current window
	    int zeroCount = 0; 
	 
	    // While right boundary of current window doesn't cross 
	    // right end
	    while (wR < n)
	    {
	        // If zero count of current window is less than m,
	        // widen the window toward right
	        if (zeroCount <= m)
	        {
	            if (arr[wR] == 0)
	              zeroCount++;
	            wR++;
	        }
	 
	        // If zero count of current window is more than m,
	        // reduce the window from left
	        if (zeroCount > m)
	        {
	            if (arr[wL] == 0)
	              zeroCount--;
	            wL++;
	        }
	 
	        // Updqate widest window if this window size is more
	        if (wR-wL > bestWindow)
	        {
	            bestWindow = wR-wL;
	            bestL = wL;
	        }
	    }
	 
	    // Print positions of zeroes in the widest window
	    for (int i=0; i<bestWindow; i++)
	    {
	        if (arr[bestL+i] == 0)
	           System.out.println(bestL+i);
	    }
	}

	public static void main(String[] args){
		int arr[] = {1, 1, 0, 1, 1, 0, 0, 1, 1, 1,1,1};
		int left[] = new int[arr.length + 1];
		int right[] = new int[arr.length + 1];
		int indexs[] = new int[arr.length + 1];
		findZeroes(arr,arr.length,2);
		
		/*Arrays.fill(left, -1);
		Arrays.fill(right,-1);
		Arrays.fill(indexs, -1);

		int leftCount = 0;
		int rightCount = 0;
		for(int i=0;i<arr.length; ){
			if(arr[i] == 0){
				//leftCount
				leftCount = 0;
				rightCount = 0;
				for(int j = i-1 ; j>=0; j--){
					if(arr[j] == 1)
						leftCount++;
					if(arr[j] == 0){
						break;
					}
				}
				left[i] = leftCount;
				int j = i+1;
				for(; j<arr.length; j++){
					if(arr[j] == 1)
						rightCount++;
					if(arr[j] == 0){
						break;
					}
				}
				right[i] = rightCount;
				i = j;
				continue;
				//add index
			}
			i++;
		}

		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));*/
	}
}