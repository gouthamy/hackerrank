package HourRank15;

import java.util.Scanner;

public class CatsAndMouse {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for(int i=0;i<q;i++){
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			
			int A_C = A > C?A -C:C-A;
			int B_C = B > C?B -C:C-B;
			
			if(A_C > B_C){
				System.out.println("Cat B");
			}else if(B_C > A_C){
				System.out.println("Cat A");
			}else{
				System.out.println("Mouse C");
			}
		}
	}

}
