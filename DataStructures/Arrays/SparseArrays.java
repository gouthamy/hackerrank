package datastructures.arryas;

import java.util.Scanner;


/**
 * 
 * @author goutham
 *
 *There are  strings. Each string's length is no more than  characters. There are also  queries. For each query, you are given a string, and you need to find out how many times this string occurred previously.

Input Format

The first line contains , the number of strings.
The next  lines each contain a string.
The nd line contains , the number of queries.
The following  lines each contain a query string.

Constraints

 
 
    

Sample Input

4
aba
baba
aba
xzxb
3
aba
xzxb
ab
Sample Output

2
1
0
Explanation

Here, "aba" occurs twice, in the first and third string. The string "xzxb" occurs once in the fourth string, and "ab" does not occur at all.
 */
public class SparseArrays {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	        int size = scan.nextInt();
	        String[] strs = new String[size];

	        for(int i=0;i<size;i++){
		       strs[i] = scan.next();
	        }

	        int quries = scan.nextInt();
	        for(int i=0;i<size;i++){
		       String str = scan.next();
		       int count =0;
		       for(int j=0;j<size;j++){
			      if(str.equals(strs[j]))
				     count++;
		       }
		       System.out.println(count);
	        }
		
	    }
}
