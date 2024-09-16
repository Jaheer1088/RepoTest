package Pack1;

public class ReversingStringStatement {
	
	public static String reverseStatement(String s) {
		
		String output = "";
		
		String [] s1 = s.split("\s");
		
		for(int i=s1.length-1;i>=0;i--) {
			
			output+=s1[i]+" ";
		}
		
		return output;
	}
	
	
	public static void main(String[] args) {
		
		String input = "I'm not good";
		System.out.println(reverseStatement(input));
	}

}
