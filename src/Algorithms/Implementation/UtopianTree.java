package Algorithms.Implementation;

import java.util.Scanner;

public class UtopianTree {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int a0 = 0; a0 < t; a0++){
			int n = in.nextInt();
			int height = 1;
			boolean isSpring = true;
			for(int cycle=1; cycle <= n; cycle++){
				if(isSpring){
					height = spring(height);
					isSpring = false;
				}else{
					height = summer(height);
					isSpring = true;
				}
			}
			System.out.println(height);

		}
	}

	private static int spring(int initialHeight){
		return initialHeight+initialHeight;
	}

	private static int summer(int initialHeight){
		return initialHeight+1;
	}
}
