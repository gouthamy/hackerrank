package crackingTheCodingInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTablesRansomNote {

	    Map<String, Integer> magazineMap;
	    Map<String, Integer> noteMap;
	    
	    public HashTablesRansomNote(String magazine, String note) {
	        magazineMap = new HashMap<>();
	        noteMap = new HashMap<>();
	        for(String s : magazine.split(" ")){
	        	if(magazineMap.containsKey(s)){
	        		magazineMap.put(s,magazineMap.get(s)+1);
	        	}
	        	magazineMap.put(s,1);
	        }
	        for(String s : note.split(" ")){
	        	if(noteMap.containsKey(s)){
	        		noteMap.put(s,noteMap.get(s)+1);
	        	}
	        	noteMap.put(s,1);
	        }
	    }
	    
	    public boolean solve() {
	      
	    	boolean isValid = false;
	    	for(String s : noteMap.keySet()){
	    		if(magazineMap.containsKey(s)){
	    			if(magazineMap.get(s) != noteMap.get(s)){
	    				isValid =  false;
	    				break;
	    			}else
	    				isValid = true;
	    		}else{
	    			isValid = false;
	    			break;
	    		}
	    	}
	    	return isValid;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int m = scanner.nextInt();
	        int n = scanner.nextInt();
	        
	        // Eat whitespace to beginning of next line
	        scanner.nextLine();
	        
	        HashTablesRansomNote s = new HashTablesRansomNote(scanner.nextLine(), scanner.nextLine());
	        scanner.close();
	        
	        boolean answer = s.solve();
	        if(answer)
	            System.out.println("Yes");
	        else System.out.println("No");
	      
	    }

}
