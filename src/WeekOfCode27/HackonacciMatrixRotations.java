package WeekOfCode27;

import java.util.Scanner;

public class HackonacciMatrixRotations {
	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();*/
		int n = 4;
		int[] hacki = new int[n*n];
		
		
		/*for(int a0 = 0; a0 < q; a0++){
			int angle = in.nextInt();
			// your code goes here
			int agCount = angle/90;

			if(agCount%2==0){

			}else{

			}


			char[][] arr = new char[n][n];

			int i,j;
			for(int x = 0 ; x <n ;x++){
				for(int y =0; y<n ;y++){
					i = x+1;
					j = y+1;
					//findind i,j is even or odd
					arr[x][y] = hackonacci((i*j)*(i*j))%2==0?'X':'Y';
				}
			}

			for(int x = 0 ; x <n ;x++){
				for(int y =0; y<n ;y++){
					System.out.print(arr[x][y]+" "); 
				}
				System.out.println();
			}

		}*/
		
		System.out.println(hackonacci(4));
		System.out.println(hackonacci(5));
		System.out.println(hackonacci(81));
	}
	public static int h(int[] hacki, int n){
		
		
		
		return 0;
	}

	public static int hackonacci(int n){
		
		if(n == 1)return 1;
		if(n == 2)return 2;
		if(n == 3)return 3;
		int res = 0;
		for(int i = 1 ;i < 4; i++){
			res += i * hackonacci(n -i);
		}
		System.out.println(res);
		return res;
	}
}
