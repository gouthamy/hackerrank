package crackingTheCodingInterview;

public class FlipZero {

public static void main(String[] args) {
		
		//System.out.println(countMax("10011101111"));
		System.out.println(getFlipIndex("10111101101011101"));
	}
	
	
	static int getFlipIndex(String inp) {
		
		int len = inp.length();
		int max = 0;
		int index = 0;
		for(int i=0;i<len;i++) {
			
			if(inp.charAt(i) == '0'){
				
				int localMax = countMax(inp.substring(0, i)+"1"+inp.substring(i,len));
				if(localMax > max) {
					
					max = localMax;
					index = i;
				}
			}
		}
		
		
		
		return index+1;
	}
	static int countMax(String inp) {
		
		if(inp==null || inp.isEmpty())
			return -1;
		
		int len =  inp.length();
		int count = 0;
		for(int i=0;i<len;i++) {
			
			if(inp.charAt(i)=='1') {
				
				int localCount = 1;
				for(int j=i+1;j<len;j++) {
					
					if(inp.charAt(j)=='1')
						localCount++;
					else
						break;
					
				}
				
				if(localCount>count)
					count = localCount;
			}
		}
		
		return count;
	}

}