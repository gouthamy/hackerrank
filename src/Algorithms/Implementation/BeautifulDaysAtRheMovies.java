package Algorithms.Implementation;

import java.util.Scanner;

public class BeautifulDaysAtRheMovies {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();
		int beautifulDays = 0;
		for(int day = i; day<=j ; day++){
			if((day-reverse(day))  %k == 0){
				beautifulDays++;
			}
		}
		System.out.println(beautifulDays);
	}
	
	
	private static int reverse(int num){
		int rev = 0;
		int rem = 0;
		while(num  > 0){
			rem = num % 10;
			rev = rev*10 + rem;
			num = num/10;
		}
		return rev;
	}

}
