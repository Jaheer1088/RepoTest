package strings;

public class DoubleLetters {
	
	public static boolean doubbleLetters(String s) {
		
		boolean isDoubleLettered = false;
		
		for(int i =0;i<s.length()-1;i++) {
			
			if(s.charAt(i)==s.charAt(i+1)) {
				
				
				isDoubleLettered = true;
				
				break;
			}
		}
		
		return isDoubleLettered;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(doubbleLetters("orange"));
	}

}
