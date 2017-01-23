package WeekOfCode28;

import java.util.Scanner;

public class Lucky {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		int count = 0;

		for(int startIndex = 0;startIndex< str.length();startIndex++){
			for(int endIndex = startIndex+1; endIndex<= str.length();endIndex++){
				String s = str.substring(startIndex,endIndex);
				System.out.println(s);
				if(s.length()>=4){
					String sub = s.substring(s.length()-3, s.length());
					System.out.println(s+" -- "+sub);
					if(Integer.valueOf(sub) % 8 == 0){
						count++;
					}
				}else{
					if(Long.valueOf(s) % 8 == 0){
						count++;
					}
				}
			}
		}
		System.out.println(count+" count");

	}
}
