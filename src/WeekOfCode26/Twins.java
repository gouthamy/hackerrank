package WeekOfCode26;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 
 * 
 Lia is fascinated by anything she considers to be a twin. She calls a pairs of positive integers,  and , twins if:

They are both prime. A prime number is an integer greater than  that has no positive divisors other than  and itself.

Their absolute difference is exactly equal to  (i.e., ).

Given an inclusive interval of integers from  to , can you help Lia find the number of pairs of twins there are in the interval (i.e., )? Note that pairs  and  are considered to be the same pair.

Input Format

Two space-separated integers describing the respective values of  and .

Constraints

Output Format

Print a single integer denoting the number of pairs of twins.

Sample Input 0

3 13
Sample Output 0

3
Explanation 0

There are three pairs of twins: , and .
 * @author gyenuganti
 *
 */
public class Twins {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		assert(1 <= n && n <= m && m <= 1000000000);
	    assert(m - n <= 1000000);
		boolean isPrime = false;
		boolean isPreviousPrimeExists = false;
		int pairCount = 0;
		int currentPrime = 0;
		int previousPrime = 0;
		for(int i=n;i<=m;i++){
			//finding the number is prime are not
			isPrime = true;
			for(int div = 2;div<=Math.sqrt(i);div++){
				if(i%div==0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				if(!isPreviousPrimeExists){
					previousPrime = i;
					isPreviousPrimeExists = true;
				}else{
					currentPrime = i;
					if(currentPrime - previousPrime  == 2){
						pairCount++;
					}
					previousPrime = i;
				}
			}

		}

		System.out.println(pairCount);
		int MAXN = 1000000 + 100;

		int l=n, r=m;
		boolean isPrimes[] = new boolean[MAXN];
		
		for(int i = 0; i <= r - l; i++)
	        isPrimes[i] = true;
	    for(int i = 2; i * i <= r; i++) {
	        int startPos = l / i * i;
	        if (startPos < l)
	            startPos += i;
	        if (startPos == i)
	            startPos += i;
	        for(int j = startPos; j <= r; j += i)
	            isPrimes[j - l] = false;
	    }

	   System.out.println(Arrays.toString(isPrimes));

	    
	}

}
