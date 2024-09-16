package strings;

public class RemoveVowelsInString {
	
	public static String removeVowels(String in) {
		
		String res = "";
		
		for(int i=0;i<in.length();i++) {
			char ch = in.charAt(i);
			if(!(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
				
				res+=in.charAt(i);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		System.out.println(removeVowels("I have never seen a thin person drinking Diet Coke."));
	}

}
