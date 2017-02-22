package WeekOfCode29;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BigSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger[] unsorted = new BigInteger[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
           unsorted[unsorted_i] = new BigInteger(in.next());
        }
        Arrays.sort(unsorted);
        for(int i=0;i<n;i++){
            System.out.println(unsorted[i]);
        }
        in.close();
        // your code goes here
    }
}
