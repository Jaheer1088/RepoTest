package strings;

public class NoBodyKnows {

	public static boolean getXO(String s) {
		
		boolean isXO = false;
		
		int xCount = 0;
		int oCount = 0;
		String newString = s.toLowerCase();
		for(int i =0;i<newString.length();i++) {
			
			if(newString.charAt(i)=='x') {
				
				xCount++;	
			}else if(newString.charAt(i)=='o') {
				oCount++;
			}
		}
		
		if(xCount==oCount) {
			isXO = true;
		}
		
		return isXO;
	}
	
	public static void main(String[] args) {
		
		String input = "zzoo";
		
		System.out.println(getXO(input));
	}
}
