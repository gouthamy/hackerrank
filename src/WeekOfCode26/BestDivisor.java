package WeekOfCode26;

import java.util.Scanner;

public class BestDivisor {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int maxCount = 0;
		int num1 = 0;
		int num2 = 0;
		
		for(int i = 1; i<=n;i++){
			if(n%i == 0){
				int count = 0;
				int num = i;
				while(num > 0){
					count += num%10;
					num /=10;
				}
				if(count > maxCount){
					maxCount = count;
					num1 = i;
				}
			}
		}
		System.out.println(num1);
		
		
	}

}
