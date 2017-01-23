package Algorithms.Implementation;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		int length = text.length();
		int row=0,col=0;
		for(int i=1;i<length;i++){
			double rd = (double)length/i;
			int rr  = (int)Math.ceil(rd);
			row = rr;
			if((row*i)>length){
				if(row<i){
					col = i;
					break;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		char[][] ch = new char[row][col];
		int in = 0;
		for(int r = 0; r<row;r++){
			for(int c=0;c<col;c++){
				if(in<text.length()){
					ch[r][c] = text.charAt(in);
				}
				in++;
			}
		}
		int r=0,c=0;
		for(;c<col;){
			for(;r<row;){
				sb.append(ch[r][c]);
				r++;
			}
			sb.append(" ");
			c++;
			r=0;
		}
		
		System.out.println(sb.toString().trim());


	}
}
