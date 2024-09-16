package strings;

public class RepeatingLeetters {

	public static void main(String[] args) {
	
		
		String s = "1234!_ ";
		
		String res = "";
		
		for(int i =0;i<s.length();i++) {
			res += String.valueOf(s.charAt(i))+String.valueOf(s.charAt(i));
		}
		
		System.out.println(res);

	}

}
