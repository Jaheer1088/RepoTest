package strings;

public class VowelReplacer {

	public static void main(String[] args) {
		
		String s = "minnie mouse";
		String res = "";
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
          if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
				
        	  res +='?';
			
			}else {
				res+=ch;
			}
		}
		
		System.out.println(res);

	}

}
