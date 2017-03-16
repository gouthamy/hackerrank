package crackingTheCodingInterview;

import java.util.Arrays;

public class MaxConsecutiveRepeatedLetter {

	/**
	 * @param args
	 * 
	 * A = "ffgggtvshjsdhjfffffffhvjbjcharu" 
		Find the max consecutive repitative chracter 
		Output : f -> 7
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ffgggtvshjsdhjfffffffhvjbjcharudddddddd";
		
		int[] charSet = new int[26];
		
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			charSet[c-'a']++;
		}
		System.out.println(Arrays.toString(charSet));
		System.out.println(maxConsecutiveLetters(str));
	}
	
	
	public static int maxConsecutiveLetters(String str){
		if(str== null || str.isEmpty())return 0;
		int maxCount = 0;
		int currentCount = 1;
		int previousChar = str.charAt(0);
		run : for(int index = 1; index < str.length(); index++){
			if(str.charAt(index) == previousChar){
				currentCount++;
				maxCount = maxCount>currentCount ? maxCount : currentCount;
				continue run;
			}else{
				currentCount = 1;
				previousChar = str.charAt(index);
			}
		}
		return maxCount;
	}

}
