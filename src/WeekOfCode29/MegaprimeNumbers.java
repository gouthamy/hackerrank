package WeekOfCode29;

import java.util.Scanner;

public class MegaprimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long first = in.nextLong();
        long last = in.nextLong();
        // your code goes here
        int count = 0;
        
        for(long i=first ;i<=last;i++){
        	if(isPrime(i)){
        		boolean isNumPrime = true;
        		if(i>=10){
        			long num = i;
        			long rem;
        			while(num>0){
        				rem = num %10;
        				if(!isPrime(rem)){
        					isNumPrime = false;
        				}
        				num = num/10;
        			}
        			
        			if(isNumPrime){
        				count++;
        			}
        		}else{
        			count++;
        		}
        	}
        }
        System.out.println(count);
    }
	
	public static boolean isPrime(long n){
		if(n==1)return false;
		if(n==2)return true;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}
