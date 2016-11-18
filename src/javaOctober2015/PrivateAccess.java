package CodeWhiz.javaOctober2015;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;


public class PrivateAccess {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine().trim());
		

		PrivateAccess access = new PrivateAccess();
		Object o = access.new Private();
		
		
		System.out.println("dfa "+(num&num));		
		System.out.println("An instance of class: "+o.getClass().getSimpleName()+" has been created");
	}//end of main
	class Private
	{
		private String powerof2(int num)
		{
			return ((num&num-1)==0)?"power of 2":"not a power of 2";
		}
	}//end of Privtate
}//end of solution
