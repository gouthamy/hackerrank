package Algorithms.Implementation;

import java.util.Scanner;

public class BeautifulTriplets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int diff = scan.nextInt();
		
		int[] ar = new int[N];
		
		for(int i=0; i<N; i++){
			ar[i] = scan.nextInt();
		}
		int count = 0;
		outer : for(int i =0; i < N-2 ;i++){
			for(int j=i+1; j < N-1; j++){
				if(ar[j] - ar[i] == 3){
					for(int k = j+1; k < N;k++){
						if(ar[k] - ar[j] == 3){
							count++;
							continue outer;
						}
					}
				}
			}
		}
		
		System.out.println(count);

	}
	


}
