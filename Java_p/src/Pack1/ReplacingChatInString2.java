package Pack1;

import java.util.Arrays;

public class ReplacingChatInString2 {
	
	public static void replaceChar(String s) {
		String res="";
		char ch1 = 'a';
		char ch2 = 'p';
		char [] ch =s.toCharArray();
		for(int i =0;i<ch.length;i++) {
//			if(ch[i]==ch1) {
//				ch[i]=ch2;
//				res+=ch[i];
//				continue;
//			}
//			
//			if(ch[i]==ch2) {
//				ch[i]=ch1;
//				res+=ch[i];
//				continue;
//			}
//			
//			res+=ch[i];
			
			if(ch[i]==ch1) {
				ch[i]=ch2;
				res+=ch[i];
			}else if (ch[i]==ch2) {
				ch[i]=ch1;
				res+=ch[i];
			}else {
				res+=ch[i];
			}
		}
		
		System.out.println(res);
		
		
	}
	
	
	public static void main(String[] args) {
		String s = "apples";
		replaceChar(s);
	}

}
