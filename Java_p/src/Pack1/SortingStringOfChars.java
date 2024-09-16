package Pack1;

import java.util.Arrays;

public class SortingStringOfChars {

	public static void main(String[] args) {
		
		String s = "prepbytes";
		String res="";
		char [] ch = s.toCharArray();
		
		Arrays.sort(ch);
		
		for(int i=0;i<ch.length;i++) {
			res+=ch[i];
		}
		System.out.println(res);

	}

}
