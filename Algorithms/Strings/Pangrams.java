package Algorithms.Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 * 
 * @author goutham
 * 
 Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet at least once.)

After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.

Given a sentence , tell Roy if it is a pangram or not.

Input Format

Input consists of a string .

Constraints 
Length of  can be at most   and it may contain spaces, lower case and upper case letters. Lower-case and upper-case instances of a letter are considered the same.

Output Format

Output a line containing pangram if  is a pangram, otherwise output not pangram.

Sample Input

Input #1

We promptly judged antique ivory buckles for the next prize    
Input #2

We promptly judged antique ivory buckles for the prize    
Sample Output

Output #1

pangram
Output #2

not pangram
Explanation

In the first test case, the answer is pangram because the sentence contains all the letters of the English alphabet.
 *
 */
public class Pangrams {
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
	/*	char a = 'a';
		char z = 'z';
		char A = 'A';
		char Z = 'Z';
		
		System.out.println(((int)a));
		System.out.println(((int)z));
		System.out.println(((int)A));
		System.out.println(((int)Z));*/
		String str = scan.nextLine();
		str = str.toUpperCase();
		Set<Character> chars = new HashSet<>();
		for(int index =0 ; index < str.length(); index++){
			char ch = str.charAt(index);
			int ascii = (int)ch;
			if((ascii>=97 && ascii<=122)||(ascii>=65 && ascii<=90) )
				chars.add(ch);
		}
		System.out.println(chars.size()==26?"pangram":"not pangram");
	}
}
