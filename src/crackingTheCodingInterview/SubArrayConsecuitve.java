package crackingTheCodingInterview;

public class SubArrayConsecuitve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,9};
		
		int inclusive = arr[0];
		int exclusive = 0;
		
		for(int i=1; i < arr.length; i++){
			int tem = inclusive;
			inclusive = Math.max(arr[i],arr[i] + exclusive);
			exclusive = tem;
		}
		System.out.println(Math.max(inclusive, exclusive));
	}

}
