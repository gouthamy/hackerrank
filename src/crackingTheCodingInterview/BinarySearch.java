package crackingTheCodingInterview;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};

		//naive approach or brute force algorithm
		//navigate and O(n)
		int searchElement = 3;
		int foundIndex = -1;
		for(int index = 0; index < arr.length; index++){
			if(arr[index] == searchElement){
				foundIndex = index;
				break;
			}
		}
		System.out.println(binarySearch(arr,searchElement));

		//we can do this by divide and conquere approach
		//divide the array


		/*for(int index = 1; index < arr.length - 1; index++){
			if(arr[index - 1] < arr[index] && arr[index + 1] < arr[index]){
				System.out.println(arr[index]);
				break;
			}
		}*/

		//	int index = findBinary(arr);
		//System.out.println(index);

	}

	public static int binarySearch(int[] arr, int search){
		return binarySearch(arr, 0, arr.length-1, search);
	}

	private static int binarySearch(int[] arr, int start, int end, int search) {

		if(end < start){
			return -1;
		}
		int mid = (start + end)/2;

		//search is in left side
		if(search < arr[mid]){
			return binarySearch(arr, start, mid, search);
		}//serach is in right side
		else if(search > arr[mid]){
			return binarySearch(arr, mid+1, end, search);
		}//we found the element
		else{
			//return mid;
			return mid;
		}
	}

	/*private static int findBinary(int[] ar) {

		int start = 0;
		int end = ar.length - 1;

		findIndex(ar, 0 , ar.length - 1);

		//	int mid = (start + end



		return index;
	}

	private static int index =- 1;
	private static void findIndex(int[] arr, int start, int end){
		System.out.println("Start : "+start+ " End : "+end);
		if(start <= end){
			int mid = (start + end)/2;
			findIndex(arr, start, mid);
			findIndex(arr, mid+1, end);

			if(arr[mid] < arr[mid -1] && arr[mid] < arr[mid+1]){
				index = mid;
				return;
			}
			if(arr[mid] > arr[mid -1] && arr[mid] > arr[mid+1]){
				index = mid;
				return;
			}

		}else{
			return;
		}

	}*/

}
