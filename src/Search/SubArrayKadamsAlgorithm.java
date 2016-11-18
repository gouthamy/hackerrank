package Algorithms.Search;

public class SubArrayKadamsAlgorithm {

	public static void main(String[] args){
		int[] arr = {-1,-2,8,2,-2,-9,10};

		System.out.println(maxSubArray(arr));

	}

	private static int maxSubArray(int[] arr) {
		int cur_sub = arr[0];
		int max_sum = arr[0];

		for(int i=1; i < arr.length ; i++){
			System.out.println("arr[i] "+arr[i]+" curr_sub "+cur_sub+"cur_sub + arr[i] "+(cur_sub + arr[i]) );
			cur_sub = max(arr[i], cur_sub + arr[i]);
			System.out.println("cur "+cur_sub);
			max_sum = max(cur_sub, max_sum);
			System.out.println(max_sum);
		}


		return max_sum;
	}

	private static int max(int c1, int c2){
		return c1>c2?c1:c2;
	}
}
