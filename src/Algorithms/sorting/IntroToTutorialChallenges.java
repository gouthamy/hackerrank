package Algorithms.sorting;

import java.util.Scanner;

public class IntroToTutorialChallenges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int searchElement = scan.nextInt();
		int N = scan.nextInt();
		int arr[] = new int[N];
		int s_i = 0;
		for(int index = 0; index < N; index++){
			arr[index] = scan.nextInt();
			if(searchElement == arr[index]){
				s_i = index;
			}
		}
		System.out.println(s_i);

	}

}
