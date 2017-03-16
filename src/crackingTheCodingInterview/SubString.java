package crackingTheCodingInterview;

import java.util.LinkedList;
import java.util.List;

public class SubString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABC";
		System.out.println(subString(str));

	}


	static public List<String> subString(String str){
		
		List<String> lst = new LinkedList<>();

		outer : for(int outer_index = 0; outer_index < str.length(); outer_index++){
			int start_index = str.charAt(outer_index);
			for(int inner_index = outer_index+1; inner_index < str.length(); inner_index++){
				if(start_index < str.charAt(inner_index)){
					lst.add(str.substring(outer_index, inner_index + 1));
					start_index = str.charAt(inner_index);
				}else{
					continue outer;
				}
			}
		}
		return lst;
	}

}
