package Pack1;

public class ReplacingCharInString {
	
	public static void repaveChar(String s) {
		
		char replace = 'b';
		
		System.out.println(s.replace('a', replace));
	}

	
	
	  public static void main(String[] args) {
		
		  String s ="alpha";
		  ReplacingCharInString.repaveChar(s);
	}
	
	
}
