package WeekOfCode28;

import java.util.Scanner;

public class TheGreatXOR {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            long x = in.nextLong();
	            // your code goes here
	            
	            int count = 0;
	            for(int i = 1; i<x;i++){
	            	long v = i ^ x;
	            	System.out.println(i+" - "+v);
	            	if(v > x){
	            		count++;
	            	}
	            }
	            System.out.println(count);
	        }
	    }
}
