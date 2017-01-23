package WeekOfCode27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TailorShop {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		int[] a = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		Arrays.sort(a);
		int previousButton = 0;
		int total = 0;
		for(int i = 0; i < n ;i++){
			int curr = getButtons(a[i],p);
			if(i==0){
				previousButton = curr;
				total += curr;	
				continue;
			}
			if(previousButton >= curr){
				curr =previousButton+1;
				previousButton = curr;
			}else{
				previousButton = curr;
			}
			total += curr;	
		}
		System.out.println(total);
	}


	public static int getButtons(int mini, int p){
		int button = mini/p;
		if(button*p >= mini)
			return button;
		else
			return button+1;

	}
}
