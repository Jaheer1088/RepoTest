package Pack1;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {
	
	public static boolean isAnagram(String s,String s1) {
		
		boolean isAnagram = true;
		
	char [] c =	s.toCharArray();
	char [] c1 = s1.toCharArray();
		
		if(s.length()!=s1.length()) {
			 isAnagram = false;
			 return isAnagram;
		}
		
	Arrays.sort(c);
	Arrays.sort(c1);
	
	for(int i =0;i<c.length;i++) {
		if(c[i]!=c1[i]) {
			isAnagram = false;
			return isAnagram;
		}
	}
		return isAnagram;
	}
	
	public static void main(String[] args) {
		
		String s = "ABCd";
		String s1 = "BCA";
		boolean t = Anagram.isAnagram(s, s1);
		
		String text = t ? "yes" : "No";
		System.out.println(text);
		
	}

}
