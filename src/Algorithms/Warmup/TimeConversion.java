package Algorithms.Warmup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
		String time = in.next();
		DateFormat dateFormatIn = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat dateFormatOut = new SimpleDateFormat("hh:mm:ssaa");
		
		Date date = dateFormatIn.parse(time);
		System.out.println(dateFormatOut.format(date));
	}

}
