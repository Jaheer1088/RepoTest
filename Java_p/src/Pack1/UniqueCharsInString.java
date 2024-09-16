package Pack1;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharsInString {
	
	
	public static void uniqueCharCount(String s) {
		
		int count =0;
		
		Set<Character> ch = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			
			if(ch.add(s.charAt(i))) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
	
	public static void main(String[] args) {
		
		String input = "apples";
		uniqueCharCount(input);
	}

}
