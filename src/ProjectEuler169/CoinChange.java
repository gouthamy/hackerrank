package ProjectEuler169;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {

	public static int dynamic(Integer[] v, int amount) {
		int[][] solution = new int[v.length + 1][amount + 1];

		// if amount=0 then just return empty set to make the change
		for (int i = 0; i <= v.length; i++) {
			solution[i][0] = 1;
		}

		// if no coins given, 0 ways to change the amount
		for (int i = 1; i <= amount; i++) {
			solution[0][i] = 0;
		}

		// now fill rest of the matrix.

		for (int i = 1; i <= v.length; i++) {
			for (int j = 1; j <= amount; j++) {
				// check if the coin value is less than the amount needed
				if (v[i - 1] <= j) {
					// reduce the amount by coin value and
					// use the subproblem solution (amount-v[i]) and
					// add the solution from the top to it
					solution[i][j] = solution[i - 1][j]
							+ solution[i][j - v[i - 1]];
				} else {
					// just copy the value from the top
					solution[i][j] = solution[i - 1][j];
				}
			}
		}
		System.out.println(Arrays.deepToString(solution));
		return solution[v.length][amount];
	}
	 
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//long n = scan.nextInt();
		long n = 10 ;
		ArrayList<Integer> lst = new ArrayList();
		lst.add(1);
		for(long i = 2;Math.pow(2, i)<n;i++){
			lst.add(new Double(Math.pow(2,i)).intValue());
		}

		Integer[] is = new Integer[lst.size()];
	
		is = lst.toArray(is);
		
		System.out.println(dynamic(is,(int)n));
		
	}
}
