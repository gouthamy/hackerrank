package WeekOfCode28;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BoatTrips {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int m = in.nextInt();
        int[] p = new int[n];
        int maxTrans = 0;
        for(int p_i=0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
            if(p[p_i]>maxTrans){
            	maxTrans = p[p_i];
            }
        }
        int max = c*m;
      //  Arrays.sort(p);
        //int mm = p[p.length-1];
        
        if(maxTrans > max){
        	System.out.println("No");
        }else{
        	System.out.println("Yes");
        }
        
    }
}