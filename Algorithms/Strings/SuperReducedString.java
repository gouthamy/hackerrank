package Algorithms.Strings;
import java.util.Scanner;



public class SuperReducedString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner scan = new Scanner(System.in);
    	StringBuffer sb = new StringBuffer(scan.nextLine());
    	
    	for(int i=1; i< sb.length(); i++){
    		if(sb.charAt(i) == sb.charAt(i-1)){
    			sb.delete(i-1,i+1);
    			i = 0;
    		}
    	}
    	System.out.println(sb.length()==0?"Empty String":sb);
    	
    }
}