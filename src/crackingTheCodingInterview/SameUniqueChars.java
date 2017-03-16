package crackingTheCodingInterview;

public class SameUniqueChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "May student students dog studentssess god Cat act tab bat flow wolf lambs Amy Yam balms looped poodle john alice ";

		System.out.println(uniqueChars("may","amys"));
	}
	
	public static boolean uniqueChars(String str1, String str2){
		
		
		boolean[] charSet = new boolean[26];
		
		for(int i = 0; i < str1.length(); i++){
			charSet[str1.charAt(i) - 'a'] = true;
		}
		
		for(int i = 0; i < str2.length(); i++){
			if(!charSet[str2.charAt(i) - 'a']){
				return false;
			}
			charSet[str2.charAt(i)-'a'] = true;
		}
		
		return true;
	}

}
