package WeekofCode30;

import java.util.Scanner;


/*
 * min(int, min(int, min(int, int)))

 */
public class FindTheMinimumNumber {

	static String MIN_CONSTANT = "min(int, ?)";
	static String MIN_RESULT;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		getMinFunction(n);
		System.out.println(MIN_RESULT);
	}


	private static void getMinFunction(int args){

		if(args == 2){
			if(MIN_RESULT == null){
				MIN_RESULT = "min(int, int)";
			}else{
				MIN_RESULT = MIN_RESULT.replace("?", "min(int, int)");
			}
		}else{
			if(MIN_RESULT != null){
				MIN_RESULT = MIN_RESULT.replace("?", MIN_CONSTANT);
			}else{
				MIN_RESULT =  MIN_CONSTANT;
			}
			getMinFunction(args-1);
		}

	}

}
