package crackingTheCodingInterview;

import java.util.Scanner;

public class DPCoinChange {

	
	//using dynamic programming
	public static long makeChange(int[] coins, int money, int index) {
		if(money == 0)
			return 1;
		if(index >= coins.length)
			return 0;
		int amountWithCoin = 0;
		long ways = 0;
		while(amountWithCoin <= money){
			int rem = money - amountWithCoin;
			ways += makeChange(coins, rem, index + 1);
			amountWithCoin += coins[index];
		}
		return ways;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int coins[] = new int[m];
		for(int coins_i=0; coins_i < m; coins_i++){
			coins[coins_i] = in.nextInt();
		}
		System.out.println(makeChange(coins, n, 0));
	}

}
