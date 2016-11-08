package Algorithms.Strings;

import java.util.Scanner;

/**
 * 
 * @author goutham
 *
 Alice wrote a sequence of words in CamelCase as a string of letters, , having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given , print the number of words in  on a new line.

Input Format

A single line containing string .

Constraints

Output Format

Print the number of words in string .

Sample Input

saveChangesInTheEditor
Sample Output

5
Explanation

String  contains five words:

save
Changes
In
The
Editor
Thus, we print  on a new line.

Need help? Try this problem first to get familiar with HackerRank environment.
 */
public class CamelCase {
	//char c = 'A'; //65
    //char z = 'Z'; //90
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String s = in.next();
        String s = "saveChangesInTheEditor";
        int noOfWords = s.length()==0?0:1;
        for(int index = 0; index < s.length(); index++){
        	int ascii = s.charAt(index);
        	if(ascii >= 65 && ascii <= 90){
        		noOfWords++;
        	}
        }
        
        System.out.println(noOfWords);
        	
    }

}
