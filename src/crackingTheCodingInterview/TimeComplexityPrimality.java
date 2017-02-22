package crackingTheCodingInterview;

import java.util.Scanner;

public class TimeComplexityPrimality {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int p = in.nextInt();
	        for(int a0 = 0; a0 < p; a0++){
	            int n = in.nextInt();
	            boolean isPrime = true;
	            for(int i=2;i<Math.sqrt(n);i++){
	            	if(n%i==0){
	            		isPrime = false;
	            		break;
	            	}
	            }
	            System.out.println(isPrime?"Prime":"Not prime");
	        }
	    }
}
