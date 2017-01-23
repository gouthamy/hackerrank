package WeekOfCode27;

import java.util.Scanner;

public class HowManySubstrings {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int q = in.nextInt();
	        String s = in.next();
	        for(int a0 = 0; a0 < q; a0++){
	            int left = in.nextInt();
	            int right = in.nextInt();
	            // your code goes here
	            if(left == right){
	            	System.out.println(1);
	            	continue;
	            }
	        }
	    }
}
