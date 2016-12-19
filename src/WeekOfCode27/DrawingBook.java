package WeekOfCode27;

import java.util.Scanner;

public class DrawingBook {
	public static int turnedPages(int totalPages, int page){
		if(page == 1 || page == totalPages){
			return 0;
		}
		if((totalPages % 2 !=0) && (page == totalPages-1)){
			return 0;
		}
		page = page%2 == 0 ?page+1:page;
		totalPages = totalPages%2 == 0 ?totalPages+1:totalPages;
		int start = page/2;
		int end = (totalPages - page)/2;
		return start>end?end:start;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		System.out.println(turnedPages(n,p));			

	}
}
